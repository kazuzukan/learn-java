public class Variable {
    public static void main(String[] args) {
        String name;
        int age ;

        name = "Risyad Pangestu";
        age = 28;

        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);

        name = "Nadindra";
        System.out.println("nama 2 : " + name);

        // Penggunaan var
        var namaBaru = "Nadeen";
        System.out.println(namaBaru);

        // Final (constant)
        final String fullname = "Risyad Pangestu Final";
        System.out.println(fullname);
    }
}
