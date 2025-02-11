//QUESTION2 : Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.

package coreJavaTwo;


@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}


class Q2 {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}


public class Question2 {
    public static void main(String[] args) {
        Q2 q2 = new Q2();

        Operation addOperation = q2::add;
        Operation subtractOperation = q2::subtract;
        Operation multiplyOperation = Q2::multiply;

        System.out.println("Addition: " + addOperation.apply(2, 7));
        System.out.println("Subtraction: " + subtractOperation.apply(7, 2));
        System.out.println("Multiplication: " + multiplyOperation.apply(7, 7));
    }
}
