//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Primitive type variable declaration and initialization
        int age = 23;
        double pi = 3.14;
        boolean isTrue = true;
        char letter = 'A';

        // Reference type variable declaration and initialization
        String name = "Mariyan";
        int[] numbers = new int[5];

        System.out.printf("I'm %d years old!%n", age);
        System.out.println(pi);
        System.out.println(isTrue);
        System.out.println(letter);
        System.out.printf("My name is %s%n", name);

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}