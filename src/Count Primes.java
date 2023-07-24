
import java.util.*;


class CountPrimes
{
    public static void countprimes(int n)
    {
        int prime_count=0;
        for(int i=1;i<n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
                if(count>3)
                {
                    break;
                }
            }
            if(count==2)
            {
              prime_count++;
            }
        }
        System.out.println(prime_count);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        countprimes(n);
    }
}
