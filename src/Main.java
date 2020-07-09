
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Wpis> listaCala = new ArrayList<Wpis>();
		Scanner skan = new Scanner(System.in);
		Collection<Wpis> lista;
		Map<nrTelefoniczny, Wpis> mapa = new TreeMap<nrTelefoniczny, Wpis>();		
		int liczbaOsob = 0;
		int liczbaFirm = 0;
		boolean kontynuujPetle = false;
		
		
		do {
		
			try {
				
				System.out.println("Otworzyles ksiazke telefoniczna.");
				System.out.println("Podaj liczbe osob, do ktorych kontakt chcesz teraz wpisac");	
				liczbaOsob = Integer.parseInt(skan.nextLine());
				System.out.println("A teraz liczbe firm");
				liczbaFirm = Integer.parseInt(skan.nextLine());		
				kontynuujPetle = false;
			}
			catch(NumberFormatException e) {
				System.out.println("Wpisz liczby\n");
				kontynuujPetle = true;
				
			}
		}	
		while(kontynuujPetle);
			
	
		for(int i=0; i<liczbaOsob; i++) {
						
			listaCala.add(new Osoba(skan));	
			mapa.put(listaCala.get(i).pobierzNumerTelefonu(), listaCala.get(i));
		}
		
		for(int i=0; i<liczbaFirm; i++) {
			
			listaCala.add(new Firma(skan));	
			mapa.put(listaCala.get(liczbaOsob + i).pobierzNumerTelefonu(), listaCala.get(liczbaOsob + i));
		}
		
		
		
		lista = mapa.values();
		Iterator<Wpis> it = lista.iterator();
		
		
		 while(it.hasNext()) {
			
			it.next().opis();
					 
	}
	
	}
}


