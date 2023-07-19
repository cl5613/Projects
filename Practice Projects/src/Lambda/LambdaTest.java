package Lambda;

import java.util.Random;

public class LambdaTest {

    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });

        System.out.println("----------");
        useRandomNumHandler(() -> new Random().nextInt(100) + 1);
    }

    public static void useRandomNumHandler(RandomNumHandler rnh) {

        int result = rnh.getNumber();
        System.out.println(result);
    }
}
interface RandomNumHandler {

    int getNumber();
}
