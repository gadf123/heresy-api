package heresy.controller.board;

import heresy.domain.board.Tendency;
import heresy.repository.TendencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @tendency updown
 * @date 2018. 2. 12.
 **/

@CrossOrigin(origins = "*")
@RestController
public class TendencyController {

    private static final Logger logger = Logger.getLogger(TendencyController.class.getName());

    @Autowired
    private TendencyRepository tendencyRepository;

    @RequestMapping(value = "/selectTendency", method = RequestMethod.GET)
    public List<Tendency> selectTendency() {
        logger.info("■■■■■■■■■■TendencyController.selectTendency Start■■■■■■■■■■");
        List<Tendency> tendencyList = tendencyRepository.findAll();
        logger.info("■■■■■■■■■■TendencyController.selectTendency End■■■■■■■■■■■■");
        return tendencyList;
    }

    @RequestMapping(value = "/createTendency", method = RequestMethod.POST)
    public List<Tendency> createTendency(@RequestBody Tendency tendency) {
        logger.info("■■■■■■■■■■TendencyController.createTendency Start■■■■■■■■■■");
        System.out.println(tendency);
        tendencyRepository.save(tendency);
        List<Tendency> tendencyList = tendencyRepository.findAll();
        logger.info("■■■■■■■■■■TendencyController.createTendency End■■■■■■■■■■■■");
        return tendencyList;
    }

    @RequestMapping(value = "/updateTendency", method = RequestMethod.POST)
    public List<Tendency> updateTendency(@RequestBody Tendency tendency) {
        logger.info("■■■■■■■■■■TendencyController.updateTendency Start■■■■■■■■■■");
        System.out.println(tendency);
        int idx = tendency.getIdx();
        Tendency findOneTendency = tendencyRepository.findOne(idx);
        findOneTendency.setIdx(tendency.getIdx());
        tendencyRepository.save(findOneTendency);

        List<Tendency> tendencyList = tendencyRepository.findAll();
        logger.info("■■■■■■■■■■TendencyController.updateTendency End■■■■■■■■■■■■");
        return tendencyList;
    }

    @RequestMapping(value = "/deleteTendency", method = RequestMethod.POST)
    public List<Tendency> deleteTendency(@RequestBody Tendency tendency) {
        logger.info("■■■■■■■■■■TendencyController.deleteTendency Start■■■■■■■■■■");
        System.out.println(tendency);
        int idx = tendency.getIdx();
        tendencyRepository.delete(idx);

        List<Tendency> tendencyList = tendencyRepository.findAll();
        logger.info("■■■■■■■■■■TendencyController.deleteTendency End■■■■■■■■■■■■");
        return tendencyList;
    }
}
