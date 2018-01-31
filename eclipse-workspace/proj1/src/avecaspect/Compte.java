package avecaspect;

public class Compte {
	 private int solde =0;
		public Compte(int a)
		{
			this.solde = a;
		}
		public void retrait(int b) {
			this.solde -=b;
		}
		public int getSolde() {
			return solde;
		}
		public void setSolde(int solde) {
			this.solde = solde;
		}
		
}
