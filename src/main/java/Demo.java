public class Demo {

    public static void main(String[] args) {
//        String private = "aa";
        int i = 0;
        i = i++;
        System.out.println(i);

        AAA a = new BBB();
        a.test();
    }
}

class AAA {
    public int i = 10;
    public void test(){
        System.out.println(i+10);
    }
}
class BBB extends AAA {
    public int i = 20;
   /* public void test(){
        System.out.println(i+20);
    }*/
}