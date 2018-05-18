package heresy.controller.board;

import heresy.domain.board.AgendaAndDebateComment;
import heresy.repository.AgendaAndDebateCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @basicBoardComment updown
 * @date 2018. 2. 12.
 **/

@CrossOrigin(origins = "*")
@RestController
public class AgendaBoardCommentController {

    private static final Logger logger = Logger.getLogger(AgendaBoardCommentController.class.getName());

    @Autowired
    private AgendaAndDebateCommentRepository agendaAndDebateCommentRepository;

    @RequestMapping(value = "/selectAgendaAndDebateComment", method = RequestMethod.GET)
    public List<AgendaAndDebateComment> selectAgendaAndDebateComment() {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.selectAgendaAndDebateComment Start■■■■■■■■■■");
        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.selectAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }

    @RequestMapping(value = "/selectOneAgendaAndDebateComment", method = RequestMethod.GET)
    public AgendaAndDebateComment selectOneAgendaAndDebateComment(@RequestParam Integer articleIdx) {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.selectAgendaAndDebateComment Start■■■■■■■■■■");
        AgendaAndDebateComment agendaAndDebateComment = agendaAndDebateCommentRepository.findOne(articleIdx);
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.selectAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateComment;
    }

    @RequestMapping(value = "/createAgendaAndDebateComment", method = RequestMethod.POST)
    public List<AgendaAndDebateComment> createAgendaAndDebateComment(@RequestBody AgendaAndDebateComment agendaAndDebateComment) {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.createAgendaAndDebateComment Start■■■■■■■■■■");
        System.out.println(agendaAndDebateComment);
        agendaAndDebateCommentRepository.save(agendaAndDebateComment);
        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.createAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }

    @RequestMapping(value = "/updateAgendaAndDebateComment", method = RequestMethod.POST)
    public List<AgendaAndDebateComment> updateAgendaAndDebateComment(@RequestBody AgendaAndDebateComment agendaAndDebateComment) {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.updateAgendaAndDebateComment Start■■■■■■■■■■");
        System.out.println(agendaAndDebateComment);
        int idx = agendaAndDebateComment.getIdx();
        AgendaAndDebateComment AgendaAndDebateCommentList = agendaAndDebateCommentRepository.findOne(idx);
        AgendaAndDebateCommentList.setIdx(agendaAndDebateComment.getIdx());
        AgendaAndDebateCommentList.setComment(agendaAndDebateComment.getComment());
        agendaAndDebateCommentRepository.save(AgendaAndDebateCommentList);

        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.updateAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }

    @RequestMapping(value = "/deleteAgendaAndDebateComment", method = RequestMethod.POST)
    public List<AgendaAndDebateComment> deleteAgendaAndDebateComment(@RequestBody AgendaAndDebateComment agendaAndDebateComment) {
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.deleteAgendaAndDebateComment Start■■■■■■■■■■");
        System.out.println(agendaAndDebateComment);
        int idx = agendaAndDebateComment.getIdx();
        agendaAndDebateCommentRepository.delete(idx);

        List<AgendaAndDebateComment> agendaAndDebateCommentList = agendaAndDebateCommentRepository.findAll();
        logger.info("■■■■■■■■■■AgendaAndDebateCommentController.deleteAgendaAndDebateComment End■■■■■■■■■■■■");
        return agendaAndDebateCommentList;
    }
}
