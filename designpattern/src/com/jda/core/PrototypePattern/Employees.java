package com.jda.core.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<>();
	}

	public Employees(List<String> list) {
		empList = list;
	}

	public void loadData() {
		empList.add("Apoorva");
		empList.add("Mishra");
		empList.add("Ashish");
		empList.add("Goel");
	}

	public List<String> getList() {
		return this.empList;
	}

	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String s : empList) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}
