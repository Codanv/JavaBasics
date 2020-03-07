import java.lang.*;
import java.util.Date;

class ClassName {
    public static void main(String[] args) {

        // Simple Class Name
        String string = "Okay";
        System.out.println(string);
            
        Date date2 = new Date();
        System.out.println(date2);

        // Fully qualified class name
        java.lang.String str = "Okay!";

        java.lang.System.out.println(str);

        java.util.Date date = new java.util.Date();

        java.lang.System.out.println(date);
        
    }
}

