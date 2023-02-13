/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studeninfosystem;

import java.io.File;

/**
 *
 * @author hp
 */
abstract class Student implements Common {

    private int id;
    private String full_name;
    private String gender;
    private int age;
    private String phone_number;
    private String address;
    private String martial_status;

    @Override
    public void setInfo(int id, String full_name, String gender, int age, String phone_number, String address, String martial_status) {
        this.id = id;
        this.full_name = full_name;
        this.gender = gender;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.martial_status = martial_status;

    }

    @Override
    public void getInfo() {
        System.out.println(" Id: " + id);
        System.out.println(" Full name: " + full_name);
        System.out.println(" Gender: " + gender);
        System.out.println(" Age: " + age);
        System.out.println(" Phone Number: " + phone_number);
        System.out.println(" Address: " + address);
        System.out.println(" Marital Status: " + martial_status);

    }

}
