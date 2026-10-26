public class ForEach {
    public static void main(String[] args) {
        String[] arrayStr = {
                "Ripang", "Pangestu", "Nadin"
        };

        // loop biasa
        for (int counter = 0; counter < arrayStr.length; counter++) {
            System.out.println(arrayStr[counter]);
        }

        // loop for each
        for (String value : arrayStr) { // bisa pakai var
            System.out.println(value);
        }
    }
}
