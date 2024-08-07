public class demo_Static{
  
  public static void main(String args[]){
 System.out.println(fun());
}

  static int fun(){

   static int x = 0;
    // int x= 10;
   return ++x;
               }        

}