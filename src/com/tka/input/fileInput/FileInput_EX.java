package com.tka.input.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput_EX {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"/Users/apple/Documents/workspace-spring-tool-suite-4-4.22.1.RELEASE/FileHandling/src/sample.txt");
			// char data=(char)fis.read();
			int availableBytes = fis.available();
			System.out.println("Available bytes: " + availableBytes);

			fis.skip(5);
			int data;

			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fis != null) {

				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
