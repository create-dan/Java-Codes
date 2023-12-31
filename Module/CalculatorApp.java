public class CalculatorApp {
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 5;


        int sum = Calculator.add(num1,num2);
        int sub = Calculator.subtract(num1,num2);
        int mul = Calculator.multiply(num1,num2);
        int divide = Calculator.divide(num1,num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + mul);
        System.out.println("Quotient: " + divide);
    }
}