package teamworkmanagment.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value="/main", method= RequestMethod.POST, params="action=login")
    public String goLoginPage()
    {
        return "loginPage";
    }
    @RequestMapping(value="/main", method= RequestMethod.POST, params="action=signUp")
    public String goSignUpPage()
    {
        return "signUp";
    }




}
