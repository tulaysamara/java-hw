public class App {

    static String name = "Tulay";
    public static void main(String[] args) {

        //Starting with legal variables to test it out

        System.out.println("Hello, World!");

        System.out.println("My name is " + name);

        int age = 24;
        System.out.println("My age is " + age);

        String typeOfHair = "curls";
        System.out.println("My hair type is " + typeOfHair);

        //ILLEGAL VARIABLES:
        
        String int= "illegal keyword";
        // Syntax error on token "int", delete this token

        String eyeColor;
        System.out.println(eyeColor);
        // The local variable eyeColor may not have been initialized

        String hello world = "hello";
        // error due to containing space

        String 3kids = "Children";
        // Syntax error on token "3", delete this token 
        // Can not start with number
    }

    static void greet() {
        System.out.println("Hi from "+ name);
        // String name = "Tulay"; 
        // placed as static --> could work for the whole code
    }

}
