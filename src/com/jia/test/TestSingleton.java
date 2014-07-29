package com.jia.test;  

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * @author jiawenlong
E-mail:  jwl_yifeng@163.com
 * 创建时间：2014年7月29日 下午2:08:25  
 * 类说明
 */
public class TestSingleton {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Process p = Runtime.getRuntime().exec(
		        "C:/windows/system32/ping.exe baidu.com");
		//get process input stream and put it to buffered reader
		BufferedReader input = new BufferedReader(new InputStreamReader(
		        p.getInputStream()));
		 
		String line;
		while ((line = input.readLine()) != null) {
		    System.out.println(line);
		}
		 
		input.close();
	}

}
