package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Person;

public class FileReaderClass {

	public static void main(String[] args) {

		// Array list to store first file
		List<Person> wordSetOne = new ArrayList<Person>();
		// Array list to store second file
		List<Person> wordSetTwo = new ArrayList<Person>();
		// Set to store common word

		Set<Person> matchWords = new HashSet<Person>();

		/*matchWords.addAll(wordSetOne);
		wordSetOne.clear();
		wordSetOne.addAll(matchWords);
		

		matchWords.addAll(wordSetTwo);
		wordSetTwo.clear();
		wordSetTwo.addAll(matchWords);*/
		
		Person person;

		BufferedReader fileReaderONE = null, fileReaderTWO = null;

		try {

			String line;

			fileReaderONE = new BufferedReader(new FileReader("datasource/File1.txt"));
			fileReaderTWO = new BufferedReader(new FileReader("datasource/File2.txt"));

			while ((line = fileReaderONE.readLine()) != null) {
				person = new Person();
				person.setName(line.toLowerCase());
				wordSetOne.add(person);

			}

			System.out.println(wordSetOne.size());

			while ((line = fileReaderTWO.readLine()) != null) {
				person = new Person();
				person.setName(line.toLowerCase());
				wordSetTwo.add(person);
			}

			System.out.println(wordSetTwo.size());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReaderONE != null)
					fileReaderONE.close();
				if (fileReaderTWO != null)
					fileReaderTWO.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		int listOneSize = wordSetOne.size();
		int listTwoSize = wordSetTwo.size();
int count=0;
		for (int i = 0; i < listOneSize; i++) {

			for (int j = 0; j < listTwoSize; j++) {
				// System.out.println(wordSetOne.get(i).getName());
				if(wordSetOne.get(i).equals(wordSetTwo.get(j)))
				{
					System.out.println(wordSetOne.get(i).getName());
					matchWords.add(wordSetOne.get(i));
					count++;
				}
				}
		}
		System.out.println("Matching word : "+matchWords.size());

		/*
		 * int count = 0; for (int i = 0; i < matchWords.size(); i++) {
		 * 
		 * count++; System.out.println("Word Matched "+count); }
		 */

	}

}
