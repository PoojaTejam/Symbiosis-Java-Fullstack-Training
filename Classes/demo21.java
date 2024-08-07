import java.util.Scanner;

class demo21{
    int rollno;
     String name;
   
 
   demo21(){
       System.out.println("welcome to kkwagh Mca Dept"); 
      // rollno=101;
      // name="rajdeep";
      // System.out.println("name:"+ name +"\nrollno:"+ rollno); 
 	}

   demo21(int r , String n){
         this.rollno=r;
	this.name=n;
	 System.out.println(r +" "+ n ); 
	}
  demo21(demo21 demo) {
        this.name = demo.name;
        this.rollno = demo.rollno;
       System.out.println("name:"+ name +"\nrollno:"+ rollno); 
    }


  public static void main(String[] args) {
        demo21 d = new demo21();
        demo21 d2 = new demo21(1,"pooja");
	demo21 d3 = new demo21(d2);
	
    }
}
