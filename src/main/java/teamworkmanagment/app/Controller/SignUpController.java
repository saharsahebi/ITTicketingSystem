package teamworkmanagment.app.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import teamworkmanagment.app.Entity.Client;
import teamworkmanagment.app.Repository.ClientRepository;


@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class SignUpController {
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping(path="/signingup") // Map ONLY POST Requests
     Client signUp (@RequestBody Client client) {
        //@RequestParam String name, @RequestParam String email,@RequestParam String gender,@RequestParam String bd,@RequestParam Integer anyDeskId,@RequestParam Integer nationalCode,@RequestParam String phoneNumber
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        System.out.printf("yes");
        Client c=clientRepository.save(client);
        return c;
    }
}
