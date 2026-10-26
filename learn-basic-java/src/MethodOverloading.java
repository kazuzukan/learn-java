public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Ripang");
    }

    static void sayHello() {
        System.out.println("Hello 1");
    }

    static void sayHello(String name) {
        System.out.println("Hello 2 " + name);
    }
}
