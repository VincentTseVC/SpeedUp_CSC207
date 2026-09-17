package exceptionDemo;

public class driver {

    /*
        如果 parent class 是 Exception (compile time)
            1. 一定 要在 method header 去 declare "throws ......"
            2. 一定 要在 "最後" 放在 try { }

        如果 parent class 是 RuntimeException
            1. 可以選擇 在 method header 去 declare "throws ......"
            2. 可以選擇 在 "最後" 放在 try { }
               * 如果選擇 declare "throws ..." 也不一定要放在 try
     */

    public static void main(String[] argv) {
        Cat mua = new Cat();
        Owner vc = new Owner();
        // 不可以 這麼做!!!
        // mua.killCat();

        // 可以 這麼做..
        // mua.eatCat();
        // mua.eatCat2();

        try {
            // int a = 1 / 0;
            // mua.eatCat();
            vc.killCat();
            // mua.killCat();
            mua.eatCat2();
        } catch (CatUnkillableException ex1) {
            System.out.println("WTF WHY ARE U TRYING TO KILL CAT...");
        } catch (CatUneatableException ex2) {
            System.out.println("and now you wanna eat cat ????");
        } finally {
            System.out.println("Cats are always cute :3");
        }

        System.out.println("Im still here ....");
     }
}
