public class konversiNumber {
    public static void main(String[] args) {
        // koversi tipe data
        // Otomatis cast : byte -> short -> int -> long -> float -> double
        // Manual : kebalikan otomatis

        // otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // manual
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

    }
}
