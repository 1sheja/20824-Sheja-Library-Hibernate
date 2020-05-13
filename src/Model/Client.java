package LibraryModels;
// Generated May 11, 2020 11:33:32 AM by Hibernate Tools 4.3.1



/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private String regid;
     private String firstName;
     private String lastName;
     private String phoneNumber;
     private String emailAddress;
     private String clientCategory;
     private String photoPath;

    public Client() {
    }

	
    public Client(String regid) {
        this.regid = regid;
    }
    public Client(String regid, String firstName, String lastName, String phoneNumber, String emailAddress, String clientCategory, String photoPath) {
       this.regid = regid;
       this.firstName = firstName;
       this.lastName = lastName;
       this.phoneNumber = phoneNumber;
       this.emailAddress = emailAddress;
       this.clientCategory = clientCategory;
       this.photoPath = photoPath;
    }
   
    public String getRegid() {
        return this.regid;
    }
    
    public void setRegid(String regid) {
        this.regid = regid;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getClientCategory() {
        return this.clientCategory;
    }
    
    public void setClientCategory(String clientCategory) {
        this.clientCategory = clientCategory;
    }
    public String getPhotoPath() {
        return this.photoPath;
    }
    
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }




}


