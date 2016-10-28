
public class Bici extends Vehiculo {
	
	static float maxVelocidad=80;

	public Bici() {
		super.velocidad=2;
		
	}
	
	@Override
	public String toString(){
		
		return "Soy una bici";
	}

	@Override
	float getmaxVelocidad() {
		// TODO Auto-generated method stub
		return maxVelocidad;
	}

	void pedalea(){
		
	}
}
