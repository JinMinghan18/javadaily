package expriments_3;

public class VehicleFactory {
	static MovableMachine getVehicle(String s) {
		if(s.equals("NewEnergyVehicle")) {
			NewEnergyVehicle a=new NewEnergyVehicle();
			return a;
		}
		else if(s.equals("TraditionalVehicle")) {
			TraditionalVehicle a = new TraditionalVehicle();
			return a;
		}
		else if(s.equals("HybirdVehicle")) {
			HybirdVehicle a = new HybirdVehicle();
			return a;
		}
		else return null;
	}


}
