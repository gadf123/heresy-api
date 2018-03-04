package heresy.controller.board.board;

import heresy.domain.board.AgendaAndDebateComment;
import heresy.repository.AgendaAndDebateCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * @basicBoardComment updown
 * @date 2018. 2. 12.
 **/

@RestController
public class AgendaBoardCommentController {

    private static final Logger logger = Logger.getLogger(AgendaBoardCommentController.class.getName());

    @Autowired
    private AgendaAndDebateCommentRepository agendaAndDebateCommentRepository;

    @RequestMapping(value = "/selectAgendaAndDebateComment", method = RequestMethod.GET)
    public List<AgendaAndDebateComment> basicBoardComment() {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.selectAgendaAndDebateComment Start■■■■■■■■■■");
        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.selectAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }

    @RequestMapping(value = "/createAgendaAndDebateComment", method = RequestMethod.POST)
    public List<AgendaAndDebateComment> createAgendaAndDebateComment(@RequestBody AgendaAndDebateComment basicBoardComment) {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.createAgendaAndDebateComment Start■■■■■■■■■■");
        System.out.println(basicBoardComment);
        agendaAndDebateCommentRepository.save(basicBoardComment);
        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.createAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }

    @RequestMapping(value = "/updateAgendaAndDebateComment", method = RequestMethod.POST)
    public List<AgendaAndDebateComment> updateAgendaAndDebateComment(@RequestBody AgendaAndDebateComment basicBoardComment) {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.updateAgendaAndDebateComment Start■■■■■■■■■■");
        System.out.println(basicBoardComment);
        int idx = basicBoardComment.getIdx();
        AgendaAndDebateComment findOneAgendaAndDebateComment = agendaAndDebateCommentRepository.findOne(idx);
        findOneAgendaAndDebateComment.setIdx(basicBoardComment.getIdx());
        findOneAgendaAndDebateComment.setComment(basicBoardComment.getComment());
        agendaAndDebateCommentRepository.save(findOneAgendaAndDebateComment);

        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.updateAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }

    @RequestMapping(value = "/deleteAgendaAndDebateComment", method = RequestMethod.POST)
    public List<AgendaAndDebateComment> deleteAgendaAndDebateComment(@RequestBody AgendaAndDebateComment basicBoardComment) {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.deleteAgendaAndDebateComment Start■■■■■■■■■■");
        System.out.println(basicBoardComment);
        int idx = basicBoardComment.getIdx();
        agendaAndDebateCommentRepository.delete(idx);

        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.deleteAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }
}
