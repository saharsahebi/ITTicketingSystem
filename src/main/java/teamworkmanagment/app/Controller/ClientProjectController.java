package teamworkmanagment.app.Controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import teamworkmanagment.app.Entity.Document;
import teamworkmanagment.app.Entity.Project;
import teamworkmanagment.app.Entity.Ticket;
import teamworkmanagment.app.Extera.ProjectStatus;
import teamworkmanagment.app.Repository.DocumentRepository;
import teamworkmanagment.app.Repository.ProjectRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class ClientProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private DocumentRepository documentRepository;


    @GetMapping("/client-projects")
    public List<Project> getAllProjects() {
        List<Project> ProjectsList = (List<Project>) projectRepository.findAll();
        List<Project> projects = new ArrayList<>();
        for (Project project : ProjectsList) {
            if (project.getClientId().equals(LoginController.okClient.getId())) {
                projects.add(project);
                System.out.println(project.getId());

            }
        }
        return projects;
    }


    @PostMapping(path = "/thiscont")
    ResponseEntity createProject(@NotNull @RequestParam("file1") MultipartFile file1, @RequestParam("title") String title, @RequestParam("deadLine") String deadline) throws IOException {
            Project project = new Project();
            project.setClientId(LoginController.okClient.getId());
            project.setProjectStatus(ProjectStatus.NEW);
            project.setStartTime("");
            project.setTitle(title);
            project.setDeadline(deadline);

            Document document = new Document();
            document.setFile(file1.getBytes());
            document.setDocName(file1.getOriginalFilename());
            // System.out.println("2");
            document.setClientId(project.getClientId());
            document.setUsageOfFile("Project");
            project.setFileId(document.getId());
            projectRepository.save(project);
            List<Project> projectList = (List<Project>) projectRepository.findAll();
            for (Project project1 : projectList) {
                if (project1.equals(project)) {
                    document.setProjectOrTicketId(project1.getId());
                }
            }
            documentRepository.save(document);

            return ResponseEntity.ok(0);
        }


    }