public class SwitchStatement {
    public static void main(String[] args) {
        final String nilaiA = "A";
        final String nilaiB = "B";

        String nilai = "A";

        switch (nilai) {
            case nilaiA :
                System.out.println("Nilai Anda A");
                break;

            default :
                System.out.println("Nilai Anda Jelek");

        }

        // Swith lambda
        switch (nilai) {
            case nilaiA, nilaiB -> System.out.println("Nilai Anda Baguss");
            default -> {
                System.out.println("Nilai Anda Jelek");
            }
        }

        // Swith lambda tanpa yield
        String ucapan;
        switch (nilai) {
            case nilaiA, nilaiB -> ucapan = "Nilai Anda Baguss";
            default -> {
               ucapan = "Nilai Anda Jelek";
            }
        }
        System.out.println(ucapan);

        // switch dengan yield
        String ucapan2 = switch (nilai) {
            case nilaiA, nilaiB :
                yield "Nilai Anda Baguss";
            default :
               yield  "Nilai Anda Jelek";
        };
        System.out.println(ucapan2);

    }
}
