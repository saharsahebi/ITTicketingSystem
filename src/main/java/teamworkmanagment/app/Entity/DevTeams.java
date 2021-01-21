package teamworkmanagment.app.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DevTeams {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String teamName;
    private String membersIds;
    private Integer projectId;
    private String tasksIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMembersIds() {
        return membersIds;
    }

    public void setMembersIds(String membersIds) {
        this.membersIds = membersIds;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getTasksIds() {
        return tasksIds;
    }

    public void setTasksIds(String tasksIds) {
        this.tasksIds = tasksIds;
    }
}
