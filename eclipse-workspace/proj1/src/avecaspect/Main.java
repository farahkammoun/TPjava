package avecaspect;

import avecaspect.Compte;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte monCompte = new Compte(1000);
		Compte monCompte2 = new Compte(600);
		monCompte.retrait(300);
		monCompte2.retrait(200);

	}

}
