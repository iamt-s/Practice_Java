package ab;

import ab.Outer.Inner;

class Outer {
    static class Inner {
        void display() {
            System.out.println("Base Inner class");
        }
    }
}

class ChildInner extends Outer.Inner {
    ChildInner() {
        super();  // Required to call constructor of static nested class
    }

    @Override
    void display() {
        System.out.println("Child class of static nested class");
    }
}

public class Test {
    public static void main(String[] args) {
        ChildInner child = new ChildInner();
        child.display();  // Output: Child class of static nested class
        Inner child2=new Outer.Inner();
        child2.display();
    }
}
