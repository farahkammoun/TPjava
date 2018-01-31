import java.awt.*;
public class Editeur extends Frame {
	Button b1,b2,b3,b4;
	Canvas c;
	Choice cFond, cText;
	
	String boutonChoisi="Ligne";
	int x, y, lastX, lastY;
	Color couleurFond = Color.blue;
	Color couleurText = Color.yellow;
	
	public Editeur()
	{
		
		setTitle("Mon éditeur de dessin");
		setLayout(new FlowLayout());
		Panel p1= new Panel(new GridLayout(8,1, 30, 5));
		
	
		cFond = new Choice();
		cFond.add("Bleu");
		cFond.add("Noir");
		cFond.add("Rouge");
		cFond.add("Vert");
		p1.add(new Label("Couleur de fond"));
		p1.add(cFond);
		
		cText = new Choice();
		cText.add("Jaune");
		cText.add("Rose");
		cText.add("Blanc");
		cText.add("Bleu");
		p1.add(new Label("Couleur de texte"));
		p1.add(cText);
		
		//Création des boutons
		b1=new Button("Ligne");
		b2=new Button("Rectangle");	
		b3=new Button("Ovale");
		b4=new Button("Effacer");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		add(p1);
		
		c= new Canvas();
		c.setSize(400,400);
		c.setBackground(couleurFond);
		add(c);
		setVisible(true);
		pack();
}
}