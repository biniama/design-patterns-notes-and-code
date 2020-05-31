package com.biniam.designpatterns.abstractFactory.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractVehicleFactory {

	abstract Body getBody();

	abstract Chassis getChassis();
}
