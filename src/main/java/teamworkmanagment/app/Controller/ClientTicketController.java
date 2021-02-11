package teamworkmanagment.app.Controller;


import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import teamworkmanagment.app.Entity.Document;
import teamworkmanagment.app.Entity.Project;
import teamworkmanagment.app.Entity.Ticket;
import teamworkmanagment.app.Extera.ProjectStatus;
import teamworkmanagment.app.Extera.TicketStatus;
import teamworkmanagment.app.Repository.DocumentRepository;
import teamworkmanagment.app.Repository.TicketRepository;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
@RestController
@RequestMapping("/api/v1")
public class ClientTicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @GetMapping( "/client-tickets")
    public List<Ticket> getMyTickets()

    {
        List<Ticket> ticketList= (List<Ticket>) ticketRepository.findAll();
        List<Ticket> tickets=new ArrayList<>();
        for (Ticket ticket:ticketList)
        {
            if (ticket.getClientId().equals(LoginController.okClient.getId()))
            {
                tickets.add(ticket);
                System.out.println(ticket.getId());

            }
        }
        return tickets;
    }


    @PostMapping
    ResponseEntity createTicket(@NotNull @RequestParam("file") MultipartFile file,@RequestParam("pid") Integer id,@RequestParam("title") String title,@RequestParam("description") String description) throws IOException {
        Ticket ticket=new Ticket();
         ticket.setClientId(LoginController.okClient.getId());
        ticket.setStatus(TicketStatus.OPEN);
        ticket.setDescription(description);
        ticket.setProjectOrProductId(id);
        ticket.setTitle(title);
        System.out.println("1");
        System.out.println(id);
        System.out.println(title);

        Document document=new Document();
        document.setFile(file.getBytes());
        document.setDocName(file.getOriginalFilename());
       // System.out.println("2");
        document.setClientId(ticket.getClientId());
        document.setUsageOfFile("Ticket");
        ticket.setFileId(document.getId());
        ticketRepository.save(ticket);
        List<Ticket> ticketList= (List<Ticket>) ticketRepository.findAll();
        for (Ticket ticket1:ticketList)
        {
            if (ticket1.equals(ticket))
            {
                document.setProjectOrTicketId(ticket1.getId());
            }
        }
        documentRepository.save(document);
      //  System.out.println("3");
        //System.out.println("okk saharrr");

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        //System.out.println("4");
        return ResponseEntity.created(location).build();
    }








}
