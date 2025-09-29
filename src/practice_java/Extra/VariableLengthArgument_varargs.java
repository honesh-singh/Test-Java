package practice_java.Extra;

//Varargs (variable-length arguments) allow you to pass zero or more arguments of the same type to a method.
//Instead of writing multiple overloaded methods, you can use varargs.
// introduced in JAVA 5
// syntax -> (...) three dots after data type

public class VariableLengthArgument_varargs {
    public static  void display(String... args){
        for(String a : args){
            System.out.print(a);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("check this ->");
        display(); // zero argument
        display("only one "); //single argument
        display("one ->","two "); // double argument
        display("one ->","two ->","three ->","four"); // multiple argument
    }

}
