package com.mac;

public class OnState implements TVState {

	@Override
	public void saveState(RemoteControl rc) {
		rc.setState(this);
		System.out.println("TV is ON");
	}
	
	@Override
	public String toString() {
		return "Turning TV off";
	}



}
