package teamworkmanagment.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import teamworkmanagment.app.Entity.Client;
import teamworkmanagment.app.Repository.ClientRepository;
import teamworkmanagment.app.Repository.DevTeamMembersRepository;
import teamworkmanagment.app.Repository.SupportAdminRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private DevTeamMembersRepository devTeamMembersRepository;
    @Autowired
    private SupportAdminRepository supportAdminRepository;

     static Client okClient;

    @PostMapping(path="/checking") // Map ONLY POST Requests
    //public @ResponseBody
    public HttpStatus login (@RequestBody Client client) {
        //@RequestParam String name, @RequestParam String email,@RequestParam String gender,@RequestParam String bd,@RequestParam Integer anyDeskId,@RequestParam Integer nationalCode,@RequestParam String phoneNumber
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

            System.out.printf("From react:"+client.getEmail());
            List<Client> clientList= (List<Client>) clientRepository.findAll();
            HttpStatus httpStatus = null;
            for (Client myClient:clientList)
            {
                if (myClient.getEmail().equals(client.getEmail()))
                {
                    System.out.printf("yepp");
                    httpStatus=HttpStatus.ACCEPTED;
                    okClient=myClient;
                }
            }

        return httpStatus;
    }


}
