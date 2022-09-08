package bridgelabz.javapractice.Basics;

class B {
    int i;
    void display(){
        System.out.println("class A");
    }
}
public class DemoA {
	int j;
    void display(){
        System.out.println("class DemoA");
    }
    public static void main(String[] args) {
        DemoA a = new DemoA();
        a.display();
        B oa = new B();
        oa.display();
    }
}
