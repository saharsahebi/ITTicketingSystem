package teamworkmanagment.app.Entity;

import javax.persistence.*;


@Entity
    public class Document {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String docName;

        private String usageOfFile;

        private Integer clientId;

        private String dateOfAttach;

        private Integer projectOrTicketId;

        @Lob
        private byte[] file;


    public String getDocName() {
        return docName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getUsageOfFile() {
        return usageOfFile;
    }

    public void setUsageOfFile(String usageOfFile) {
        this.usageOfFile = usageOfFile;
    }

    public String getDateOfAttach() {
        return dateOfAttach;
    }

    public void setDateOfAttach(String dateOfAttach) {
        this.dateOfAttach = dateOfAttach;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getProjectOrTicketId() {
        return projectOrTicketId;
    }

    public void setProjectOrTicketId(Integer projectOrTicketId) {
        this.projectOrTicketId = projectOrTicketId;
    }
}
