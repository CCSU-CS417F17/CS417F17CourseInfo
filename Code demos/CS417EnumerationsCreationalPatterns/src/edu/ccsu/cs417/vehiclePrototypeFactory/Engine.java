package edu.ccsu.cs417.vehiclePrototypeFactory;

import edu.ccsu.cs417.vehicleFactoryMethod.*;

/**
 * Interface to allow decorator pattern
 */
public interface Engine extends Cloneable{
  public double getEngineSound();
  public Engine clone();
}
