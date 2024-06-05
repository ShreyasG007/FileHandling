package com.tka.input.bufferedReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputstreamEx {

	public static void main(String[] args) {
		InputStream inputStream;
		try {
			inputStream = new FileInputStream("upload/buffer/buffer.txt");
			BufferedInputStream bis = new BufferedInputStream(inputStream);
			int data;

			try {
				while ((data = bis.read()) != -1) {
					System.out.print((char) data);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
