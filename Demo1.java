package bridgelabz.javapractice.Basics;


class A {
int i;
void display(){
    System.out.println("class A");
}
}

public class Demo1 extends A {
int j;
void display(){
    System.out.println("class DemoA");
}
public static void main(String[] args) {
    Demo1 b = new Demo1();
    b.display();
    A oa = new A();
    oa.display();
}
}
