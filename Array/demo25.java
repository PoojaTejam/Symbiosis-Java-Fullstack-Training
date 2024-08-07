import java.util.*;
class demo25{
   public static void main(String args[]){
	ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<=7;i++){
	 
	System.out.println("enter element");	
 	 int n=sc.nextInt();
         list.add(n);
	System.out.println(list);
	
                            }
	  ArrayList<Integer> nList = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            int element = list.get(j);
            if (!nList.contains(element)) {
                nList.add(element);
            }
        }
        
   System.out.println( nList); 
     
  
}
}