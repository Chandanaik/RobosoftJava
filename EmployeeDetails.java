/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeedetails;

/**
 *
 * @author Chandana I K
 */
class Member {
    String name;
    int age;
    long phno;
    String address;
    int salary;

    Member( String name, int age, long phno, String address, int salary ){
    this.name = name;
    this.age = age;
    this.phno = phno;
    this.address = address;
    this.salary = salary;
    }


    int printSalary() {  // To print salary 
    return salary;
    }
}

class Employee extends Member{
    String specialization;

    public Employee( String name, int age, long phno, String address, int salary, String specialization ) {
        super(name, age, phno, address, salary);
        this.specialization = specialization;
    }

    void show(){ //To show Employee details
        System.out.println("EMPLOYEE DETAILS:\nName: " + name + "\nAge: " + age + "\nphno: " + phno + "\naddress: " + address + "\nsepecialization: " + specialization);
        System.out.println("Salary: " +super.printSalary()+ "\n");
        }
}


class Manager extends Member{
    String department;
    public Manager(String name, int age, long phno, String address, int salary, String department) {
        super(name, age, phno, address, salary);
        this.department=department;
    }
    void show(){ //To show Manager details
        System.out.println( "MANAGER DETAILS:\nName: " + name + "\nAge: " + age + "\nphno: " + phno + "\naddress: " + address + "\ndepartment: " + department);
        System.out.println("Salary: " +super.printSalary());
    }
}
 
public class EmployeeDetails {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
        // TODO code application logic here
    
   Employee emp=new Employee("Chandana", 21, 98765432, "Shimogga", 25000, "Java");
   emp.show();
    

   Manager man=new Manager("Antony", 50, 93467432, "Mangalore", 75000, "Manager");
   man.show();
  }
    
}
