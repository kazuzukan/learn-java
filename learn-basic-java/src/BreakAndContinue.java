public class BreakAndContinue {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke - " + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        // Continue
        // Cetak ganjil
        for (int counterNumber = 1; counterNumber <= 10; counterNumber++) {
            if (counterNumber % 2 == 0) {
                System.out.println(counterNumber + "Adalah Genap");
                continue;
            }

            System.out.println(counterNumber + "Adalah Ganjil");
        }
    }
}
