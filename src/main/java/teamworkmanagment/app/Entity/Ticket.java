package teamworkmanagment.app.Entity;

import teamworkmanagment.app.Extera.TicketStatus;
import teamworkmanagment.app.Extera.TicketType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer clientId;
    private Integer projectOrProductId;
    private String title;
    private String description;
    private TicketType type;
    private String date;
    private Long fileId;
    private TicketStatus status;
    private String destination;
    private String answer;

    public Integer getProjectOrProductId() {
        return projectOrProductId;
    }

    public void setProjectOrProductId(Integer projectOrProductId) {
        this.projectOrProductId = projectOrProductId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

