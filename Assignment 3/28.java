import java.util.Scanner;
class demo {
   void array() {
      int arr[]=new int[5];
      Scanner input=new Scanner(System.in);
      System.out.print("Enter elements in array: ");
      for(int i=0;i<arr.length;i++) {
         arr[i]=input.nextInt();
      }
      passarray(arr);
   }
   void passarray(int arr[]) {
      int max=0;
      for(int i=0;i<arr.length;i++) {
         if(arr[i]>max) {
            max=arr[i];
         }
      }
      System.out.println("Max: "+max);
   }
   public static void main(String[] args) {
      demo d1=new demo();
      d1.array();
   }
}