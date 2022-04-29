package ma.emsi.patientmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityContoller {
    @GetMapping("/403")
    public String notAuthorized(){
        return "403";
    }
}
