public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 20;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Anda Gagallll!!!");
        }

        // else if
        if (nilai > 80 && absen >= 80) {
            System.out.println("NILAI A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("NILAI B");
        } else {
            System.out.println("NILAI JELEK!");
        }
    }
}
