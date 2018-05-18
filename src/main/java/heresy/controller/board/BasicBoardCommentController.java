package heresy.controller.board;

import heresy.domain.board.BasicBoardComment;
import heresy.repository.BasicBoardCommentRepository;
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
public class BasicBoardCommentController {

    private static final Logger logger = Logger.getLogger(BasicBoardCommentController.class.getName());

    @Autowired
    private BasicBoardCommentRepository basicBoardCommentRepository;

    @RequestMapping(value = "/selectBasicBoardComment", method = RequestMethod.GET)
    public List<BasicBoardComment> basicBoardComment() {
        logger.info("■■■■■■■■■■BasicBoardCommentController.selectBasicBoardComment Start■■■■■■■■■■");
        List<BasicBoardComment> basicBoardCommentList = basicBoardCommentRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardCommentController.selectBasicBoardComment End■■■■■■■■■■■■");
        return basicBoardCommentList;
    }

    @RequestMapping(value = "/createBasicBoardComment", method = RequestMethod.POST)
    public List<BasicBoardComment> createBasicBoardComment(@RequestBody BasicBoardComment basicBoardComment) {
        logger.info("■■■■■■■■■■BasicBoardCommentController.createBasicBoardComment Start■■■■■■■■■■");
        System.out.println(basicBoardComment);
        basicBoardCommentRepository.save(basicBoardComment);
        List<BasicBoardComment> basicBoardCommentList = basicBoardCommentRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardCommentController.createBasicBoardComment End■■■■■■■■■■■■");
        return basicBoardCommentList;
    }

    @RequestMapping(value = "/updateBasicBoardComment", method = RequestMethod.POST)
    public List<BasicBoardComment> updateBasicBoardComment(@RequestBody BasicBoardComment basicBoardComment) {
        logger.info("■■■■■■■■■■BasicBoardCommentController.updateBasicBoardComment Start■■■■■■■■■■");
        System.out.println(basicBoardComment);
        int idx = basicBoardComment.getIdx();
        BasicBoardComment findOneBasicBoardComment = basicBoardCommentRepository.findOne(idx);
        findOneBasicBoardComment.setIdx(basicBoardComment.getIdx());
        findOneBasicBoardComment.setComment(basicBoardComment.getComment());
        basicBoardCommentRepository.save(findOneBasicBoardComment);

        List<BasicBoardComment> basicBoardCommentList = basicBoardCommentRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardCommentController.updateBasicBoardComment End■■■■■■■■■■■■");
        return basicBoardCommentList;
    }

    @RequestMapping(value = "/deleteBasicBoardComment", method = RequestMethod.POST)
    public List<BasicBoardComment> deleteBasicBoardComment(@RequestBody BasicBoardComment basicBoardComment) {
        logger.info("■■■■■■■■■■BasicBoardCommentController.deleteBasicBoardComment Start■■■■■■■■■■");
        System.out.println(basicBoardComment);
        int idx = basicBoardComment.getIdx();
        basicBoardCommentRepository.delete(idx);

        List<BasicBoardComment> basicBoardCommentList = basicBoardCommentRepository.findAll();
        logger.info("■■■■■■■■■■BasicBoardCommentController.deleteBasicBoardComment End■■■■■■■■■■■■");
        return basicBoardCommentList;
    }
}
