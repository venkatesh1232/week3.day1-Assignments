package org.system;

public class Desktop extends Computer{
	
	public void desktopModel() {
		System.out.println("New version");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopModel();

	}

}
