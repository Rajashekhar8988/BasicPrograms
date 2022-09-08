package bridgelabz.javapractice.Basics;

public class Student1 
{
		int studentid;
		int mobilenumber;
		
		Student1(int studentid, int mobilenumber ){
			this.studentid=studentid;
			this.mobilenumber=mobilenumber;
		}
		void getobject(Student1 obj) {
			System.out.println(mobilenumber+" : " +studentid);
			System.out.println(obj.mobilenumber+" : "+ obj.studentid);
		}
		public static void main(String[] args) {
			Student1 nani = new Student1(34534, 2);
			Student1 pooja = new Student1(34543, 4);
			nani.getobject(pooja);
		}
	}
