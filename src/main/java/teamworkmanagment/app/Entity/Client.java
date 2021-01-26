package teamworkmanagment.app.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer nationalCode;
    private String name;
    private String gender;
    private String bd;
    private String phoneNumber;
    private String email;

    public Client(Integer nationalCode, String name, String gender, String bd, String phoneNumber, String email) {
        this.nationalCode = nationalCode;
        this.name = name;
        this.gender = gender;
        this.bd = bd;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Client() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Integer nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
