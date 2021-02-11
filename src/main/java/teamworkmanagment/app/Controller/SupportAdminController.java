package teamworkmanagment.app.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;
import teamworkmanagment.app.Entity.Document;
import teamworkmanagment.app.Entity.Project;
import teamworkmanagment.app.Entity.Ticket;
import teamworkmanagment.app.Extera.ProjectStatus;
import teamworkmanagment.app.Extera.TicketStatus;
import teamworkmanagment.app.Repository.DocumentRepository;
import teamworkmanagment.app.Repository.ProjectRepository;
import teamworkmanagment.app.Repository.TicketRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
@RestController
@RequestMapping("/api/v1")
public class SupportAdminController {

    int i=1;

    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private DocumentRepository documentRepository;

    Document myDocument;
    Ticket myTicket;

    @GetMapping( "/admin-new-tickets")
    public List<Ticket> getNewTickets()
    {
        List<Ticket> ticketList= (List<Ticket>) ticketRepository.findAll();
        List<Ticket> tickets=new ArrayList<>();
        for (Ticket ticket:ticketList)
        {
            if (ticket.getStatus().equals(TicketStatus.OPEN))
            {
                tickets.add(ticket);
                //System.out.println(ticket.getId());

            }
        }
        return tickets;
    }
    @GetMapping("/admin-new-projects")
    public List<Project> getNewProjects()
    {
        List<Project> projectList= (List<Project>) projectRepository.findAll();
        List<Project> projects=new ArrayList<>();
        for (Project project:projectList)
        {
            if (project.getProjectStatus().equals(ProjectStatus.NEW))
            {
                projects.add(project);
            }
        }
        return projects;
    }

    @GetMapping( "/admin-all-tickets")
    public List<Ticket> getAllTickets()
    {
        List<Ticket> ticketList= (List<Ticket>) ticketRepository.findAll();
        return ticketList;
    }

    @GetMapping("/admin-all-projects")
    public List<Project> getAllProjects()
    {
        List<Project> projectList= (List<Project>) projectRepository.findAll();

        return projectList;
    }


    @PostMapping(path = "/admin-a-file")
    public HttpStatus setDocument(@RequestBody Ticket ticket)
    {
        if (ticket==null)
        {
            System.out.println("nulll");
        }
        System.out.println("first"+i++);
        List<Document> files= (List<Document>) documentRepository.findAll();
        HttpStatus httpStatus = null;
        System.out.println("id from front:"+ticket.getId());
        for (Document document:files)
        {
            System.out.println("id from db:"+document.getProjectOrTicketId());
            if (document.getProjectOrTicketId()==ticket.getId()&&document.getUsageOfFile().equals("Ticket"))
            {
                System.out.println("yesssss");
                myDocument=document;
                httpStatus=HttpStatus.ACCEPTED;
            }

        }
        System.out.println(myDocument.getDocName());
        System.out.println("sec"+i++);

        return httpStatus;
    }

    @PostMapping(path = "/admin-project-file")
    public HttpStatus setProjectDocument(@RequestBody Ticket ticket)
    {
        if (ticket==null)
        {
            System.out.println("nulll");
        }
        System.out.println("first"+i++);
        List<Document> files= (List<Document>) documentRepository.findAll();
        HttpStatus httpStatus = null;
        System.out.println("id from front:"+ticket.getId());
        for (Document document:files)
        {
            System.out.println("id from db:"+document.getProjectOrTicketId());
            if (document.getProjectOrTicketId()==ticket.getId()&&document.getUsageOfFile().equals("Project"))
            {
                System.out.println("yesssss");
                myDocument=document;
                httpStatus=HttpStatus.ACCEPTED;
            }

        }
        System.out.println(myDocument.getDocName());
        System.out.println("sec"+i++);

        return httpStatus;
    }



   @GetMapping(path = "/getfile")
    public ResponseEntity<byte[]> getRandomFile() throws NullPointerException{

       System.out.println("third"+i++);
       System.out.println("hi 1");
        HttpHeaders header = new HttpHeaders();
       System.out.println("hi2");
       System.out.println(myDocument.getDocName());
       System.out.println("h3");
        header.setContentLength(myDocument.getFile().length);

        header.set("Content-Disposition", "attachment; filename=" + myDocument.getDocName());

        return new ResponseEntity<>(myDocument.getFile(), header, HttpStatus.OK);
    }


    @PostMapping(path = "/postticketid")
    public ResponseEntity findTicket(@RequestBody Ticket ticket)
    {
        System.out.println("say id:"+ticket.getId());
        myTicket=ticketRepository.findById(ticket.getId()).orElseThrow(() -> new ResourceAccessException("not found"));
        System.out.println("myticketId:"+myTicket.getId()+" MyticketTitle;"+myTicket.getTitle());
        return ResponseEntity.ok(0);
    }

    @GetMapping(path = "/getticket")
    public ResponseEntity<Ticket> getTicket()
    {
     return  ResponseEntity.ok(myTicket);
    }

    @PostMapping(path = "/updateselectedticket")
    public HttpStatus updateTicket(@RequestBody Ticket ticket)
    {
        System.out.println("yes im here");
        //ticketRepository.delete(myTicket);
        ticket.setId(myTicket.getId());
        ticket.setTitle(myTicket.getTitle());
        ticket.setProjectOrProductId(myTicket.getProjectOrProductId());
        ticket.setType(myTicket.getType());
        ticket.setClientId(myTicket.getClientId());
        ticket.setDate(myTicket.getDate());
        ticketRepository.save(ticket);
        return HttpStatus.ACCEPTED;

    }











}
