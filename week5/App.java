public class App {
    public static void main(String[] args) throws Exception {

        App myApp = new App();

        // Non-static method call
        myApp.showHelloJava();

        // Static method call
        showHelloWorld();

        // Non-static method call with parameter
        myApp.showName("Rikardo");

        // Static method call with parameter
        showAge(19);

        // Static method call with two parameters
        showNameAndAge("Rikardo", 19);

        // Non-static method call with two parameters that returns an int
        int sum = myApp.add(15, 4);
        System.out.println(sum);

        // Static method call with two parameters that returns an int
        int difference = subtract(20, 5);
        System.out.println(difference);

        // Static method call with two parameters that returns an int
        int multiply = multiply(4, 5);
        System.out.println(multiply);

        // Static method call with two parameters that returns an int
        int divide = divide(20, 10);
        System.out.println(divide);

        // Static method call with two parameters that returns an int
        boolean equal = isEqual(50, 10);
        System.out.println(equal);
    }

    // Non-static method
    void showHelloJava() {
        System.out.println("Hello Java! This is a non-static method.");
    }

    // Static method
    static void showHelloWorld() {
        System.out.println("Hello World! This is a static method.");
    }

    // Non-static method with a parameter
    void showName(String name) {
        System.out.println("My name is " + name);
    }

    // Static method with a parameter
    static void showAge(int age) {
        System.out.println("My age is " + age);
    }

    // Static method with two parameters
    static void showNameAndAge(String name, int age) {
        System.out.println("Hello: " + name);
        System.out.println("You are : " + age + " years old!");
    }

    // Non-static method with two parameters with a return type
    int add(int x, int y) {
        int z = x + y;
        return z;
    }

    // Static method with two parameters with a return type
    static int subtract(int x, int y) {
        int z = x - y;
        return z;
    }

    // Static method with two parameters with a return type
    static int multiply(int x, int y) {
        int z = x * y;
        return z;
    }

    // Static method with two parameters with a return type
    static int divide(int x, int y) {
        int z = x / y;
        return z;
    }

    // Static method with two parameters with a return type
    static boolean isEqual (int x, int y) {
        boolean z = (x == y);
        return z;
    }
}
