package teamworkmanagment.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import teamworkmanagment.app.Entity.Client;
import teamworkmanagment.app.Repository.ClientRepository;
import teamworkmanagment.app.Repository.DevTeamMembersRepository;
import teamworkmanagment.app.Repository.SupportAdminRepository;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private DevTeamMembersRepository devTeamMembersRepository;
    @Autowired
    private SupportAdminRepository supportAdminRepository;


    @PostMapping(path="/checking") // Map ONLY POST Requests
    //public @ResponseBody
    public String login (@RequestParam String username, @RequestParam String password, @RequestParam String type) {
        //@RequestParam String name, @RequestParam String email,@RequestParam String gender,@RequestParam String bd,@RequestParam Integer anyDeskId,@RequestParam Integer nationalCode,@RequestParam String phoneNumber
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        if (type.equals("client"))
        {
            List<Client> clientList= (List<Client>) clientRepository.findAll();
            for (Client client:clientList)
            {

                if (client.getEmail().equals(username))
                {
                    System.out.printf("yepp");
                }
            }
        }

        return "memberPage";
    }
}
