package edu.ccsu.cs417.vehiclePrototypeFactory;

/**
 * Concrete class
 */
public class Bike extends VehicleBase{
  public Bike(){
    super(new HumanPowered());
  }

  @Override
  public double getVehicleSoundLevel() {
    return 0;
  }

  public Bike clone(){
    return new Bike();
  }
}
