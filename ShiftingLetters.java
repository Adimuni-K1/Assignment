public class ShiftingLetters
{
 public static void main(String[] args)
 {
  String s ="aaa";
  int[] shifts = new int[]{1,2,3};
  String a = shiftingLetters(s,shifts);
  System.out.println(a);
 }
 public static String shiftingLetters(String s, int[] shifts)
 {
   StringBuilder sb = new StringBuilder();
   int sum = 0; 
   for(int i=shifts.length-1; i >=0; i--)
   {
     sum = (sum + shifts[i])%26;
     int ascii = 0;
     char c = s.charAt(i);
     ascii = (int)c + sum;  	 
     if(ascii > 'z')
     {
      ascii = (ascii%123)+97;
      sb.insert(0, (char)ascii);
     }
     else
      sb.insert(0, (char)ascii);
   }
    	return sb.toString();
 }
}