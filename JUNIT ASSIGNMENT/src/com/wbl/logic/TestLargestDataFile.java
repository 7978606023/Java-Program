package com.wbl.logic;

import junit.framework.*;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TestLargestDataFile extends TestCase {

	public TestLargestDataFile(String name) {
		super(name);
	}


	public void testFromFile() throws Exception {
		String line;
		BufferedReader rdr = new BufferedReader(new FileReader("testdata.txt"));
		while ((line = rdr.readLine()) != null)
			if (line.startsWith("#")) 
				continue;

		StringTokenizer st = new StringTokenizer(line);
		if (!st.hasMoreTokens())
			continue; 

		String val = st.nextToken();
		int expected = Integer.valueOf(val).intValue();
		
		ArrayList argument_list = new ArrayList();
		while (st.hasMoreTokens())
			argument_list.add(Integer.valueOf(st.nextToken()));

		int[] arguments = new int[argument_list.size()];
		for (int i = 0; i < argument_list.size(); i++)
			arguments[i] = ((Integer) argument_list.get(i)).intValue();

		assertEquals(expected,Largest.largest(arguments));

	}
}
