package edu.ccsu.cs417.vehiclePrototypeFactory;

import edu.ccsu.cs417.vehicleFactoryMethod.*;
import edu.ccsu.cs417.vehicleAbstractFactory.*;

/**
 * Concrete transmission class
 */
public class ToyotaTransmission implements Transmission{
  public ToyotaTransmission clone(){
    return new ToyotaTransmission();
  }
}
