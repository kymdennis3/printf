public class Main {
    public static void main(String[] args) {
        /* printf() = an optional method to control, format, and display text to the console window
                      two arguments = format string + (object/variable/value)
                      %[flags] [precision] [width] [conversion-character]
         */

         boolean myBoolean = true;
         String myString = "Kimtai";
         int myInt = 23;
         double myDouble = 1000;
         char myChar = '&';

        //System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
    }
}