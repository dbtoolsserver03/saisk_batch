package jp.co.yahoo.hw.ym20230205.saisk.test.exe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class TestA07 {

	public static void main(String[] args) {
		
		try {
			List<String> strLst = getFileContent(new File("C:\\file\\from\\1.txt"), "utf-8");
			
			for (String str : strLst) {
				System.out.println(str);
			}
			
			
			putFileContent(strLst, "C:\\file\\to\\", "2.txt", "utf-8");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<String> getFileContent(File f, String encode)
			throws Exception {
		List<String> retList = new ArrayList<String>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(f),
				encode));

		while (reader.ready()) {
			retList.add(reader.readLine());
		}
		reader.close();
		return retList;
	}
	
	
	
	public static void putFileContent(List<String> strLst, String newPath, String newNm, String encode)
			throws Exception {

		File file = new File(newPath);
		file.mkdirs();
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(newPath + newNm), encode));

		for (String str : strLst) {
			writer.write(str);
			writer.newLine();
			
			// 清除缓存
			writer.flush();
		}

		writer.close();
	}
	
	
}
