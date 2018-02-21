package heresy.controller.BulletinBoardArticle;

import heresy.controller.BulletinBoardArticle.BulletinBoardArticleController;
import heresy.domain.BulletinBoardArticle;
import heresy.repository.BulletinBoardArticleRepository;
import heresy.repository.BulletinBoardArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * @bulletinBoardArticle updown
 * @date 2018. 2. 12.
 **/

@RestController
public class BulletinBoardArticleController {

    private static final Logger logger = Logger.getLogger(BulletinBoardArticleController.class.getName());


    @Autowired
    private BulletinBoardArticleRepository bulletinBoardArticleRepository;

    @RequestMapping(value = "/selectBulletinBoardArticle", method = RequestMethod.GET)
    public List<BulletinBoardArticle> bulletinBoardArticle() {
        logger.info("■■■■■■■■■■BulletinBoardArticleController.selectBulletinBoardArticle Start■■■■■■■■■■");
        List<BulletinBoardArticle> bulletinBoardArticleList = bulletinBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BulletinBoardArticleController.selectBulletinBoardArticle End■■■■■■■■■■■■");
        return bulletinBoardArticleList;
    }

    @RequestMapping(value = "/createBulletinBoardArticle", method = RequestMethod.POST)
    public List<BulletinBoardArticle> createBulletinBoardArticle(@RequestBody BulletinBoardArticle bulletinBoardArticle) {
        logger.info("■■■■■■■■■■BulletinBoardArticleController.createBulletinBoardArticle Start■■■■■■■■■■");
        System.out.println(bulletinBoardArticle);
        bulletinBoardArticleRepository.save(bulletinBoardArticle);
        List<BulletinBoardArticle> bulletinBoardArticleList = bulletinBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BulletinBoardArticleController.createBulletinBoardArticle End■■■■■■■■■■■■");
        return bulletinBoardArticleList;
    }

    @RequestMapping(value = "/updateBulletinBoardArticle", method = RequestMethod.POST)
    public List<BulletinBoardArticle> updateBulletinBoardArticle(@RequestBody BulletinBoardArticle bulletinBoardArticle) {
        logger.info("■■■■■■■■■■BulletinBoardArticleController.updateBulletinBoardArticle Start■■■■■■■■■■");
        System.out.println(bulletinBoardArticle);
        Long idx = bulletinBoardArticle.getIdx();
        BulletinBoardArticle findOneBulletinBoardArticle = bulletinBoardArticleRepository.findOne(idx);
        findOneBulletinBoardArticle.setIdx(bulletinBoardArticle.getIdx());
        findOneBulletinBoardArticle.setSubject(bulletinBoardArticle.getSubject());
        bulletinBoardArticleRepository.save(findOneBulletinBoardArticle);

        List<BulletinBoardArticle> bulletinBoardArticleList = bulletinBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BulletinBoardArticleController.updateBulletinBoardArticle End■■■■■■■■■■■■");
        return bulletinBoardArticleList;
    }

    @RequestMapping(value = "/deleteBulletinBoardArticle", method = RequestMethod.POST)
    public List<BulletinBoardArticle> deleteBulletinBoardArticle(@RequestBody BulletinBoardArticle bulletinBoardArticle) {
        logger.info("■■■■■■■■■■BulletinBoardArticleController.deleteBulletinBoardArticle Start■■■■■■■■■■");
        System.out.println(bulletinBoardArticle);
        Long idx = bulletinBoardArticle.getIdx();
        bulletinBoardArticleRepository.delete(idx);

        List<BulletinBoardArticle> bulletinBoardArticleList = bulletinBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BulletinBoardArticleController.deleteBulletinBoardArticle End■■■■■■■■■■■■");
        return bulletinBoardArticleList;
    }
}
