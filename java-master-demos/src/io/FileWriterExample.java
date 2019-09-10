package io;

import java.io.FileWriter;

public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("testout.txt",true);    
           fw.write("Welcome to the world of gaming.\n");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  