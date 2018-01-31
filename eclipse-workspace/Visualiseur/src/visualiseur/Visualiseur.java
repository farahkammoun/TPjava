package visualiseur;
import java.awt.*;

public class Visualiseur extends Frame {

	public Visualiseur()
	{
		this.setTitle("Visualisuer de Couleurs");
		Panel P1 = new Panel() ;
		Panel P2 = new Panel();
		
	Label Lrouge = new Label("rouge");	
	TextField TFrouge = new TextField("127");
	Scrollbar Srouge = new Scrollbar (Scrollbar.HORIZONTAL, 1,0,255,0);
	Panel Prouge = new Panel();
	Prouge.add(Lrouge); 
	Prouge.add(TFrouge);
	Prouge.add(Srouge);
	
	Label Lvert = new Label("vert");	
	TextField TFvert = new TextField("127");
	Scrollbar Svert = new Scrollbar (Scrollbar.HORIZONTAL, 1,0,255,0);
	Panel Pvert = new Panel();
	Pvert.add(Lvert); 
	Pvert.add(TFvert);
	Pvert.add(Svert);

	
	
	Label Lbleu = new Label("bleu");	
	TextField TFbleu = new TextField("127");
	
	Scrollbar Sbleu = new Scrollbar (Scrollbar.HORIZONTAL, 1,0,255,0);
	Panel Pbleu = new Panel();
	Pbleu.add(Lbleu); 
	Pbleu.add(TFbleu);
	Pbleu.add(Sbleu);
	
	
	P1.setLayout(new GridLayout(3,1));
	P1.add(Prouge);
	P1.add(Pvert);
	P1.add(Pbleu);
	
	
	Canvas couleur = new Canvas ();
	couleur.setSize(200,200);
	P2.add(couleur);
		
		this.setLayout(new FlowLayout());
		this.add(P2);
		this.add(P1);
	
		
		
		this.pack();
		this.setVisible(true);
	}	
	
}
