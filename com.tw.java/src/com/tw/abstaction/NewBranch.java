package com.tw.abstaction;

public class NewBranch extends Branch {

	public void car(double fucher, int fucherincar) {
		if(fucher>0 && fucherincar>0) {
		System.out.println(fucher+ "best brand in suzuki");
		}
		
	}

	@Override
	public void newcar(double fucher, int  fucherincar) {
		if(fucher>0 && fucherincar>0) {
			System.out.println(fucher+"Best Dell Best Servicess");
		}
	}

	@Override
	public void newfucherincar(double fucher, int fucherincar) {
		if(fucher>0 && fucherincar>0) {
			System.out.println(fucher+ "Maruti create a ne Modul Swift");
		}
		

	}

}
