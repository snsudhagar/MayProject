package org.login;

import java.io.File;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class HDFCHomePage {

	Map<String, Integer> m;
	private int cusId;

	private String password;

	public void setCusId(int a) {

		if (a == 123100) {
			cusId = 1;
		} else if (a == 123101) {
			cusId = 2;

		} else if (a == 123102) {
			cusId = 3;

		} else {
			cusId = 0;
		}
	}

	public void setPassword(String b) {
		if (b.equals("Ram@123") && cusId == 1) {
			password = "Ram Account is Validated";

		} else if (b.equals("Babu@123") && cusId == 2) {
			password = "Babu Account is Validated";

		}

		else if (b.equals("Anand@123") && cusId == 3) {
			password = "Anand Account is Validated";

		} else {
			password = "Not Matching any account ";
		}
	}

	public int getCusId() {
		if (password.equals("Ram Account is Validated")) {
			Integer integer = m.get("Ram Account is Validated");
			return integer;
		}

		else if (password.equals("Babu Account is Validated")) {
			Integer integer = m.get("Babu Account is Validated");
			return integer;
		} else if (password.equals("Anand Account is Validated")) {
			Integer integer = m.get("Anand Account is Validated");
			return integer;
		} else {
			return 0;
		}

	}

	public void readDataFromDb() throws IOException {
		File f = new File("E:\\NotePad\\Hdfc.txt");
		List<String> readLines = FileUtils.readLines(f);
		m = new LinkedHashMap();
		for (int i = 0; i < readLines.size(); i++) {
			String string = readLines.get(i);
			if (i == 0) { 
				String[] split = string.split(",");
				m.put("Ram Account is Validated", Integer.parseInt(split[2]));
			}
			

			else if (i == 1) {
				String[] split = string.split(",");
				m.put("Babu Account is Validated", Integer.parseInt(split[2]));

			} else {
				String[] split = string.split(",");
				m.put("Anand Account is Validated", Integer.parseInt(split[2]));

			}
		}

	}

}
