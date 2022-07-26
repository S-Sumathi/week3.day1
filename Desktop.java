package org.system;

public class Desktop extends Computer {
	
	//Method in Desktop class
	public void desktopSize() {
		System.out.println("The screen size is 24 inches");	
	}
	//Inherited Computer class
	public static void main(String[] args) {
		Desktop objDesktop=new Desktop();
		objDesktop.computerModel();
		objDesktop.desktopSize();
	}
	
	}


