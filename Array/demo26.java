import java.util.*;
 class demo26 {
//diffirentiate duplicate

   public static void main(String args[]){
	ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<=4;i++){
	 
	System.out.println("enter element");	
 	 int temp=sc.nextInt();
 
	
	if(!list.contains(temp))
	{
	list.add(temp);
	System.out.println(list);
}

}

}
                            

}