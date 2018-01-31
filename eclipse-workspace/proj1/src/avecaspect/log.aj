package avecaspect;

public aspect log {

	pointcut logRetrait(Compte c): call (void avecaspect.Compte.retrait(*))&& target(c);
	before(Compte c) : logRetrait(c){
		System.out.println("Avant retrait "+c.getSolde() +"   "+c );

	}
	after(Compte c) : logRetrait(c) {
		System.out.println("Apres retrait "+c.getSolde() +"    "+c );

	}
	
}
