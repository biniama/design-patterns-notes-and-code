package com.biniam.designpatterns.bridge.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractEngine implements Engine {

	private int size;
	private boolean turbo;
	private boolean running;
	private int power;

	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
		this.running = false;
		this.power = 0;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isTurbo() {
		return turbo;
	}

	@Override
	public void start() {
		running = true;
		System.out.println("Engine started");
	}

	@Override
	public void stop() {
		running = false;
		power = 0;
		System.out.println("Engine stopped");
	}

	@Override
	public void increasePower() {
		if (running && power < 10) {
			power++;
			System.out.println("Engine power increased to " + power);
		}
	}

	@Override
	public void decreasePower() {
		if (running && power > 0) {
			power--;
			System.out.println("Engine power decreased to " + power);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(size=" + size + ", turbo=" + turbo + ')';
	}
}
