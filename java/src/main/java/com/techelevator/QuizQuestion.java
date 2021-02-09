package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestion {
	private String question;
	private List<String> answers = new ArrayList();
	private int correctAnswer;
	
	// Constructor
	public QuizQuestion(String question, List<String> answers, int correctAnswer) {
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
	}
	
	// Getters
	public String getQuestion() {
		return question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	
	
}
