package com.miniproject.grpp;

public class Quizz {
	
	
	public String Option1;
	public String Option2;
	public String Option3;
	public String Option4;
	private String Questions;
	

	public Quizz(String questions, String option1, String option2, String option3, String option4) {
		super();
		this.Questions =questions;
		this.Option1 = option1;
		this.Option2 = option2;
		this.Option3 = option3;
		this.Option4 = option4;
	}

	public String getQuestions() {
		return Questions;
	}

	public void setQuestions(String questions) {
		Questions = questions;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String option4) {
		Option4 = option4;
	}

	@Override
	public String toString() {
		return "Quize [Questions=" + Questions + ", Option1=" + Option1 + ", Option2=" + Option2 + ", Option3="
				+ Option3 + ", Option4=" + Option4 + "]";
	}


}
