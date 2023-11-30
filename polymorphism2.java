class Plane2
{
	void takeOff()
	{
		System.out.println("Plan2 is takingOff");
	}
	void fly()
	{
		System.out.println("Plane2 is flying");
	}
	void land()
	{
		System.out.println("Plane2 is landing");
	}
}

class CargoPlane2 extends Plane2
{
	void fly()
	{
		System.out.println("CargoPlane2 is flying at low height");
	}
	void land()
	{
		System.out.println("CargoPlane2 is carrying cargo");
	}
}

class PassengerPlane2 extends Plane2
{
	void fly()
	{
		System.out.println("PassengerPlane2 is flying at medium height");
	}
	void land()
	{
		System.out.println("PassengerPlane2 is carrying passsenger");
	}
}

class FighterPlane2 extends Plane2
{
	void fly()
	{
		System.out.println("FighterPlane2 is flying at great height");
	}
	void land()
	{
		System.out.println("FighterPlane2 is carrying weapons");
	}
}

class Airport
{
	void permit(Plane2 ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
		
	}
}
public class polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane2 cp =new CargoPlane2();
		PassengerPlane2 pp =new PassengerPlane2();
		FighterPlane2 fp =new FighterPlane2();
		Airport a =new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		

	}

}
