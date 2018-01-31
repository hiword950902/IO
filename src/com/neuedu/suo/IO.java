package com.neuedu.suo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:/ww/www.txt");
		// System.out.println("文件或文件夹是否存在"+file.exists());
		// System.out.println("判断文件或文件夹"+file.isFile());
		// System.out.println("文件名"+file.getName());
		// System.out.println("绝对路径"+file.getAbsolutePath());
		// System.out.println("父级路径"+file.getParent());
		// System.out.println("文件大小(单位字节)"+file.length());
		// System.out.println("创建文件(不存在)"+file.createNewFile());
		// System.out.println("创建文件夹"+file.mkdir());
		// System.out.println("递归创建文件夹"+file.mkdirs());

		// InputStream is=new FileInputStream(file);
		// byte[] b=new byte[(int) file.length()];
		// is.read(b);
		// System.out.println(new String(b));

		// Reader reader=new FileReader(file);
		// char[] c=new char[(int) file.length()];
		// reader.read(c);
		// String str=new String(c);
		// System.out.println(str);

		// OutputStream os=new FileOutputStream(file, true);
		// String ww="asdfghasfd";
		// os.write(ww.getBytes());
		// System.out.println("写入完成");

		// Writer writer=new FileWriter(file, true);
		// writer.write("aaaaaaaaaaasssssssd");
		// writer.close();
		// System.out.println("写入完成");

		// InputStream is = new FileInputStream(file);
		// InputStreamReader isr = new InputStreamReader(is);

		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
		reader.close();
	}

}
