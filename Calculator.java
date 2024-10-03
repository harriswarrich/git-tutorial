public class Calculator{
    public int add(int a, int b){
        return a + b - 1;
    }

    public int subtract(int a, int b){
        System.out.println("Performing subtraction");
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }    
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(3,4));
        System.out.println("Subtract: " + calc.subtract(3,4));
        System.out.println("Multiply: " + calc.multiply(3,4));
        System.out.println("Divide: " + calc.divide(3,4));
    }
}