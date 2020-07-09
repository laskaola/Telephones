import java.util.Scanner;

public class nrTelefoniczny implements Comparable<nrTelefoniczny> {

	String nrKierunkowy;
	String nrTelefonu;

	@Override
	public int compareTo(nrTelefoniczny nr) {
		
		if(Integer.parseInt(nrKierunkowy) < Integer.parseInt(nr.nrKierunkowy))
			return -1;
		
		if(Integer.parseInt(nrKierunkowy) > Integer.parseInt(nr.nrKierunkowy))
			return 1;
		
		if(Integer.parseInt(nrKierunkowy) == Integer.parseInt(nr.nrKierunkowy))
			if(Integer.parseInt(nrTelefonu) < Integer.parseInt(nr.nrTelefonu))
				return -1;
			if(Integer.parseInt(nrTelefonu) > Integer.parseInt(nr.nrTelefonu))
				return 1;

		return 0;
	}
	
	public void wpiszNumer(Scanner s) {
		
		boolean powtorz = false;
		
		do {
			System.out.println("Nr Kierunkowy (2 cyfry): ");
			String temp = s.nextLine();
			
			if((new Integer(temp.length()).equals(2))) {
				nrKierunkowy = temp;
				powtorz = false;
			}
			
			else {
				System.out.println("Numer kierunkowy zawiera 2 cyfry. Spróbuj jeszcze raz.");
				powtorz = true;
			}
		} while (powtorz);
			
			
		do {
			System.out.println("Nr Telefonu (9 cyfr): ");
			String temp = s.nextLine();
			
			if((new Integer(temp.length()).equals(9))) {
				nrTelefonu = temp;
				powtorz = false;
			}
			
			else {
				System.out.println("Numer telefonu zawiera 9 cyfr. Spróbuj jeszcze raz");
				powtorz = true;
			}
		} while (powtorz);
		
		
	}
	
	
}


