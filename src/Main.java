public class Main {
    public static void main(String[] args) {
        /* printf() = an optional method to control, format, and display text to the console window
                      two arguments = format string + (object/variable/value)
                      %[flags] [precision] [width] [conversion-character]
         */

         //boolean myBoolean = false;
         //String myString = "Kimtai!";
         //int myInt = 26;
         double myDouble = 20.98;
         //char myChar = '*';


         //System.out.printf("%b",myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%d",myInt);

       /* [width]
       minimum number of characters to be written as output
        */
        //System.out.printf("Hello %-10s",myString);

        /*[precision]
        sets number of digits of precision when outputting floating-point values
         */
        System.out.printf("You have this much money %.1f",myDouble);
    }
}