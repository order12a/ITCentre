package com.week1.hometask;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

import org.apache.commons.lang3.SystemUtils;

public class Test {

	public static void main(String[] args) throws IOException {
		FileSystem fileSystem = FileSystems.getDefault();
		String sep = fileSystem.getSeparator();
		File userHome = SystemUtils.getUserHome();
		
		String path = sep + "Downloads";
		System.out.println(userHome.getCanonicalPath());
	}

}
