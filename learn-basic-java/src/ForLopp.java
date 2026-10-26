public class ForLopp {
    public static void main(String[] args) {
        // For Lopp
        for(int counter = 1; counter <= 10; counter++) {
            System.out.println("Ngulang Ke - " + counter);
        }

        // While Loop
        var whileCounter = 1;
        while(whileCounter <= 10) {
            System.out.println("Ulang ke - " + whileCounter);
            whileCounter++;
        }

        // do while
        var counterDo = 1;
        do {
            System.out.println("do ulang ke - " + counterDo);
            counterDo++;
        } while (counterDo < 1);
    }
}
