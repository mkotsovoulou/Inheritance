package client;

public abstract class Person {
    
    private int id;
    private String lastname;
    private String firstname;
    private String passport;
    private String telephone;
    private String mobile;


    public Person(int id, String lastname, String firstname, String passport, String telephone, String mobile) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.passport = passport;
        this.telephone = telephone;
        this.mobile = mobile;
    }


    public Person(int id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }


    public int getId() {
        return id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }


    @Override
    public String toString() {
        return id + " " + lastname + " " + firstname;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
