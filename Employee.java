/*
Assignment 8
Description: Create different employee profile
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

public class Employee {

    int id;
    String name;
    String emailId;
    String dept;

    public Employee(int id, String name, String emailId, String dept) {
        this.name = name;
        this.dept = dept;
        this.emailId = emailId;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }


    public String getDept() {
        return dept;

    }
    public String toString(){
        return (this.id+" "+ this.name+" "+this.emailId+" "+this.dept);
    }
    public static void main(String[]args){
        Employee one= new Employee(1,"\t"+"abc", "\t"+"abc@gmail.com", "\t"+"Engineering");
        Employee two = new Employee(2, "\t"+"xyz","\t"+"xyz@gmail.com","\t"+"Engineering");
        Employee three = new Employee(3,"\t"+"prq","\t"+"prq@gmail.com","\t"+"Management" );
        System.out.println("-- Employee Details --"+"\n");
        System.out.println("ID"+"\t"+"Name"+"\t"+"Email"+"\t"+"\t"+"\t"+"Dept");
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());

    }

}
