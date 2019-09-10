package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {
		InputStream input;
		try {
			input = new FileInputStream(
					"C:\\Users\\Subbu\\Desktop\\sg\\java\\1a-java-master-demos\\output.txt");
			// input = new FileInputStream("input.txt");
			int data = input.read();
//			if (data != -1)
//				System.out.print((char) data);
			while (data != -1) {
				System.out.print((char) data);
				data = input.read();

			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
