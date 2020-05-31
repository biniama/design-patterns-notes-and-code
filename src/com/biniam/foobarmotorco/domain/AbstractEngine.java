package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractEngine implements Engine {

	private int size;

	private boolean turbo;

	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
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
	public String toString() {
		return getClass().getSimpleName() + "(size=" + size + ", turbo=" + turbo + ')';
	}
}
