package jp.gihyo.projava.tasklist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeRestController {
    @RequestMapping(value="/resthello")
    String hello(){
        return """
                Hello,
                It works!
                now is %s.
                """.formatted(LocalDateTime.now());
    }
}
