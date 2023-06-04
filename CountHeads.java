import java.util.*;
public class CountHeads
{
public static int fact(int n)
{
  if(n==0)
   return 1;
  return n*fact(n-1);  
 }
public static double count_heads(int n, int r)
{
    double res;
    res = fact(n) / (fact(r) * fact(n - r));
    res = res / (Math.pow(2, n));
    return res;
}

public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int r=sc.nextInt();
   System.out.println(count_heads(n,r));
}
}