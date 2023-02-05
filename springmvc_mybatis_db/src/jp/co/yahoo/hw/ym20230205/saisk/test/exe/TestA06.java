package jp.co.yahoo.hw.ym20230205.saisk.test.exe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestA06 {

	
	public static void main(String[] args) {
	
		List<String> strLst = new ArrayList<String>();
		strLst.add("h");
		strLst.add("e");
		strLst.add("l");
		strLst.add("l");
		strLst.add("o");
		strLst.add("w");
		strLst.add("o");
		strLst.add("l");
		strLst.add("d");
		
		
		System.out.println("-----  new ArrayList");
		List<String> lst = new ArrayList<String>();
		
		for (String str : strLst) {
			lst.add(str);
		}

		for (String str : lst) {
			System.out.println(str);
		}
		
		System.out.println("-----  new HashSet  集合里面的元素会 散列排序");
		Set<String> set = new HashSet<String>();
		
		for (String str : strLst) {
			set.add(str);
		}
		
		for (String str : set) {
			System.out.println(str);
		}
		
		
		System.out.println("-----  new LinkedHashSet  集合里面的元素会按照ADD时顺序的排序");
		Set<String> linkedSet = new LinkedHashSet<String>();
		
		for (String str : strLst) {
			linkedSet.add(str);
		}
		
		for (String str : linkedSet) {
			System.out.println(str);
		}
		
		
		System.out.println("-----  new TreeSet  集合里面的元素会按升序排序");
		Set<String> treeSet = new TreeSet<String>();
		
		for (String str : strLst) {
			treeSet.add(str);
		}
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		

		System.out.println("-----  new HashMap  集合里面的元素会 散列排序");
		Map<String,String> map = new HashMap<String,String>();
		
		for (String str : strLst) {
			map.put(str, str);
		}
		
		for (Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("-----  new LinkedHashMap  集合里面的元素会按照put时顺序的排序");
		Map<String,String> linkedmap = new LinkedHashMap<String,String>();
		
		for (String str : strLst) {
			linkedmap.put(str, str);
		}
		
		for (Entry<String,String> entry : linkedmap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		System.out.println("-----  new TreeMap  集合里面的元素会按升序排序");
		Map<String,String> treemap = new TreeMap<String,String>();
		
		for (String str : strLst) {
			treemap.put(str, str);
		}
		
		for (Entry<String,String> entry : treemap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}



