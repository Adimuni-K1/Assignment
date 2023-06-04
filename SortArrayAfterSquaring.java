import java.util.Arrays;
public class SortArrayAfterSquaring
{
 public static void squareSort(int[] arr)
 {      
   for (int i = 0; i < arr.length; i++)
   {
      arr[i] = arr[i] * arr[i];
   }     
    Arrays.sort(arr);
  }
 public static void main(String[] args)
 {
   int[] arr = {4, 2, 1, 3, 5};
   System.out.print("Original Array: ");
   for (int num : arr)
    {
      System.out.print(num + " ");
    }
    squareSort(arr);
    System.out.print("\nSorted Array after Squaring: ");
    for (int num : arr)
    {
      System.out.print(num + " ");
    }
 }
}