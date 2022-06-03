

import javax.swing.JOptionPane;
import java.util.Scanner;




public class a {
	
	public static void main (String args[]) {
		
		Scanner IN = new Scanner(System.in);
		int n1;
		String nome;
		char c;
		System.out.println("Digite um numeral:");
		
		c = IN.nextLine().charAt(0);
		
		
		n1= IN.nextInt();
		
		
		
		
		
		
		
		System.out.print("-->n1= "+ n1 +";; Agora o nome: "+ c);
		IN.close();
	}

}
