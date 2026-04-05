
abstract class A {
    public void show() {
        System.out.println("In A");
    }
}

abstract class B {
    public void show() {
        System.out.println("In B");
    }
}

class C {
    public void show() {
        System.out.println("In C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}