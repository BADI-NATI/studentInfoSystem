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
class PostGraduate extends Student {

    private double previousgpa;
    private String job;
    private String previouscampus;
    private String educbackground;

    public void setInfo(int id, String full_name, String gender, int age, String phone_number, String address, String martial_status, double previousgpa, String job, String previouscampus, String educbackground) {
        super.setInfo(id, full_name, gender, age, phone_number, address, martial_status);
        this.previousgpa = previousgpa;
        this.job = job;
        this.previouscampus = previouscampus;
        this.educbackground = educbackground;

        try {
            FileWriter myWriter = new FileWriter("PostGraduate.txt", true);
            myWriter.write("\n Id: " + id + "\n");
            myWriter.write(" Full name: " + full_name + "\n");
            myWriter.write(" Gender: " + gender + "\n");
            myWriter.write(" Age: " + age + "\n");
            myWriter.write(" Phone Number: " + phone_number + "\n");
            myWriter.write(" Address: " + address + "\n");
            myWriter.write(" Marital Status: " + martial_status + "\n");
            myWriter.write(" Previous GPA: " + previousgpa + "\n");
            myWriter.write(" Occupation: " + job + "\n");
            myWriter.write(" Previous University: " + previouscampus + "\n");
            myWriter.write(" Educational Background: " + educbackground + "\n");
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
        System.out.println(" Previous GPA: " + previousgpa);
        System.out.println(" Occupation: " + job);
        System.out.println(" Previous Campus: " + previouscampus);
        System.out.println(" Educational Background: " + educbackground);
    }
}
