class Plane1
{
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane1 extends Plane1
{
	void fly()
	{
		System.out.println("CargoPlane is flying");
	}
	
}
class PassengerPlane1 extends Plane1
{
	void fly()
	{
		System.out.println("PassengerPlane is flying");
	}
	
}
class FighterPlane1 extends Plane1
{
	void fly()
	{
		System.out.println("FighterPlane is flying");
	}
	
}

public class introPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane1 cp=new CargoPlane1();
		PassengerPlane1 pp=new PassengerPlane1();
		FighterPlane1 fp=new FighterPlane1();
		Plane1 ref;
		ref=cp;
		ref.fly();
		ref=pp;
		ref.fly();
		ref=fp;
		ref.fly();
		
		
		
		
		

	}

}
