public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorld();

        // With param
        helloName("Ripang pang", "Akhila");

        // return value
        System.out.println(sum(100, 100));
    }

    // method
    static void sayHelloWorld() {
        System.out.println("HELOO METHODD!!");
    }

    // method parameter
    static void helloName(String fullName, String lastName) {
        System.out.println("Hallo " + fullName + " " + lastName);
    }

    // return value (cuman 1 return value tipe data saja)
    static int sum(int value1, int value2) {
        var total =  value1 + value2;

        return total;
    }
}
