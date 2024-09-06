
package overloading;

public class Keyword {
    void m(){System.out.println("method is invoked");}
    void n(){this.m();}
    void p(){n();}
    public static void main(String[] args) {
        Keyword s1 = new Keyword();
        s1.p();
    }
}
