package org.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Implementation {

	public static void main(String[] args) throws IOException {
		HDFCHomePage h = new HDFCHomePage();
		h.readDataFromDb();
		h.setCusId(123100);
		h.setPassword("Ram@123");
		// int cusId = h.getCusId();
		// System.out.println(cusId);

		HDFCHomePage h1 = new HDFCHomePage();

		h1.readDataFromDb();
		h1.setCusId(123101);
		h1.setPassword("Babu@123");
		// int cusId2 = h.getCusId();
		// System.out.println(cusId2);

		HDFCHomePage h2 = new HDFCHomePage();

		h2.readDataFromDb();
		h2.setCusId(123102);
		h2.setPassword("Anand@123");
		// int cusId3 = h.getCusId();
		// System.out.println(cusId3);

		// Userdefined List
		// list - genrics - wrapper class- predefined wrapper class
		// list - genrics - wrapper class- user defined wrapper class
		List<HDFCHomePage> li = new ArrayList();
		li.add(h);
		li.add(h1);
		li.add(h2);

		// Iterate a list
		for (int i = 0; i < li.size(); i++) {
			HDFCHomePage hdfcHomePage = li.get(i);
			System.out.println(hdfcHomePage.getCusId());
		}

		// User Defined set
		Set<HDFCHomePage> si = new LinkedHashSet();
		si.add(h);
		si.add(h1);
		si.add(h2);

		for (HDFCHomePage s : si) {
			System.out.println(s.getCusId());
		}
			
			Map<Integer, HDFCHomePage> p= new LinkedHashMap();
			
			p.put(10, h);
			p.put(20, h1);
			p.put(30, h2);
			
			// to get value only from the map 
			
			//collection - super interface of list and set
			
		Collection<HDFCHomePage> values = p.values();
		for(HDFCHomePage v:values) {
			System.out.println(v.getCusId());
			

			
		}

	}
}
