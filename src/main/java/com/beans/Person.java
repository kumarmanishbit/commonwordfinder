package com.beans;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {

	static int count = 0;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;

	}

	public boolean equals(Object object) {

		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}

		Person person = (Person) object;
	//	System.out.println(person.getName());
		// file 2 data
		List<String> personTwo = new ArrayList<String>();
		String arrayPerson[] = this.getName().split(" ");
		for (int i = 0; i < arrayPerson.length; i++) {
			personTwo.add(arrayPerson[i]);
		}
		// String personOne[]=person.getName().split(" ");
		boolean flagCheck = true;
		arrayPerson = null;
		arrayPerson = person.getName().split(" ");
		// String personTwo[]=this.getName().split(" ");
		//System.out.println("first Person " + this.getName() + "Second Person " + person.getName());
		for (int i = 0; i < arrayPerson.length; i++) {
			if (!personTwo.contains(arrayPerson[i])) {
			//	System.out.println("Matching");
				flagCheck=false;
				break;
			}
			flagCheck = true;
		}
		// System.out.println(count);
	//	System.out.println(flagCheck);
		return flagCheck;
	}

}
