package com.mac;

public class StateDemo {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		
		OffState offState=new OffState();
		offState.doOperation(rc);
		System.out.println(rc.getState());
		
		OnState onState=new OnState();
		onState.doOperation(rc);
		System.out.println(rc.getState());
		
	}

}
