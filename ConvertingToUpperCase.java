import java.util.Scanner;
public class ConvertingToUpperCase
{
    public static void change(String str, char c, int len)
    {
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++)
        {  
            if( c == ch[i] )
            {
                if(Character.isUpperCase(ch[i]))
                {
                    ch[i]= Character.toLowerCase(ch[i]);
    
                }      
                else  if(Character.isLowerCase(ch[i]))
                {
                    ch[i]= Character.toUpperCase(ch[i]);
    
                }     
            }
        }
        System.out.print(new String(ch) );
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int len = str.length();
        change(str, c, len);
    }
}