package jp.co.dhw.review2;

public class Teacher extends User {
	public String subject;
	public Teacher(Integer i, String t, String l, String sub){
		super(i,t,l);
		this.subject = sub;
	}
	public String getSubject(){
		return this.subject;
	}
}
