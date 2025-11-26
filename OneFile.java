public class OneFile {
    // 10 int variables
    int num1 = 10;
    int num2 = 20;
    int num3 = 30;
    int num4 = 40;
    int num5 = 50;
    int num6 = 60;
    int num7 = 70;
    int num8 = 80;
    int num9 = 90;
    int num11 = 100;

    // Method to add these 10 variables and print the result
    public void calculateAndPrintSum() {
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num11;
        System.out.println("The sum of the 10 numbers is: " + sum);
    }

    // Method to multiply these 10 variables and print the result
    public void calculateAndPrintProduct() {
        int product = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num11;
        System.out.println("The product of the 10 numbers is: " + product);
    }

    // Method to divide all the variables and print the result
    public void calculateAndPrintDivision() {
        // To avoid division by zero, check if any variable is zero
        if (num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0 || num9 == 0 || num11 == 0) {
            System.out.println("Division by zero encountered. Cannot perform division.");
            return;
        }
        double result = (double) num1 / num2 / num3 / num4 / num5 / num6 / num7 / num8 / num9 / num11;
        System.out.println("The result of dividing all the numbers is: " + result);
    }

    // this is a comment to main method added by Agent
    public static void main(String[] args) {
        OneFile example = new OneFile();
        example.calculateAndPrintSum();
        example.calculateAndPrintProduct();
        example.calculateAndPrintDivision();
    }
}