package client;

import java.util.ArrayList;

public class TestCollege {
    public static void main(String[] args) {
       Person [] listofPeople = new Person [20];
       int    []     a        = new int    [20];
        // list is an example of Polymorphism since I can add
        // Staff and Student Instances
        ArrayList<Person> list = new ArrayList<Person>();
       
       //create a new Person A  : 22, John Smith 
       //Person A = new Person(22, "Smith", "John");
       // ---If Person is an abstract class, instanction of Person A is not possible
        
        //create a new Staff B : 121, Nikos Flang, AK34543, 2104323454, 697443234,
        //                       Assistant, PartTime, 400
         Staff BB = new Staff(223, "Opps","Mary", "GF34543", "2105434567","697443234");
         BB.setPosition(Position.ADMINISTRATION);
         BB.setStatus(Status.FULLTIME);
         BB.setSalary(654);
         
         Staff B = new Staff(121, "Flang","Nikos", "AK34543", "2104323454","697443234");
         B.setPosition(Position.FACULTY);
         B.setStatus(Status.PARTTIME);
         B.setSalary(400);
         B.getFirstname(); 
         
         //create a new Student C : 45321, Mary Smith 
        Student C = new Student(2345, "Gloup", "John",2.3,100,"IT");
        Student D = new Student(6543, "Gloup", "John",3.3,00,"IT");
        Student E = new Student(8764, "Gloup", "John",4,50,"IT");
        // Display the CI of Student C
        
        // Add 3 credits to Student C
        C.addCredits(3);
        // Display the salary of Staff B
        
        // Change the status of Staff B to FullTime
       
       // Add to the list all the object instances defined above
        list.add(B);
        list.add(C); 
        list.add(BB);
        list.add(D);
        list.add(E);
        
        for (Person p : list) {
            System.out.println(p);
            }
        
       
    }
}
