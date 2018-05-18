package heresy.controller.board;

import heresy.domain.board.BasicBoardArticle;
import heresy.repository.BasicBoardArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @basicBoardArticle updown
 * @date 2018. 2. 12.
 **/
@CrossOrigin(origins = "*")
@RestController
public class BasicBoardArticleController {

    private static final Logger logger = Logger.getLogger(BasicBoardArticleController.class.getName());

    @Autowired
    private BasicBoardArticleRepository basicBoardArticleRepository;


    @RequestMapping(value = "/selectBasicBoardArticle", method = RequestMethod.GET)
    public List<BasicBoardArticle> selectBasicBoardArticle() {
        logger.info("■■■■■■■■■■BasicBoardArticleController.selectBasicBoardArticle Start■■■■■■■■■■");
        List<BasicBoardArticle> basicBoardArticleList = basicBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardArticleController.selectBasicBoardArticle End■■■■■■■■■■■■");
        return basicBoardArticleList;
    }

    @RequestMapping(value = "/selectOneBasicBoardArticle", method = RequestMethod.POST)
    public BasicBoardArticle selectOneBasicBoardArticle(@RequestBody BasicBoardArticle basicBoardArticle) {
        logger.info("■■■■■■■■■■BasicBoardArticleController.selectOneBasicBoardArticle Start■■■■■■■■■■");
        int idx = basicBoardArticle.getIdx();
        BasicBoardArticle oneBasicBoardArticle = basicBoardArticleRepository.findOne(idx);
        logger.info("■■■■■■■■■■BasicBoardArticleController.selectOneBasicBoardArticle End■■■■■■■■■■■■");
        return oneBasicBoardArticle;
    }

    @RequestMapping(value = "/createBasicBoardArticle", method = RequestMethod.POST)
    public List<BasicBoardArticle> createBasicBoardArticle(@RequestBody BasicBoardArticle basicBoardArticle) {
        logger.info("■■■■■■■■■■BasicBoardArticleController.createBasicBoardArticle Start■■■■■■■■■■");
        System.out.println(basicBoardArticle);
        basicBoardArticleRepository.save(basicBoardArticle);
        List<BasicBoardArticle> basicBoardArticleList = basicBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardArticleController.createBasicBoardArticle End■■■■■■■■■■■■");
        return basicBoardArticleList;
    }

    @RequestMapping(value = "/updateBasicBoardArticle", method = RequestMethod.POST)
    public List<BasicBoardArticle> updateBasicBoardArticle(@RequestBody BasicBoardArticle basicBoardArticle) {
        logger.info("■■■■■■■■■■BasicBoardArticleController.updateBasicBoardArticle Start■■■■■■■■■■");
        System.out.println(basicBoardArticle);
        int idx = basicBoardArticle.getIdx();
        BasicBoardArticle findOneBasicBoardArticle = basicBoardArticleRepository.findOne(idx);
        findOneBasicBoardArticle.setIdx(basicBoardArticle.getIdx());
        findOneBasicBoardArticle.setTitle(basicBoardArticle.getTitle());
        basicBoardArticleRepository.save(findOneBasicBoardArticle);

        List<BasicBoardArticle> basicBoardArticleList = basicBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardArticleController.updateBasicBoardArticle End■■■■■■■■■■■■");
        return basicBoardArticleList;
    }

    @RequestMapping(value = "/deleteBasicBoardArticle", method = RequestMethod.POST)
    public List<BasicBoardArticle> deleteBasicBoardArticle(@RequestBody BasicBoardArticle basicBoardArticle) {
        logger.info("■■■■■■■■■■BasicBoardArticleController.deleteBasicBoardArticle Start■■■■■■■■■■");
        System.out.println(basicBoardArticle);
        int idx = basicBoardArticle.getIdx();
        basicBoardArticleRepository.delete(idx);

        List<BasicBoardArticle> basicBoardArticleList = basicBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardArticleController.deleteBasicBoardArticle End■■■■■■■■■■■■");
        return basicBoardArticleList;
    }
}
