package com.tka.output.fileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOutput_EX {

	public static void main(String[] args) {

		
		FileOutputStream fileOutputStream =null;

		try {
			
			Path dirPath = Paths.get("upload/new");
			Files.createDirectories(dirPath);
			fileOutputStream = new FileOutputStream(dirPath+File.separator+"newSample.txt");
			String content ="JavaByKiran";
			byte[] data=content.getBytes();
			fileOutputStream.write(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ae) {
			ae.printStackTrace();
		}finally {
			if(fileOutputStream !=null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
