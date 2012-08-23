package jp.co.dhw.review2;				// Q1 ;を忘れていた
										// Q1 jp.co.dhw.review2 ←　パッケージ名
										// Q1 jp/co/dhw/review2　という階層構造のディレクトリを作る。

//　Q1 パッケージ jp.co.dhw.review2
// ＜ユーザ＞という名前のクラス定義をしてください。 

public class User {						// Q1 ◯

//	Q2 ＜ユーザ＞クラスの仕様は、
//	　Integer型のインスタンス変数id、
//	　String型のインスタンス変数firstName、
//	　String型のインスタンス変数lastName		を持ち
//	　インスタンスメソッド showName() を持ちます
//	　引数、戻り値はありません。
//	　firstNameの値とlastNameの値を”:”で連結させてコンソールに出力する。 

//	public static Intejer id;										// Q2 staticは不要
																	// Q2 Intejer ×　Integer ◯
	public Integer id;					
//	public static String firstName;									// Q2 staticは不要
	public String firstName;
	
//	public static String lastName;									// Q2 staticは不要
	public String lastName;
	
//	public void showName(String name);								// Q2 ()の中は空白
	public void showName() {
//		System.out.println(getFirstName + ":" + getLastName); 		// Q2 getは不要、thisが必要
		System.out.println(this.firstName + ":" + this.lastName);	// Q2 this = 自分のインスタンスの
	}
	
// Q3 全てのインスタンス変数をインスタンス生成時に引数によって初期化できるようにしてください。 	
	
//	getter															// Q3 すべてのインスタンス変数をインスタンス生成時に引数によって初期化できるようにしてください。
	public User(Integer id1,String firstName1,String lastName1){	// Q3 戻り値も型の指定もない。引数
		this.id = id1; 												// Q3 コンストラクター
		this.firstName = firstName1;
		this.lastName = lastName1;
		id1.toString();
	}
// Q4 この教室の受講生の中から任意の10名の方の名前を使って、
//	  インスタンスを生成し表示するプログラムを作ってください。 idは任意でいいです。
//	【表示例】	id ➡ 1 	氏名➡和田充史
	
public static void main(String[] args){				// Q4 プログラムのときは必ずmainメソッドがある。
	User user1 = new User(1,"和田","充史");			// インスタンスを生成し表示するプログラム
//	System.out.print("氏名→");
//	user1.showName();
//	System.out.println("ID→" + user.id);
	users[0] = user1;	// 10人分配列に入れる
	for(User u: users){		// users Collectionクラスのインスタンス(User配列)
		u.show();
	}
	// User配列を定義時に一回で作る方法
	User[] users = {
			new User(1, "和田", "充史"),
			new User(10,"", ""),
	};
		User[] ss = {
				new Student(1, "花田", "恒一"),
				new Student(22, "武田","憲隆"),
				new Teacher(1, "和田","充史", "プログラミング"),
				new Teacher(10, "渡辺", "高志", "ディレクター")
		};
		
		for(User s: ss){
			if (s instanceof Teacher){
				Teacher t = (Teacher)s;
				t.subject = "ほげ";
				System.out.println("教科：" + t.getSubject());
			}
		}
	}
}
//public void show(){
//	System.out.println("ID→" + this.id);
//	System.out.println("氏名→" + this.firstName + this.lastName);
//}
//	public static String uji = new String("氏");		// Q4
//	public static String na = "名";					// Q4
//
//	Person p1 = showName();		// Q4
//	p1.firstName = "尭";			// Q4
//	p1.lastName = "今田";		// Q4
//	p1.showName();				// Q4
//
//	Person p2 = showName();		// Q4
//	p1.firstName = "真悟";		// Q4
//	p1.lastName = "酒見";		// Q4
//	p1.showName();				// Q4
//
//	Person p3 = showName();		// Q4
//	p1.firstName = "初美";		// Q4
//	p1.lastName = "内藤";		// Q4
//	p1.showName();				// Q4
//
//	Person p4 = showName();		// Q4
//	p1.firstName = "有希子";		// Q4
//	p1.lastName = "長尾";		// Q4
//	p1.showName();				// Q4
//
//	Person p5 = showName();		// Q4
//	p1.firstName = "修平";		// Q4
//	p1.lastName = "永野";		// Q4
//	p1.showName();				// Q4
//
//	Person p6 = showName();		// Q4
//	p1.firstName = "香";			// Q4
//	p1.lastName = "高木";		// Q4
//	p1.showName();				// Q4
//
//	Person p7 = showName();		// Q4
//	p1.firstName = "清司";		// Q4
//	p1.lastName = "原田";		// Q4
//	p1.showName();				// Q4
//
//	Person p8 = showName();		// Q4
//	p1.firstName = "憲和";		// Q4
//	p1.lastName = "武末";		// Q4
//	p1.showName();				// Q4
//
//	Person p9 = showName();		// Q4
//	p1.firstName = "大悟";		// Q4
//	p1.lastName = "榎枝";		// Q4
//	p1.showName();				// Q4
//
//	Person p10 = showName();	// Q4
//	p1.firstName = "龍真";		// Q4
//	p1.lastName = "野口";		// Q4
//	p1.showName();				// Q4

}							// Q1

//public class Seito extends User {	// Q5 別ファイルへ
//}									// Q5

//public class Kyoshi extends User {	// Q5 別ファイルへ
//
//	public static String subject;				// Q6
//	public static void main(String[] args){		// Q6
//		return.this.getSubject();				// Q6
//	}											// Q6
//
//	Person p11 = showName();					// Q6
//	p11.firstName = "大輔";						// Q6
//	p11.lastName = "長澤";						// Q6
//	p11.showName();								// Q6
//	
//	Person p12 = showName();					// Q6
//	p12.firstName = "ジェイソン";					// Q6
//	p12.lastName = "ラディ";						// Q6
//	p12.showName();								// Q6
//	
//	Person p13 = showName();					// Q6
//	p13.firstName = "隆";						// Q6
//	p13.lastName = "薄井";						// Q6
//	p13.showName();								// Q6
//	
//	Person p14 = showName();					// Q6
//	p14.firstName = "浩司";						// Q6
//	p14.lastName = "山本";						// Q6
//	p14.showName();								// Q6
//	
//	Person p15 = showName();					// Q6
//	p16.firstName = "ノブユキ";					// Q6
//	p16.lastName = "ハナブサ";					// Q6
//	p15.showName();								// Q6
//	
//	Person p16 = showName();					// Q6
//	p16.firstName = "ヨシツグ";					// Q6
//	p16.lastName = "コヌマ";						// Q6
//	p16.showName();								// Q6
//	
//	Person p17 = showName();					// Q6
//	p17.firstName = "昇治";						// Q6
//	p17.lastName = "渡部";						// Q6
//	p17.showName();								// Q6
//
//
//	System.out.println(lastName + ":" + firstName);	// Q7
//
//	System.out.println(教科 + ":" + デザイン);	// Q8 表示に＜教師＞クラスのインスタンスのとき　強化 : デザイン　のようにサブジェクト表示
//
//}									// Q5