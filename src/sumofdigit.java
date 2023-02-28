public class sumofdigit {

    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = num;
        int sum = 0;

        while(num!=0)
        {
            sum = sum + num %10;
            num = num/10;

    }
        System.out.println(" The sum of digits " + k +" is " + sum);

}
}
