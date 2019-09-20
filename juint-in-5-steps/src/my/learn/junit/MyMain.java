package my.learn.junit;

public class MyMain {
    int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        return sum;
    }
}
