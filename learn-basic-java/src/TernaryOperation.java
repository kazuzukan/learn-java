public class TernaryOperation {
    public static void main(String[] args) {
        var nilai = 75;

        if (nilai >= 75) {
            System.out.println("Selemat");
        } else {
            System.out.println("Boooo");
        }

        // dengan ternary
        String ucapan = nilai >= 75 ? "Selamat" : "Booooo";
        System.out.println(ucapan);
    }
}
