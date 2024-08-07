class Vehical{

	int maxspeed=200;
	public static void drive(){
	System.out.println("driving vehical");

				}
	public void race(){
	System.out.println("driving at speed of :" + maxspeed);

			}

}
class car extends Vehical{

	int maxspeed=100;
	public static void drive(){			//because of static method this was not overide
	System.out.println("driving car");

				}
	public void race(){					//overide method thats y this method display
	System.out.println("driving at speed of :" + maxspeed);

			}
}

public class DemoQues{
	public static void main(String args[]){
	Vehical v = new car(); // vehical reference = obj created by new 
	v.drive();
	v.race();
	System.out.println(v.maxspeed);



}



}