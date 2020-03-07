public class ExceptionPropagationDemo {

    void born() throws java.io.IOException {
        throw new java.io.IOException("Hey Error!");
        // throw new NumberFormatException();
        // float z = Float.parseFloat("34ff");
    }
    // void born() {
    // // throw new java.io.IOException("Hey Error!");
    // // throw new NumberFormatException();
    // float z = Float.parseFloat("34ff");
    // }

    void walk() throws java.io.IOException {
        born();
    }
    // void walk() {
    // born();
    // }

    void run() {
        try {
            walk();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo epd = new ExceptionPropagationDemo();
        epd.run();
        System.out.println("Yes!!!");
    }
}