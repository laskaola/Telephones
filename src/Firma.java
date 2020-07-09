import java.util.Scanner;


public class Firma extends Wpis {

	String nazwa = new String();
	String adres = new String();
	String miasto = new String();
	nrTelefoniczny numer;
	
	public void opis() {
		
		System.out.println("Nazwa: " + nazwa);
		System.out.println("Adres: " + adres);
		System.out.println("Miasto: " + miasto);
		System.out.println("nrTelefoniczny: " + numer.nrKierunkowy + " " + numer.nrTelefonu);
		System.out.println("\n");
	}
	

	
	
	public Firma(Scanner s) {

		
			numer = new nrTelefoniczny();
		
			System.out.println("Nazwa: ");
			nazwa = s.nextLine();	
			
			System.out.println("Adres: ");
			adres = s.nextLine();	
			
			System.out.println("Miasto: ");
			miasto = s.nextLine();
			
			numer.wpiszNumer(s);

			System.out.println("\n");

	}

	public nrTelefoniczny pobierzNumerTelefonu() {
		return this.numer;
	}

}

	
	
