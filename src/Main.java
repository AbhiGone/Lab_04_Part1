import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int intOperandA = 15;
        int intOperandB = 3;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        int doubleOperandA = 15;
        int doubleOperandB = 3;
        int doubleSum = doubleOperandA + doubleOperandB;
        int doubleDifference = doubleOperandA - doubleOperandB ;
        int doubleProduct = doubleOperandA * doubleOperandB;
        int doubleQuotient = doubleOperandA / doubleOperandB;
        int doubleModul = doubleOperandA % doubleOperandB;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB +  " is " + intSum);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB +  " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB +  " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB +  " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB +  " is " + intModulo);

        System.out.println("The sum using ints of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleSum);
        System.out.println("The difference using ints of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleDifference);
        System.out.println("The product using ints of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleProduct);
        System.out.println("The quotient using ints of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleQuotient);
        System.out.println("The modulo using ints of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleModul);
    }
}