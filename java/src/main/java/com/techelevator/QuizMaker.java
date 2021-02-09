package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {
	public static List <QuizQuestion> questions = new ArrayList<>();
	public static void main(String[] args) {
	
		loadData();
}
	public static void loadData() {
		
	}
	
	public static QuizQuestion getQuestion(String quizLine) {
		String [] data = quizLine.split("\\|");
		if(data.length > 0) {
			String question = data[0];
			List<String> answers = new ArrayList<>();
			int correctAnswer = 0;
			for (int i = 1; i < data.length; i++) {
				String answer = data[i];
				
				if(answer.endsWith("*")) {
					answer = answer.substring(0, answer.length() - 1);
					correctAnswer = i;
				}
				
				answers.add(answer);
			}
			QuizQuestion newQuestion = new QuizQuestion(question, answers, correctAnswer);
			questions.add(newQuestion);
			return newQuestion;
		}
		return null;
		
	}
}