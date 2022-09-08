package bridgelabz.javapractice.Basics;

public class Student {
	int studentid;
	int mobilenumber;
	void setvalues(int mno, int id) {
		mobilenumber = mno;
		studentid = id;
	}
	void getobject(Student obj) {
		System.out.println(mobilenumber+" : " +studentid);
		System.out.println(obj.mobilenumber+" : "+ obj.studentid);
	}
	public static void main(String[] args) {
		Student nani = new Student();
		Student pooja = new Student();
		nani.setvalues(34534, 1);
		pooja.setvalues(34543, 4);
		nani.getobject(pooja);
	}
}
