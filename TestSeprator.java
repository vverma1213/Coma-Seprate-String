package com.csvseprator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSeprator
{
	public static void main(String arg[])
	{
		String csvString = "karan,arjun,ramu,shyamu";
		List<String> strList = converString(csvString);
		Iterator<String> itr = strList.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	private static List<String> converString(String csvString)
	{
		List<String> str = new ArrayList<String>();
		String[] str1 = csvString.split("\\s*,\\s*");
		for (String st2 : str1)
		{
			str.add(st2);
		}
		return str;
	}

}
