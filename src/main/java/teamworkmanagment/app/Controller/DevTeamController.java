package teamworkmanagment.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teamworkmanagment.app.Entity.DevTeamMember;
import teamworkmanagment.app.Entity.DevTeams;
import teamworkmanagment.app.Entity.Task;
import teamworkmanagment.app.Repository.DevTeamMembersRepository;
import teamworkmanagment.app.Repository.DevTeamRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class DevTeamController {


    @Autowired
    DevTeamRepository devTeamRepository;
    @Autowired
    DevTeamMembersRepository devTeamMembersRepository;


    @PostMapping(path = "/createteam")
    public HttpStatus createTeam(@RequestBody DevTeams devTeams)
    {
        System.out.println(devTeams.getMembersIds());
        System.out.println(devTeams.getProjectId());
        String memIds=devTeams.getMembersIds();
        HttpStatus httpStatus;
        String[]ids=memIds.split(",");
        boolean flag=false;
        List<DevTeamMember> devTeamMembers= (List<DevTeamMember>) devTeamMembersRepository.findAll();
       for (int i=0;i<ids.length;i++)
       {
           for (DevTeamMember devTeamMember:devTeamMembers)
           {
               if (Integer.parseInt(ids[i])==devTeamMember.getId())
               {
                   flag=true;
               }
               else
                   flag=false;
           }
       }

       if (flag==true)
       {
           devTeams.setTasksIds("");
           devTeamRepository.save(devTeams);
           httpStatus=HttpStatus.ACCEPTED;
       }
       else
           httpStatus=HttpStatus.BAD_REQUEST;

        return httpStatus;

    }




}
