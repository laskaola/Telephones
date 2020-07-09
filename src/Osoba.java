import java.util.Scanner;


public class Osoba extends Wpis {

	String imie = new String();
	String nazwisko = new String();
	String adres = new String();
	String miasto = new String();
	nrTelefoniczny numer;
	
	
	public void opis() {
		

		System.out.println("Imie: " + imie);
		System.out.println("Nazwisko " + nazwisko);
		System.out.println("Adres: " + adres);
		System.out.println("Miasto: " + miasto);
		System.out.println("nrTelefoniczny: " + numer.nrKierunkowy + " " + numer.nrTelefonu);
		System.out.println("\n");
		
	}
	
	public void wypiszKontakt() {

		
	}
	

	
	public Osoba(Scanner s) {

				numer = new nrTelefoniczny();
		
		
				System.out.println("Imie: ");
				imie = s.nextLine();	
				
				System.out.println("Nazwisko: ");
				nazwisko = s.nextLine();	
				
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
