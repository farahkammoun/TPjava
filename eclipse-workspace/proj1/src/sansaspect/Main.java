package sansaspect;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Compte monCompte = new Compte(1000);
System.out.println("Avant retrait "+ monCompte.getSolde());

monCompte.retrait(300);

System.out.println("Aprés retrait "+ monCompte.getSolde());

	}

}
