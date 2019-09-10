package io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {

		//int i  = 10/0;
		FileOutputStream fop = null;
		File file;
		String content = "This is the text content\n";
		String content1 = "Second line\n";

		try {

			//file = new File("W:\\java-trg\\r-core-java\\input.txt");
			file = new File("input.txt");
			fop = new FileOutputStream(file,true);

			// if file doesnt exists, then create it
//			if (!file.exists()) {
//				file.createNewFile();
//			}

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			//fop.write(content1.getBytes());
			fop.flush();
			fop.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} 
		//finally {
//			try {
//				if (fop != null) {
//					fop.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}