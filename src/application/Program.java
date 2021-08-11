package application;

import model.entities.Account;
import model.exception.EntitiesException;

public class Program {

	public static void main(String[] args) {
		Account a1 = new Account();
		try {
			a1 = new Account(1, "Igor", 1000.00,2000.00);
			
			a1.withdraw(1200.00);
	
		}
		catch (EntitiesException e){
			System.out.println("Erro no Saque: "+ e.getMessage());
		}
		catch (RuntimeException e ) {
			System.out.println("Erro inesperado");
		}
		finally {
			System.out.println(a1);
		}
	}

}
