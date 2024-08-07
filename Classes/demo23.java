abstract class demo{
	public abstract void display();
	public void set(){
};
        }
public class demo23 extends demo{
        
	public void display(){
	System.out.println("helloworld");
	}
	public void set(){
	System.out.println("hello");
	}

public static void main(String args[]){

demo23 d =new demo23();
d.display();
d.set();
}

}	