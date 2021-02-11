package teamworkmanagment.app.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import teamworkmanagment.app.Entity.DevTeamMember;
import teamworkmanagment.app.Entity.DevTeams;
import teamworkmanagment.app.Entity.Task;
import teamworkmanagment.app.Extera.TaskStatus;
import teamworkmanagment.app.Repository.DevTeamRepository;
import teamworkmanagment.app.Repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;


    @Autowired
    DevTeamRepository devTeamRepository;

    Task myTask;

    @PostMapping(path = "/createtask")
    public HttpStatus createTask(@RequestBody Task task)
    {

       HttpStatus httpStatus;
       String taskIds="";
       DevTeams MydevTeams=null;
       List<DevTeams> devTeams= (List<DevTeams>) devTeamRepository.findAll();
       for (DevTeams devTeams1:devTeams)
       {
           System.out.println(devTeams1.getId()+"id:");
           System.out.println("task id:"+task.getFromId());
           if (devTeams1.getId()==task.getFromId())
           {
               System.out.println("ok sahar");
               MydevTeams=devTeams1;
               taskIds=devTeams1.getTasksIds();
           }
       }

         MydevTeams.setTasksIds(taskIds.concat(","+task.getId()));
         devTeamRepository.save(MydevTeams);
         task.setTaskStatus(TaskStatus.TODO);
         taskRepository.save(task);
         httpStatus=HttpStatus.ACCEPTED;
        return httpStatus;
    }

    @GetMapping(path = "getmytasks")
    public List<Task> myTasks()
    {

        int number=LoginController.okdevTeamMember.getId();
        List<Task> tasks= (List<Task>) taskRepository.findAll();
        List<Task> myTasks=new ArrayList<>();
        for (Task task:tasks)
        {
            System.out.println(task.getToId());
            if (task.getToId()==number)
            {
                System.out.println("it is equal");
                myTasks.add(task);
            }
        }
        return myTasks;


    }

    @PostMapping(path = "/sendtaskidtoupdate")
    public HttpStatus getIdAndUpdateTask(@RequestBody Task task)
    {
        List<Task> taskList= (List<Task>) taskRepository.findAll();
        for (Task task1:taskList)
        {
            if (task1.getId()==task.getId())
            {
                myTask=task1;
                return HttpStatus.ACCEPTED;
            }
        }
        return HttpStatus.BAD_REQUEST;

    }

    @GetMapping(path = "gettaskdata")
    public Task getMyTask()
    {
        return myTask;
    }

    @PostMapping(path = "updatetask")
    public HttpStatus updateMyTask( @RequestBody Task task)
    {
        System.out.println(task.getTaskStatus());
      task.setDeadLine(myTask.getDeadLine());
      task.setFromId(myTask.getFromId());
      task.setToId(myTask.getToId());
      task.setId(myTask.getId());
      taskRepository.save(task);
      return HttpStatus.ACCEPTED;
    }





}
