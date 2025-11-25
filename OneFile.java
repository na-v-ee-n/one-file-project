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

    // this is a comment to main method added by Agent
    public static void main(String[] args) {
        OneFile example = new OneFile();
        example.calculateAndPrintSum();
    }
}