package calculator;

public class Calculator {
    public static int option, operator1, operator2, result;
    public static float result2;

    public static void main(String[] args) {

    }

    public static int sum(int operator1, int operator2) {


        return result;
    }

    public static int subtraction(int operator1, int operator2) {


        return result;
    }

    public static int multiply(int operator1, int operator2) throws Exception {
        try {

            if (operator1 == 0 || operator2 == 0) {

                throw new ArithmeticException("Operation invalid");

            } else {

                result = operator1 * operator2;
                //System.out.println("");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }


        return result;

    }

    public static float divide(int operator1, int operator2) {


        return result2;
    }

    public static int entireDivision(int operator1, int operator2) {


        return result;
    }

    public static int power(int operaador1, int operator2) {


        return result;
    }

    public static int module(int operaador1, int operator2) throws ArithmeticException {

        if (operator2 == 0) {
            //System.out.println("El divisor es inválido");
            throw new ArithmeticException("The divisor is invalid");
        } else {
            result = operaador1 % operator2;
            System.out.println("El resultado del modulo entre " + operaador1 + " % " + operator2);
            return result;
        }
    }

    public static float minimum(int operaador1, int operator2) {

        try {
            if (operaador1 != operator2) {
                if (operaador1 < operator2) {
                    result = operaador1;
                    System.out.println("El primer número ingresado es menor que el segundo. Menor: " + operaador1);
                    return result;
                } else {
                    result = operator2;
                    System.out.println("El segundo número ingresado es menor que el primero. Menor: " + operator2);
                    return result;
                }
            } else {
                System.out.println("No se puede calcular el mínimo ya que los números son iguales.");
                return 0;
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el mínimo entre los dos operadores: " + e.getMessage());
            return 0;
        }

    }

    public static float maximum(int operaador1, int operator2) {


        return result2;
    }

    public static void operatorsQuestion() {

    }

    public static void questionOption() {

    }

    public static void printMenu() {

    }
}
