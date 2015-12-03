package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;

public class ExamEvent {
	/**
	 * Constructeur vide de la classe ExamEvent
	 */
	public ExamEvent() {		
	}
	/**
	 * Constructeur de la classe ExamEvent
	 * @param date
	 * @param person
	 * @param jury
	 * @param classRoom
	 * @param document
	 */
	public ExamEvent(Date date, Person person, ArrayList<Person> jury,
					Classroom classRoom, ArrayList<Document> document) {
		examDate = date;
		student = person;
		this.jury = jury;
		classroom = classRoom;
		documents = document;
	}
	
	protected Date examDate;
	protected Person student;
	protected ArrayList<Person> jury;
	protected Classroom classroom;
	protected ArrayList<Document> documents;
	/**
	 * Accesseur qui recupere et retourne examDate
	 * @return examDate
	 */
	public Date getExamDate() {
		return examDate;
	}
	/**
	 * Accesseur qui permet d'affecter une nouvelle valeur a examDate
	 * @param examDate
	 */
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	/**
	 * Accesseur qui recupere et retourne l'edtudiant
	 * @return student
	 */
	public Person getStudent() {
		return student;
	}
	/**
	 * 
	 * @param student
	 */
	public void setStudent(Person student) {
		this.student = student;
	}
	/**
	 * Accesseur qui recupere et retourne la liste de jury
	 * @return jury
	 */
	public ArrayList<Person> getJury() {
		return jury;
	}
	/**
	 * Accesseur qui permet d'affecter un nouveau jury
	 * @param jury
	 */
	public void setJury(ArrayList<Person> jury) {
		this.jury = jury;
	}
	/**
	 * Accesseur qui recupere et retourne classroom
	 * @return classroom
	 */
	public Classroom getClassroom() {
		return classroom;
	}
	/**
	 * Accesseur qui permet d'affecter une nouvelle classe
	 * @param classroom
	 */
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	/**
	 * 
	 * @return documents
	 */
	public ArrayList<Document> getDocuments() {
		return documents;
	}
	/**
	 * Accesseur qui permet d'affecter un nouveau document
	 * @param documents
	 */
	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

	 
}
