/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studeninfosystem;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hp
 */
// this class inhireted from superclass called student, which hold more information (variables, methods) will inhierited 
class UnderGraduate extends Student {

    // Set Fields for our class and using Encapsulation concept
    private int Year;

    // Declare setter and getter methods for variables
    public void setInfo(int id, String full_name, String gender, int age, String phone_number, String address, String martial_status, int Year) {
        super.setInfo(id, full_name, gender, age, phone_number, address, martial_status);
        this.Year = Year;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Student Academic Year: " + Year);
    }

}

class Regular extends UnderGraduate {

    private int semister;
    private int dormitory;
    private String cafe;

    public void setInfo(int id, String full_name, String gender, int age, String phone_number, String address, String martial_status, int Year, int semister, int dormitory, String cafe) {
        super.setInfo(id, full_name, gender, age, phone_number, address, martial_status, Year);
        this.semister = semister;
        this.dormitory = dormitory;
        this.cafe = cafe;
        try {
            FileWriter myWriter = new FileWriter("UnderGraduateRegular.txt",true);
            myWriter.write(" Id: " + id + "\n");
            myWriter.write(" Full name: " + full_name + "\n");
            myWriter.write(" Gender: " + gender + "\n");
            myWriter.write(" Age: " + age + "\n");
            myWriter.write(" Phone Number: " + phone_number + "\n");
            myWriter.write(" Address: " + address + "\n");
            myWriter.write(" Marital Status: " + martial_status + "\n");
            myWriter.write(" Academic Year: " + Year + "\n");
            myWriter.write(" Semister: " + semister + "\n");
            myWriter.write(" Dormitory: " + dormitory + "\n");
            myWriter.write(" Cafe: " + cafe + "\n");
            myWriter.write("---------------------------------------------------------");
            myWriter.close();
       
            System.out.println("Student Info Uploaded Successfully......");
            System.out.println("---------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getInfo() {
        super.getInfo();
        System.out.println(" Semister: " + semister);
        System.out.println(" Dormitory: " + dormitory);
        System.out.println(" Cafe: " + cafe);

    }

}

class Extension extends UnderGraduate {

    // Extension class field
    private String Type;
    private int Term;

    public void setInfo(int id, String full_name, String gender, int age, String phone_number, String address, String martial_status, int Year, String Type, int Term) {
        super.setInfo(id, full_name, gender, age, phone_number, address, martial_status, Year);
        this.Type = Type;
        this.Term = Term;
        try {
            FileWriter myWriter = new FileWriter("UnderGraduateExtension.txt", true);
            myWriter.write(" Id: " + id + "\n");
            myWriter.write(" Full name: " + full_name + "\n");
            myWriter.write(" Gender: " + gender + "\n");
            myWriter.write(" Age: " + age + "\n");
            myWriter.write(" Phone Number: " + phone_number + "\n");
            myWriter.write(" Address: " + address + "\n");
            myWriter.write(" Marital Status: " + martial_status + "\n");
            myWriter.write(" Extension Type: " + Type + "\n");
            myWriter.write(" Academic Year: " + Year + "\n");
            myWriter.write(" Term: " + Term + "\n");
            myWriter.write("---------------------------------------------------------");
            myWriter.close();
            System.out.println("Student Info Uploaded Successfully......");
            System.out.println("---------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" Type: " + Type);
        System.out.println(" Term: " + Term);
    }

}
