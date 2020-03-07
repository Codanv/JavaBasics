// null -- method & + 
class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int number = 56;

        // ArithmeticException class
        // try {
        // number /= 10;
        // } catch (ArithmeticException e) {
        // System.out.println("Error: " + e);
        // } finally {
        // System.out.print("Okay");
        // }

        // // NullPointerException class
        // try {
        // String str = null;
        // System.out.print(str.length());
        // } catch (NullPointerException e) {
        // System.out.println("Error: " + e);
        // }

        // NumberFormatException class
        // try {
        // String s = "Zoom";
        // int numberS = Integer.parseInt(s);
        // } catch (NumberFormatException e) {
        // System.out.println(e);
        // }

        // ArrayIndexOutOfBoundsException class
        try {
            int numerics[] = new int[10];
            numerics[20] = 9 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("!");
    }
}