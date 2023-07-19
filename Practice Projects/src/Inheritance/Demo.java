package Inheritance;

public class Demo {

    public static void main(String[] args) {
        zi z = new zi();
        z.method();
    }
}
class fu {
        int num = 20;

}

class zi extends fu {

    int num = 10;
    public void method() {
        System.out.println(num);
        System.out.println(super.num);
    }
}

