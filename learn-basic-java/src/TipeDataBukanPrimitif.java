public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // Tipe data bukan primitif itu tidak punya default value -> harus ada initialisasi defaultnya bisa diisi null
        // Kalau yang primitif dia punya default value


        Integer initInteger = 100;
        Long iniLong = 100000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        // konversi dari primitif -> bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        System.out.println(iniInteger2);

        // contoh konversi 2
        // tipe data bukan primitif ini punya method
        int age = 30;
        Integer ageObject = age;

        int ageInt = ageObject;
        short ageShort = ageObject.shortValue();
        long ageLong = ageObject.longValue();
        float floatAge = ageObject.floatValue();

        System.out.println("Long age: " + ageLong);
        System.out.println("float age: " + floatAge);
    }
}
