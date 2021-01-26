package teamworkmanagment.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamworkmanagment.app.Entity.Project;
import teamworkmanagment.app.Extera.ProjectStatus;
import teamworkmanagment.app.Repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class ClientProjectController {

    @Autowired
    private ProjectRepository projectRepository;


    @GetMapping( "/client-projects")
    public List<Project> getAllEmployees()

    {
        List<Project> ProjectsList= (List<Project>) projectRepository.findAll();
        List<Project> projects=new ArrayList<>();
        for (Project project:ProjectsList)
        {
            if (project.getClientId().equals(LoginController.okClient.getId()))
            {
                projects.add(project);
                System.out.println(project.getId());

            }
        }
        return projects;
    }


    @PostMapping(path="/client-projects")
    Project createProject(@RequestBody Project project)
    {
       project.setClientId(LoginController.okClient.getId());
       project.setProjectStatus(ProjectStatus.NEW);
       project.setStartTime("");

        return projectRepository.save(project);
    }


}
