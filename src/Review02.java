
public class Review02 {

    public static void main(String[] args) {
        // iの値が1から100より小さい間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            // iの値が3かつ５で割り切れるとき
            if (i % 3 == 0 && i % 5 == 0) {
                // FizzBuzzを表示する
                System.out.println("FizzBuzz");
            // iの値が３で割り切れるとき
            } else if (i % 3 == 0 ) {
                // Fizzを表示する
                System.out.println("Fizz");
             // iの値が５で割り切れるとき
            } else if ( i % 5 == 0 ) {
                // Buzzを表示する
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}
