import java.util.*;
 class demo27{

   public static void main(String args[]){
	ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<=4;i++){
	 
	System.out.println("enter element");	
 	 int temp=sc.nextInt();
	 list.add(temp);
 	}


	Collections.sort(list);
	System.out.println(list);
}
                            

}