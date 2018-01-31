import java.awt.* ;

public class MonFrame extends Frame {
 
	MonFrame ()
	{
		
		this.setTitle("Frame Example");
		GridLayout myLayout = new GridLayout(7,1);
		this.setLayout(myLayout);
		
		
		MenuBar mymenu = new MenuBar ();
		this.setMenuBar(mymenu);   
      Menu languages = new Menu("languages");
      mymenu.add(languages);
      MenuItem mi1 = new MenuItem("linux");
      MenuItem mi2 = new MenuItem("Solaris");
      MenuItem mi3 = new MenuItem("Aix");



      languages.add(mi1);
      languages.add(mi2);
      languages.add(mi3);
		
		
		
		
		
		
		
		Label T = new Label("TextField");
		TextField TF1 = new TextField("abcdefgh")  ;
		Panel P2 = new Panel();
		P2.add(T);
		P2.add(TF1);
		
		
		Label C = new Label("choice");
		Choice choix = new Choice ()  ;
		choix.add("Solaris");
		Panel P3 = new Panel();
		P3.add(C);
		P3.add(choix);
		
		Label L = new Label("Liste");
		List liste = new List();
		liste.add("linux");
		liste.add("aix");
		Panel P4 = new Panel();
		P4.add(L);
		P4.add(liste);
		
		Button B1 = new Button("OK");
		Button B2 = new Button("Annuler");
		Panel P5 = new Panel();
		P5.add(B1);
		P5.add(B2);
		
		
	
		
		CheckboxGroup chg = new CheckboxGroup();
		Checkbox ch1 = new Checkbox("Solaris", chg, true);
		Checkbox ch3 = new Checkbox("Aix",chg, false);

		Checkbox ch2 = new Checkbox("linux",chg,false);
		Panel P1 = new Panel();
		P1.add(ch1);
		P1.add(ch2);
		P1.add(ch3);
		
		Checkbox ch11 = new Checkbox("Solaris", true);
		Checkbox ch31 = new Checkbox("Aix", false);

		Checkbox ch21 = new Checkbox("linux",false);
		Panel P11 = new Panel();
		P11.add(ch11);
		P11.add(ch21);
		P11.add(ch31);
		
		
		this.add(P2);
		this.add(P3);
		this.add(P4);
		this.add(P11);
		this.add(P1);
		this.add(P5);
		
		
		
		this.pack();
		this.setVisible(true);
		
	}

}
