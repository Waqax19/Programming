// This program reads a Reverse Polish Notation mathematical Expression
// and evaluates it.  The program will show each step if the user chooses that
// otherwise the program will only print out the end result
//
package ProjectPolishNotations;

import java.util.*;

public class ReversePolishNotationCalculator {

    // This gets the remainder of the input out of the Scanner
    // prints that remaining input (and also prints out the current contents of the
    // stack)
    // and then re-loads the remaining input into a new Scanner
    // This means that we can keep Scanning the remainder of the input
    private static Scanner printRemainingExpression(Stack<Double> numbers, Scanner scExpression) {

        String remainderOfExpr = scExpression.nextLine();
        System.out.println("Remaining expression: " + remainderOfExpr + " Stack: " + numbers);
        scExpression.close(); // may as well close out the old one before creating a new replacement
        return new Scanner(remainderOfExpr + "\n");
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char evalAgain = 'y';

        ShouldWeTryAgain: while (evalAgain == 'y') {
            double nextNumber = 0;

            System.out.println("\nRPN calculator");
            System.out.println("\tSupported operators: + - * /");
            System.out.print("Type your RPN expression in so that it can be evaluated: ");
            String rpnExpr = keyboard.nextLine();

            boolean explain = false;
            System.out.print(
                    "Would you like me to explain how to expression is evaluated? (y or Y for yes, anything else means no) ");
            String szExplain = keyboard.nextLine().trim().toLowerCase();
            if (szExplain.length() == 1 && szExplain.charAt(0) == 'y') {
                System.out.println("We WILL explain the evaluation, step by step");
                explain = true;
            }

            Scanner scExpr = new Scanner(rpnExpr + "\n");
            /* while() */ { // repeat the following while there's another token left in the Scanner:
                if (explain) {
                    scExpr = printRemainingExpression(null, scExpr);
                }
                // if the next thing in the expression is a number:
                if (explain) {
                    System.out.println("\tPushing " + nextNumber + " onto the stack of operands (numbers)");
                }

                // if the next thing in the expression is not a number then we'll assume it's an
                // operator
                // (unless we find out that it's not a supported operator)

                System.err.println(
                        "ERROR! Operator (non-numeric input) contains more than 1 character: " + "PLACEHOLDER");
                System.out.println(
                        "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                // continue ShouldWeTryAgain; // This line will jump back to the outer loop

                // // "4 3 -" should be +1, not -1
                // // When parsing the expression 4 is pushed first, then 3
                // // the second operand (the 3) is at the top (so we'll pop that into operand2)
                // // then pop the first operand (the 4) into operand1
                // if ( /* the stack of operands isEmpty */) {
                //     System.err.println(
                //             "ERROR! Expected to find 2 operands (numbers) but we don't have any numbers on the stack!");
                //     System.out.println(
                //             "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                //     continue ShouldWeTryAgain;
                // }
                // // operand2 = /* get the top operand off the number stack */

                // if ( /* the stack of operands isEmpty */) {
                //     System.err.println(
                //             "ERROR! Expected to find 2 operands (numbers) but we don't have a second number on the stack!");
                //     System.out.println(
                //             "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                //     continue ShouldWeTryAgain;
                // }
                // // operand1 = /* get the top operand off the number stack */

                switch (' ') {
                    default:
                        System.err.println("ERROR! Operator not recognized: " + "PLACEHOLDER");
                        System.out.println(
                                "Since we can't evaluate that expression we'll ask you for another one to evaluate instead");
                        // continue ShouldWeTryAgain; // This line will jump back to the outer loop
                }
                if (explain)
                    System.out.println("\tPopping " + "PLACEHOLDER" + " and " + "PLACEHOLDER" + " then applying "
                            + "PLACEHOLDER" + " to them, then pushing the result back onto the stack");

            }

            // At this point we've finished reading through the expression

            // If there's more than 1 operand (number) left then we print this error
            // message:
            System.err.println("ERROR! Ran out of operators before we used up all the operands (numbers):");
            // Go through all the operands an print them out:
            System.err.println("\t" + "PLACEHOLDER");

            // If there wasn't any operands then print out this error message:
            System.err.println("ERROR! Ran out of operands (numbers)");

            // If there's exactly 1 operand then it must be the answer
            System.out.println("END RESULT: " + "PLACEHOLDER");

            System.out
                    .print("\nWould you like to evaluate another expression? (y or Y for yes, anything else to exit) ");
            String repeat = keyboard.nextLine().trim().toLowerCase();
            if (repeat.length() == 1 && repeat.charAt(0) == 'y')
                evalAgain = 'y';
            else
                evalAgain = 'n';
        }
        System.out.println("Thank you for using RPN Calculator!");
    }
}