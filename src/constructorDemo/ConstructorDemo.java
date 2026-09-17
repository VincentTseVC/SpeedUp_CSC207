package constructorDemo;

class P {
    P() { System.out.println("Inside P"); }
}

class Q extends P {
    // 可寫 可不寫
    public Q() {
        super();
        System.out.println("Inside Q");
    }
}

////////////////////////////////////

class P2 {
    P2(int x) {
        System.out.println("Inside P2 " + x);
    }
}

class Q2 extends P2 {
    Q2() { super(6666); }
    Q2(int x) { super(x); }
    Q2(String wtf, boolean tmd) { super(10); }
}

////////////////////////////////////
class P3 {
    P3() { System.out.println("Inside P3 default"); }
    P3(int x) { System.out.println("Inside P3 " + x); }
}

class Q3 extends P3 {
    // 可不寫
}



// 永遠 從parent class -> child class
// 會自動叫 super()
//
// * 如果 parent 沒有 default constructor, 但有其他的 constructors
//   那 child class 就必須 手動寫 super(....)

public class ConstructorDemo {
    public static void main(String[] argv) {
        P x1 = new Q();
        Q x2 = new Q();
        P2 y1 = new Q2();
        Q2 y2 = new Q2();
        P3 z1 = new Q3();
        Q3 z2 = new Q3();
    }
}
