package com.week4.lesson7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileExmple {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
//		File f1 = new File("d://book");
//		File[] files = f1.listFiles();
//		System.out.println(Arrays.toString(files));
//		for (File t : files) {
//			System.out.print(t.getName() + ", ");
//		}
//		System.out.println();
//		System.out.println();
//
//		File f2 = new File("d://book/html.txt");
//		if (f2.isDirectory())
//			System.out.println("Это директория");
//		else
//			System.out.println("Это файл");
//		System.out.println(f2.getCanonicalPath());
//		System.out.println(f2.getAbsolutePath());
//		System.out.println(File.separatorChar);
//		System.out.println();
//
//		File f3 = new File("d://book/any.txt");
//		if (f3.isDirectory())
//			System.out.println("Это директория");
//		else
//			System.out.println("Это файл");
//		if (!f3.exists()) {
//			f3.createNewFile();
//			System.out.println("Новый файл");
//		}
		
//		FileExmple.showFiles();
		
//		System.out.println("Enter path to target directory\n");
//		String targetDir = input.nextLine();
//		File dir = new File(targetDir);
//		FileExmple.printDirectories(dir);
		char sep = File.separatorChar;
		File dir = new File("C:" + sep +"wamp");
		printDirectoriesNonRec(dir);
		
	}
	
	public static void showFiles() {
		System.out.println("Enter path to target directory\n");
		String targetDir = input.nextLine();
		System.out.println("Enter file extension");
		String targetFileExtemsion = input.nextLine();
		
		File dirs = new File(targetDir);
		
		for (File file: dirs.listFiles()) {
			if ((file.getName()).endsWith(targetFileExtemsion)) {
				System.out.println(file.getName());
			}
		}
	}
	
	
	public static void printDirectories(File file) {

		for (File directory : file.listFiles()) {
			if (directory.isDirectory()) {
				System.out.println(directory.getName());
				printDirectories(directory);
			}
		}
	}
	
	public static void writeNames(File file) {

		for (File directory : file.listFiles()) {
			if (directory.isDirectory()) {
				System.out.println(directory.getName());
				printDirectories(directory);
			}
		}
	}
	
	public static void printDirectoriesNonRec(File file) {
		
		ArrayList<File> dirs = new ArrayList<>();
		dirs.add(file);
		
		for (int i = 0; i < dirs.size(); i++){
			if (dirs.get(i).isDirectory()) {
				dirs.add(dirs.get(i).listFiles());
			}
		}
		
		for (File file2 : dirs) {
			System.out.println(file2.getName());
		}
	}
}
