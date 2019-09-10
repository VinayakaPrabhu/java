package io;

import java.text.*;
import java.io.*;

public class ObjectInputStreamEx {
 
    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println("Please provide input file");
//            System.exit(0);
//        }
// 
//        String inputFile = args[0];
    	String inputFile = "Student1.dat";
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
 
        try (
                ObjectInputStream objectInput
                    = new ObjectInputStream(new FileInputStream(inputFile));
            ){
 
            while (true) {
                Student1 student = (Student1) objectInput.readObject();
 
                System.out.print(student.getName() + "\t");
                System.out.print(dateFormat.format(student.getBirthday()) + "\t");
                System.out.print(student.getGender() + "\t");
                System.out.print(student.getAge() + "\t");
                System.out.println(student.getGrade());
            }
 
        } catch (EOFException eof) {
            System.out.println("Reached end of file");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
 
}
