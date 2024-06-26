import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimePalindrome
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader Br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter the Number - ");
        String input = Br.readLine();
        int n = Integer.parseInt(input);
        
        int r,s=0,c=n;
        while (n!=0)
        {
            r=n%10;
            s=s*10+r;
            n/=10;
        }

        int count=0;
        for (int i=1;i<=c;i++)
        {
            if ((c%i==0) && (s%i==0))
            {
                count++;
            }
        }

        
        if ((c==s) && (count==2))
        System.out.println("Prime-Palindrome Number");
        else
        System.out.println("Not Prime-Palindrome Number");
    }
}