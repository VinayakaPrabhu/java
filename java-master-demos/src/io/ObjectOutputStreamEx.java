package io;

import java.util.Date;
import java.io.Serializable;
import java.util.*;
import java.text.*;
import java.io.*;
 

public class ObjectOutputStreamEx {
 
    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println("Please provide output file");
//            System.exit(0);
//        }
// 
//        String outputFile = args[0];
    	
    	String outputFile = "Student1.dat";
 
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
 
        try (
            ObjectOutputStream objectOutput
                = new ObjectOutputStream(new FileOutputStream(outputFile));
            ) {
 
            List<Student1> listStudent = new ArrayList<>();
 
            listStudent.add(
                new Student1("Alice", dateFormat.parse("02-15-1993"), false, 23, 80.5f));
 
            listStudent.add(
                new Student1("Brian", dateFormat.parse("10-03-1994"), true, 22, 95.0f));
 
            listStudent.add(
                new Student1("Carol", dateFormat.parse("08-22-1995"), false, 21, 79.8f));
 
            for (Student1 student : listStudent) {
                objectOutput.writeObject(student);
            }
 System.out.println("Written");
        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
    }
}

 class Student1 implements Serializable {
    private String name;
    private Date birthday;
    private boolean gender; // true is male, false is female
    private int age;
    private float grade;
 
    public Student1() {
    }
 
    public Student1(String name, Date birthday,
            boolean gender, int age, float grade) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Date getBirthday() {
        return this.birthday;
    }
 
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
 
    public boolean getGender() {
        return this.gender;
    }
 
    public void setGender(boolean gender) {
        this.gender = gender;
    }
 
    public int getAge() {
        return this.age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public float getGrade() {
        return this.grade;
    }
 
    public void setGrade(float grade) {
        this.grade = grade;
    }
}
