package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
public static void main(String[] args) throws IOException {
	File file = null;
	//Stream is a sequence of bytes travelling from source to destination.
	FileOutputStream fileOutputStream = null;
	
	String content = "This is the text content\n";
	String content1 = "Second line\n";
	//create the file
	file = new File("output.txt"); 
	fileOutputStream = new FileOutputStream(file,false);
	byte [] bytes = content.getBytes();
	fileOutputStream.write(bytes);
	fileOutputStream.write(content1.getBytes());
    fileOutputStream.flush();
    fileOutputStream.close();
}
}
