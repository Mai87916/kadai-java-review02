
public class SevenNumber {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++) {
                if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                    // iの値を表示する
                    System.out.println("i = "+ "clap!" );
                }else {
                    System.out.println("i = " + i);
                }
        }

    }

}
