public class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(3,4));
        System.out.println("Subtract: " + calc.subtract(3,4));
    }
}