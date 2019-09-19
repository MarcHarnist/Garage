package fr.marcharnist.garage;

import fr.marcharnist.outils.FileCRUD;

public class GarageDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileCRUD garageTxt = new FileCRUD();
		garageTxt.setDir("");// Exemple: C://Users/Asus/Desktop/
		garageTxt.setFile("Garage.txt");
		garageTxt.deleteFile();

	}

}
