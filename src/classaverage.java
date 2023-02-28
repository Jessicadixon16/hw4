
public class classAverage {
    public class classAverage {
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            double sum=0;
            //count variable store the number of user input
            int count=0;
            //Start an infinite while loop
            while (true){
                double temp=0;
                try{
                    //Take user input
                    temp=sc.nextDouble();
                }
                //If user-entered value is not double typed, then come out from this infinite while loop
                catch (Exception e) {
                    break;
                }
                // add that value with sum
                sum=sum+temp;
                //add increment count by 1
                count+=1;
            }
            //calculate the average
            double avg=(double)((double)sum/(double)count);
            // the result
            System.out.println("Average student grade is "+ avg);
        }
    }
}
