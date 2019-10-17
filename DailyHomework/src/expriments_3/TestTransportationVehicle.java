package expriments_3;

public class TestTransportationVehicle {
	public static void main(String args[])throws Exception{
		MovableMachine v1=VehicleFactory.getVehicle("NewEnergyVehicle");
		MovableMachine v2=VehicleFactory.getVehicle("TraditionalVehicle");
		MovableMachine v3=VehicleFactory.getVehicle("HybirdVehicle");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}
}
