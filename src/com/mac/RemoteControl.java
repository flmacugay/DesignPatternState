package com.mac;

public class RemoteControl {
	
	private TVState state;

	public TVState getState() {
		return state;
	}

	public void setState(TVState state) {
		this.state = state;
	}
	
	public void doAction() {
		System.out.println(state.toString());
	}
}
