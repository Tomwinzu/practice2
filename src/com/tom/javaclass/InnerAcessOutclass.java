package com.tom.javaclass;

class outClass2 {
    int x = 10;
    class InnerCalss2{
        public int  myMethods() {
            return x;
        }
    }
}

public class InnerAcessOutclass {
    public static void main(String[] args) {

        outClass2 myOut2 = new outClass2();
        outClass2.InnerCalss2 myInner2 = myOut2.new InnerCalss2();
        System.out.println(myInner2.myMethods());

    }

}
