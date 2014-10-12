package com.mac;

public class OffState implements TVState {

	@Override
	public void saveState(RemoteControl rc) {
		rc.setState(this);
		System.out.println("TV is OFF");		
	}
	
	@Override
	public String toString() {
		return "Turning TV ON";
	}


}
