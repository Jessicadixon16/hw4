public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
            if (isPrime) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
