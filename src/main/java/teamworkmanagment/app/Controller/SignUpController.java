package teamworkmanagment.app.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import teamworkmanagment.app.Entity.Client;
import teamworkmanagment.app.Repository.ClientRepository;

@Controller
public class SignUpController {
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping(path="/signingUp") // Map ONLY POST Requests
    //public @ResponseBody
     String signUp (@RequestParam String fullName, @RequestParam String nationalCode, @RequestParam String gender,@RequestParam String bd,@RequestParam String phoneNumber,@RequestParam String anyDeskId,@RequestParam String email) {
        //@RequestParam String name, @RequestParam String email,@RequestParam String gender,@RequestParam String bd,@RequestParam Integer anyDeskId,@RequestParam Integer nationalCode,@RequestParam String phoneNumber
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        System.out.printf("yes");
        Client client=new Client();
        client.setName(fullName);
        client.setNationalCode(Integer.parseInt(nationalCode));
        client.setPhoneNumber(phoneNumber);
        client.setGender(gender);
        client.setEmail(email);
        client.setAnyDeskID(Integer.parseInt(anyDeskId));
        client.setBd(bd);
        clientRepository.save(client);
        return "memberPage";
    }
}
