package com.tka.output.fileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewFOS {

	public static void main(String[] args) {

		String dirPath = "upload/file";

		String filePath = dirPath + File.separator + "sample2.txt";

		File directory = new File(dirPath);

		if (!directory.exists()) {
			if (!directory.mkdirs()) {
				System.out.println("Failed to create directory!");
				return;
			}
		}

		try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
			String content = "JavaByKiran";
			byte[] data = content.getBytes();
			fileOutputStream.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
