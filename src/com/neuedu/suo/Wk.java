package com.neuedu.suo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Wk {
	public static void main(String[] args) {
	   copyfile("D:\\\\www.txt", "E:\\\\abc.txt");
	   System.out.println("复制完成");
	}
	public static void copyfile(String oldpath,String newpath) {
		try {
			
			//输入流
			InputStream is=new FileInputStream(oldpath);
			
			//输出流
			OutputStream os=new FileOutputStream(newpath);
			byte[] b=new byte[1024];
			while(is.read(b)!= -1) {
				os.write(b);
			}
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
