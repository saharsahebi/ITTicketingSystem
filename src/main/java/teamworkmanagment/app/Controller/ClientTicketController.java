package teamworkmanagment.app.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamworkmanagment.app.Entity.Project;
import teamworkmanagment.app.Entity.Ticket;
import teamworkmanagment.app.Extera.ProjectStatus;
import teamworkmanagment.app.Extera.TicketStatus;
import teamworkmanagment.app.Repository.TicketRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class ClientTicketController {

    @Autowired
    private TicketRepository ticketRepository;


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


    @PostMapping(path="/client-tickets")
    Ticket createTicket(@RequestBody Ticket ticket)
    {

        System.out.println("project id:"+ticket.getProjectOrProductId());
        ticket.setClientId(LoginController.okClient.getId());
        ticket.setStatus(TicketStatus.OPEN);

        return ticketRepository.save(ticket);
    }





}
