
class Example {
    // instance variable
    int z = 90;
    int x;

    // static variable
    static float value = 4545;

    public static void main(String[] args) {
        // local variable
        byte g; // not initialized
        int x = 304;
        boolean loud = true;

        // g = g++; // must have been initialized before used

        // System.out.println(g); // must have been initialized before used
        System.out.println(x);
        System.out.println(loud);

        Example e = new Example();

        System.out.println(++e.x);
        System.out.println(e.z);

        e.value += 100; // warning

        Example d = new Example();
        System.out.println(Example.value--);
        System.out.println(d.value);

    }
}