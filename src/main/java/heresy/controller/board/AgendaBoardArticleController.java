package heresy.controller.board;

import heresy.domain.board.AgendaAndDebateBoardArticle;
import heresy.repository.AgendaAndDebateBoardArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * @basicBoardArticle updown
 * @date 2018. 2. 12.
 **/

@RestController
public class AgendaBoardArticleController {

    private static final Logger logger = Logger.getLogger(AgendaBoardArticleController.class.getName());

    @Autowired
    private AgendaAndDebateBoardArticleRepository agendaAndDebateBoardArticleRepository;

    @RequestMapping(value = "/selectAgendaBoardArticle", method = RequestMethod.GET)
    public List<AgendaAndDebateBoardArticle> selectAgendaBoardArticle() {
        logger.info("■■■■■■■■■■AgendaBoardArticleController.selectAgendaBoardArticle Start■■■■■■■■■■");
        List<AgendaAndDebateBoardArticle> AgendaAndDebateBoardArticleList = agendaAndDebateBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■AgendaBoardArticleController.selectAgendaBoardArticle End■■■■■■■■■■■■");
        return AgendaAndDebateBoardArticleList;
    }

    @RequestMapping(value = "/selectOneAgendaBoardArticle", method = RequestMethod.POST)
    public AgendaAndDebateBoardArticle selectOneAgendaBoardArticle(@RequestBody AgendaAndDebateBoardArticle agendaAndDebateBoardArticle) {
        int idx = agendaAndDebateBoardArticle.getIdx();
        logger.info("■■■■■■■■■■AgendaBoardArticleController.selectOneAgendaBoardArticle Start■■■■■■■■■■");
        AgendaAndDebateBoardArticle AgendaAndDebateBoardArticleList = agendaAndDebateBoardArticleRepository.findOne(idx);
        logger.info("■■■■■■■■■■AgendaBoardArticleController.selectOneAgendaBoardArticle End■■■■■■■■■■■■");
        return AgendaAndDebateBoardArticleList;
    }

    @RequestMapping(value = "/createAgendaBoardArticle", method = RequestMethod.POST)
    public List<AgendaAndDebateBoardArticle> createAgendaBoardArticle(@RequestBody AgendaAndDebateBoardArticle agendaAndDebateBoardArticle) {
        logger.info("■■■■■■■■■■AgendaBoardArticleController.createAgendaBoardArticle Start■■■■■■■■■■");
        System.out.println(agendaAndDebateBoardArticle);
        agendaAndDebateBoardArticleRepository.save(agendaAndDebateBoardArticle);
        List<AgendaAndDebateBoardArticle> AgendaAndDebateBoardArticleList = agendaAndDebateBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■AgendaBoardArticleController.createAgendaBoardArticle End■■■■■■■■■■■■");
        return AgendaAndDebateBoardArticleList;
    }

    @RequestMapping(value = "/updateAgendaBoardArticle", method = RequestMethod.POST)
    public List<AgendaAndDebateBoardArticle> updateAgendaBoardArticle(@RequestBody AgendaAndDebateBoardArticle agendaAndDebateBoardArticle) {
        logger.info("■■■■■■■■■■AgendaBoardArticleController.updateAgendaBoardArticle Start■■■■■■■■■■");
        System.out.println(agendaAndDebateBoardArticle);
        int idx = agendaAndDebateBoardArticle.getIdx();
        AgendaAndDebateBoardArticle findOneAgendaBoardArticle = agendaAndDebateBoardArticleRepository.findOne(idx);
        findOneAgendaBoardArticle.setIdx(agendaAndDebateBoardArticle.getIdx());
        findOneAgendaBoardArticle.setTitle(agendaAndDebateBoardArticle.getTitle());
        agendaAndDebateBoardArticleRepository.save(findOneAgendaBoardArticle);

        List<AgendaAndDebateBoardArticle> AgendaAndDebateBoardArticleList = agendaAndDebateBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■AgendaBoardArticleController.updateAgendaBoardArticle End■■■■■■■■■■■■");
        return AgendaAndDebateBoardArticleList;
    }

    @RequestMapping(value = "/deleteAgendaBoardArticle", method = RequestMethod.POST)
    public List<AgendaAndDebateBoardArticle> deleteAgendaBoardArticle(@RequestBody AgendaAndDebateBoardArticle agendaAndDebateBoardArticle) {
        logger.info("■■■■■■■■■■AgendaBoardArticleController.deleteAgendaBoardArticle Start■■■■■■■■■■");
        System.out.println(agendaAndDebateBoardArticle);
        int idx = agendaAndDebateBoardArticle.getIdx();
        agendaAndDebateBoardArticleRepository.delete(idx);

        List<AgendaAndDebateBoardArticle> AgendaAndDebateBoardArticleList = agendaAndDebateBoardArticleRepository.findAll();
        logger.info("■■■■■■■■■■AgendaBoardArticleController.deleteAgendaAndDebateBoardArticle End■■■■■■■■■■■■");
        return AgendaAndDebateBoardArticleList;
    }
}
