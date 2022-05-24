public class Tester {
   public static int binarySearch(int arr[], int first, int last, int element){
      int mid = (first + last)/2;
      while( first <= last ){
         if ( arr[mid] < element ){
            first = mid + 1;    
         }else if ( arr[mid] == element ){  
            return mid;
         }else{
            last = mid - 1;
         }
         mid = (first + last)/2;
      }
      return -1;                    
   }
                         
   public static void main(String a[]) {
      int[] array = { 10, 20, 30, 40, 50, 60 };
      int element = 50;
      int last=array.length-1;
      int index = binarySearch(array,0,last,element);
      if (index != -1) {
         System.out.println(element + " present at index: " + index);
      } else {
         System.out.println(element + " is not present.");
      }
   }
}







