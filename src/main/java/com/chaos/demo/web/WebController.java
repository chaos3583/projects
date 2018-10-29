
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chaos")
public class WebController {

    @RequestMapping("/docker")
    public String helloDocker(){
        return  "hello docker";
    }

}
