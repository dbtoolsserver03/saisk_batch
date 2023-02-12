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
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HomeWork0212 {

	public static void main(String[] args) {

		try {
			runHomeWork("res\\homework\\","input.csv","res\\homework\\","output.csv","utf-8");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
	
	private static void runHomeWork(String inputFolder,String input, String outputFolder,String output, String encode) throws Throwable {
		List<String> strLst = getFileContent(new File(inputFolder + input), "utf-8");

		Map<String,Integer> map = new TreeMap<String ,Integer>();
		for (int  i = 0; i < strLst.size(); i++) {
			if (i==0) {
				continue;
			}
			
			String str = strLst.get(i);
			String[] arrStr = str.split(",");
			String ymd = arrStr[0];
			int ymdMoney = Integer.valueOf(arrStr[1]);
			
			String ym = ymd.substring(0, 6);
			
			if (map.containsKey(ym)) {
				map.put(ym,   map.get(ym) + ymdMoney);
			} else {
				map.put(ym,ymdMoney);
			}
		}
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(outputFolder + output), encode));

		writer.write("月份,销售额");
		writer.newLine();
		for(Entry<String, Integer> entry : map.entrySet()) {
			writer.write(entry.getKey()+"," + entry.getValue());
			writer.newLine();
		}

		writer.close();
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
