public class Main {
    public static void main(String[] args) {
        /* printf() = an optional method to control, format, and display text to the console window
                      two arguments = format string + (object/variable/value)
                      %[flags] [precision] [width] [conversion-character]
         */

         boolean myBoolean = false;
         String myString = "Hello";
         int myInt = 37;
         double myDouble = 1000;
         char myChar = '&';

        System.out.printf("%b",myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%d",myInt);
        //System.out.printf("%f",myDouble);
        //System.out.printf("%s",myString);
    }
}