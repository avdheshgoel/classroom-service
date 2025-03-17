package com.lloyds.classroom_service;

import java.util.Collection;
import java.util.concurrent.Callable;

interface  Reptile {
	ReptileEgg lay();
}
class FireDragon {
	public FireDragon() {
	}

	public void main(String[] args) throws Exception{
		FireDragon fireDragon = new FireDragon();
		System.out.println(fireDragon instanceof Reptile);
	}
}

Class ReptileEgg {
	public ReptileEgg(Callable<Reptile> createReptile) {

	}
	public Reptile hatch() throws Exception {

	}
}