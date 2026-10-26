public class Recursive {
    public static void main(String[] args) {
        int result = factorialLoop(3);
        System.out.println(result);

        int result2 = factorialRec(3);
        System.out.println(result2);

        overFlow(1000000000);
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (var i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    // recursive
    static int factorialRec(int value) {
        int result = 0;
        if (value == 1) {
            return 1;
        }

        result = value * factorialRec(value - 1);
        return result;
    }

    // recursive overflow
    static void overFlow(int loop) {
        if (loop == 1) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke - " + loop);
            overFlow(loop - 1);
        }
    }
}
