import java.util.Scanner;
public class ManavKasaProgrami {

	public static void main(String[] args) {
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
		double armutkg, elmakg, domateskg, muzkg, patlicankg, toplam;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut ka� kilo ? :");
		armutkg = input.nextDouble();
		System.out.print("Elma Ka� Kilo ? :");
		elmakg = input.nextDouble();
		System.out.print("Domates Ka� Kilo ? :");
		domateskg = input.nextDouble();
		System.out.print("Muz Ka� Kilo ? :");
		muzkg = input.nextDouble();
		System.out.print("Patl�can Ka� Kilo ? :");
		patlicankg = input.nextDouble();
		
		toplam = (armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);
		System.out.println("Toplam Tutar : "+toplam+" TL");
		input.close();
	}

}
