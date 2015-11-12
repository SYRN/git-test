public class ArrayWithRandomInts
{
   // -------  main --------------
   public static void main(String[] args) throws Exception
   {
      // variables---------
      int[] myArray = new int[1000];
      int k;
      
      // fill array
      for (k = 0; k < 1000; k++)
         myArray[k] = (int)(Math.random()*1000);
         
      // change made here 
      // check if git updated
   }
}
