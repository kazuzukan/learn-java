public class VariableArgument {
    public static void main(String[] args) {
        int[] values = {100, 90, 70};
        sayCongrats("Ripang", values);
        sayCongrats("Nadin", 100, 100);
    }

    // tanpa variable argument -> int[]
    static void sayCongrats(String name, int... values) {
        int total = 0;
        // for each
        for (var value : values) {
            total += value;
        }

        // final value
        int finalVale = total / values.length;
        if (finalVale >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Wooo and gagal ya " + name);
        }
    }
}
