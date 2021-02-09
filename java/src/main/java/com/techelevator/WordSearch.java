package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the file that should be searched? ");
		String filePath = userInput.nextLine();
		File dataFile = new File(filePath);
		
		System.out.println("What is the search word you are looking for? ");
		String searchWord = userInput.nextLine();
		String holder = searchWord;
		String upperWord = holder.toUpperCase();
		String lowerWord = holder.toLowerCase();
		String firstLetterCap = holder.substring(0, 1).toUpperCase() + holder.substring(1);
		
		System.out.println("Should the search be case sensitive? (Y/N)");
		String caseReply = userInput.nextLine();
		boolean caseSensitive = false;
		if(caseReply.equals("Y") || caseReply.equals("y")) {
			caseSensitive = true;
		}
		
		try(Scanner dataInput = new Scanner(dataFile)){
		int lineNumber = 1;
		while (dataInput.hasNext()) {
			String lineOfInput = dataInput.nextLine();
			if(caseSensitive && ( -1 < lineOfInput.indexOf(searchWord))) {
				System.out.println(lineNumber + ") " + lineOfInput);
			} else if (!caseSensitive && ( -1 < lineOfInput.indexOf(upperWord) || -1 < lineOfInput.indexOf(lowerWord) || -1 < lineOfInput.indexOf(searchWord) || -1 < lineOfInput.indexOf(firstLetterCap))) {
				System.out.println(lineNumber + ") " + lineOfInput);
			}
			lineNumber += 1;
			
		}  }catch (FileNotFoundException e) {
			System.err.println("The file does not exist.");
		}
		userInput.close();
	}

	}


