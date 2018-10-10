package client;

public class Staff extends Person {
    Position position;
    Status status;
    double salary;


    public Staff(int id, String lastname, String firstname) {
        // TODO Implement this method
        super(id, lastname, firstname);
    }

    public Staff(int id, String lastname, String firstname, 
                 String passport, String telephone, String mobile) {
        // TODO Implement this method
        super(id, lastname, firstname, passport, telephone, mobile);
    }


    public Staff(int id, String lastname, String firstname, 
                 Position position, Status status, double salary) {
        super(id, lastname, firstname);
        this.position = position;
        this.status = status;
        this.salary = salary;
    }


    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return "STAFF: " + super.toString() + " " + status + " " + position;
     }

}
