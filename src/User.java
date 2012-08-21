package jp.co.dhw.review2				// Q1 ;を忘れていた

public class User {						// Q1 ◯

	public static Intejer id;			// Q2
	public static String firstName;		// Q2
	public static String lastName;		// Q2
	public void showName(String name);	// Q2

	System.out.println(getFirstName + ":" + getLastName); // Q2	

	getter								// Q3
										// Q3
										// Q3

	public static String uji = new String("氏");		// Q4
	public static String na = "名";					// Q4

	Person p1 = showName();		// Q4
	p1.firstName = "尭";			// Q4
	p1.lastName = "今田";		// Q4
	p1.showName();				// Q4

	Person p2 = showName();		// Q4
	p1.firstName = "真悟";		// Q4
	p1.lastName = "酒見";		// Q4
	p1.showName();				// Q4

	Person p3 = showName();		// Q4
	p1.firstName = "初美";		// Q4
	p1.lastName = "内藤";		// Q4
	p1.showName();				// Q4

	Person p4 = showName();		// Q4
	p1.firstName = "有希子";		// Q4
	p1.lastName = "長尾";		// Q4
	p1.showName();				// Q4

	Person p5 = showName();		// Q4
	p1.firstName = "修平";		// Q4
	p1.lastName = "永野";		// Q4
	p1.showName();				// Q4

	Person p6 = showName();		// Q4
	p1.firstName = "香";			// Q4
	p1.lastName = "高木";		// Q4
	p1.showName();				// Q4

	Person p7 = showName();		// Q4
	p1.firstName = "清司";		// Q4
	p1.lastName = "原田";		// Q4
	p1.showName();				// Q4

	Person p8 = showName();		// Q4
	p1.firstName = "憲和";		// Q4
	p1.lastName = "武末";		// Q4
	p1.showName();				// Q4

	Person p9 = showName();		// Q4
	p1.firstName = "大悟";		// Q4
	p1.lastName = "榎枝";		// Q4
	p1.showName();				// Q4

	Person p10 = showName();	// Q4
	p1.firstName = "龍真";		// Q4
	p1.lastName = "野口";		// Q4
	p1.showName();				// Q4

}							// Q1

public class Seito extends User {	// Q5

}									// Q5

public class Kyoshi extends User {	// Q5

	public static String subject;				// Q6
	public static void main(String[] args){		// Q6
		return.this.getSubject();				// Q6
	}											// Q6

	Person p11 = showName();					// Q6
	p11.firstName = "大輔";						// Q6
	p11.lastName = "長澤";						// Q6
	p11.showName();								// Q6
	
	Person p12 = showName();					// Q6
	p12.firstName = "ジェイソン";					// Q6
	p12.lastName = "ラディ";						// Q6
	p12.showName();								// Q6
	
	Person p13 = showName();					// Q6
	p13.firstName = "隆";						// Q6
	p13.lastName = "薄井";						// Q6
	p13.showName();								// Q6
	
	Person p14 = showName();					// Q6
	p14.firstName = "浩司";						// Q6
	p14.lastName = "山本";						// Q6
	p14.showName();								// Q6
	
	Person p15 = showName();					// Q6
	p16.firstName = "ノブユキ";					// Q6
	p16.lastName = "ハナブサ";					// Q6
	p15.showName();								// Q6
	
	Person p16 = showName();					// Q6
	p16.firstName = "ヨシツグ";					// Q6
	p16.lastName = "コヌマ";						// Q6
	p16.showName();								// Q6
	
	Person p17 = showName();					// Q6
	p17.firstName = "昇治";						// Q6
	p17.lastName = "渡部";						// Q6
	p17.showName();								// Q6


	System.out.println(lastName + ":" + firstName);	// Q7

	System.out.println(教科 + ":" + デザイン);	// Q8 表示に＜教師＞クラスのインスタンスのとき　強化 : デザイン　のようにサブジェクト表示

}									// Q5