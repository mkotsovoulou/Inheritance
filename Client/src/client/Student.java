package client;

public class Student extends Person {
    private double ci;
    private int credits;
    private String major;
    
    public Student(int id, String lastname, String firstname) {
        super(id, lastname, firstname);
        ci = 4;
        major = "UND";
        credits = 0;
    }

    public Student(int id, String lastname, String firstname, String passport, String telephone, String mobile) {
        super(id, lastname, firstname, passport, telephone, mobile);
        ci = 4;
        major = "UND";
        credits = 0;
    }

    public Student(int id, String lastname, String firstname, double ci, int credits, String major) {
        super(id, lastname, firstname);
        this.ci = ci;
        this.credits = credits;
        this.major = major;
    }


    public void setCi(double ci) {
        this.ci = ci;
    }

    public double getCi() {
        return ci;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    public void addCredits(int cr) {
        credits += cr;
     }
    
    public String toString() {
        return "STUDENT:" + super.toString() + credits;
        }

}
