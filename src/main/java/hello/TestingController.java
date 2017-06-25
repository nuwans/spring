package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/testing")
    public Testing testing(@RequestParam(value="name", defaultValue="World") String name) {
        return new Testing(String.format(template, name));
    }
}
