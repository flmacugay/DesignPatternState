package com.mac;

public class StateDemo {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		
		OffState offState=new OffState();
		offState.saveState(rc);
		rc.doAction();
		
		OnState onState=new OnState();
		onState.saveState(rc);
		rc.doAction();
		
	}

}
