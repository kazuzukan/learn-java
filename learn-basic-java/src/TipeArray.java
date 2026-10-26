public class TipeArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Aku";
        arrayString[1] = "Namanya";
        arrayString[2] = "Ripang";

        System.out.println(arrayString[0]);

        String[] arrayString2 = new String[3];
        int[] arrayInt = {1,2,3};
        long[] arrayLong = new long[]{10,20};
        Integer[] arrayInteger = new Integer[]{90, 100, null};

        System.out.println(arrayLong.length);
        System.out.println(arrayInteger.length);

        // Array 2 dimensi
        String[][] members = {
            {"Risyad", "Pangestu"},
            {"Nadindra", "Akhila"},
        };

        System.out.println("member 1 " + members[0][0]);
        System.out.println("member 2 " + members[1][0]);
    }
}
