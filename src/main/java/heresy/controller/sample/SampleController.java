package heresy.controller.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @user updown
 * @date 2018. 1. 17.
 **/
@RestController
public class SampleController {

    @RequestMapping("/sample")
    public String sample() {
        return "Hello SampleController sample Method";
    }
}
