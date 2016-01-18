import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
		boolean falsche_zahl = false;
		int i_eingabe = 0;
		
		System.out.println("Geben Sie nun eine Zahl ein: ");
		
		do{
			String eingabe = s.next();
			falsche_zahl = false;
			try{
				i_eingabe= Integer.parseInt(eingabe);
				if(i_eingabe < 0){
					falsche_zahl = true;
				}
			} catch(Exception e){
				System.out.println("Bitte geben sie eine gültige Zahl ein:");
				falsche_zahl = true;
			}
			
		}while(falsche_zahl);
		
		s.close();
			
		System.out.println("Ihre Eingabe: " + i_eingabe + "\n" + "Bitte warten Sie bis Ihre Zahl berechnet wird!");	
		
		System.out.println(fibonacci(i_eingabe));
	}
	
	public static long fibonacci(int n) {
		if(n == 0) {
		  return 0;
		}
		
		if(n == 1) {
			return 1;
		} 
			
		return fibonacci(n-1) + fibonacci(n-2); 
		
	}
}


