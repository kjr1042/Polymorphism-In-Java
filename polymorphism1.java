class Plane
{
	void fly()
	{
		System.out.println("Plane is flying");
	}
}
class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("CargoPlane is flying");
	}
	void weapons()
	{
		System.out.println("CargoPlane is carrying Weapons");
	}
}
class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("PassengerPlane is flying");
	}
	void passenger()
	{
		System.out.println("PassengerPlane is carrying passenger");
	}
}
class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("FighterPlane is flying");
	}
	void fighter()
	{
		System.out.println("FighterPlane is carrying guns");
	}
}
public class polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp= new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Plane ref;
		ref = cp;
		ref.fly();
		((CargoPlane)ref).weapons();
		ref=pp;
		ref.fly();
		((PassengerPlane)ref).passenger();
		ref=fp;
		ref.fly();
		((FighterPlane)ref).fighter();
		

	}

}
