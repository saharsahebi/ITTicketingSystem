package teamworkmanagment.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @PostMapping(path="/checking") // Map ONLY POST Requests
    //public @ResponseBody
    public String login (@RequestParam String username, @RequestParam String password, @RequestParam String type) {
        //@RequestParam String name, @RequestParam String email,@RequestParam String gender,@RequestParam String bd,@RequestParam Integer anyDeskId,@RequestParam Integer nationalCode,@RequestParam String phoneNumber
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        System.out.printf("username:"+username+"password:"+password+"type:"+type);
        return "memberPage";
    }
}
