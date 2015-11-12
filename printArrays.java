// Class printArrays------------------------------------------------------------
class printArrays 
{
   // toString() E[]
   public static <E> String toString(E[] myArray)
   {
      String stringReturn = "{";
      
      for (int k = 0; k < myArray.length-1; k++)
         stringReturn += myArray[k].toString() + ", ";
      
      stringReturn += myArray[myArray.length-1] + "}";
      
      return stringReturn;
   }
   
   // print E[]
   public static <E> void printArray(E[] myArray)
   {
      System.out.println(toString(myArray));
   }
   
   // toString() int[]
   public static <E> String toString(int[] myArray)
   {
      String stringReturn = "{";
      
      for (int k = 0; k < myArray.length-1; k++)
         stringReturn += myArray[k] + ", ";
      
      stringReturn += myArray[myArray.length-1] + "}";
      
      return stringReturn;
   }
   
   // print int[]
   public static <E> void printArray(int[] myArray)
   {
      System.out.println(toString(myArray));
   }
}
// End Class printArrays--------------------------------------------------------