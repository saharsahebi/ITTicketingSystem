package teamworkmanagment.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/login")
    public String goLogin()
    {
        return "loginPage";
    }

    @RequestMapping("/signUp")
    public String goSignUp()
    {
        return "signUp";
    }

}
