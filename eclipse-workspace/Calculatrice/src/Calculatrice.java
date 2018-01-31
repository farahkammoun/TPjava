import java.awt.*;
import java.awt.event.*;
import java.io.Console;
public class Calculatrice extends Frame implements ActionListener {
	
	

	Button b0 ;
	Button b1;
	Button b2 ;
	Button b3 ;
	Button b4 ;
	Button b5 ;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button bp;
	Button bm;
	Button bf;
	Button bss;
	Button bpm;
	Button clearall ;
	
	
	TextField Result;
	Button Enter ;

	
	int a; int b;
	char op ;
	boolean pm = false;
public Calculatrice(){
	this.setTitle("CALCULATRICE");
	Result = new TextField(0);
	
	 b0 = new Button("0");
	 b1 = new Button("1");
	 b2 = new Button("2");
	 b3 = new Button("3");
	 b4 = new Button("4");
	 b5 = new Button("5");
	 b6 = new Button("6");
	 b7 = new Button("7");
	 b8 = new Button("8");
	b9 = new Button("9");
	 bp = new Button("+");
	 bm = new Button("-");
	 bf = new Button("*");
	 bss = new Button("/");
	 bpm  = new Button("+/-");
	 clearall = new Button("Clear All");

	
	Panel P = new Panel();
	Panel P1 = new Panel(); P1.setLayout(new GridLayout(4,1));
	Panel P2 = new Panel();P2.setLayout(new GridLayout(4,1));
	Panel P3 = new Panel();P3.setLayout(new GridLayout(4,1));
	Panel P4 = new Panel();P4.setLayout(new GridLayout(4,1));
	
	P1.add(b7); P1.add(b4); P1.add(b1); P1.add(b0);
	P2.add(b8); P2.add(b5); P2.add(b2); P2.add(bpm);
	P3.add(b9); P3.add(b6); P3.add(b3); P3.add(clearall);
	P4.add(bp); P4.add(bm); P4.add(bf); P4.add(bss);
	
	P.add(P1); P.add(P2);
	P.add(P3); P.add(P4);
	
	
	

	Enter = new Button("Enter");

	
	this.add(Result,"North");
	this.add(P,"Center");
	this.add(Enter, "South"); 
	
	
	this.pack();
	this.setVisible(true);
	
	
	this.addWindowListener(new EcouteurF());
	
	b0.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	bm.addActionListener(this);
	bp.addActionListener(this);
	bss.addActionListener(this);
	bf.addActionListener(this);
	bpm.addActionListener(this);
	clearall.addActionListener(this);
	Enter.addActionListener(this);
}

public void  actionPerformed (ActionEvent e )	{

	Button bs= (Button)(e.getSource());
	if (bs==b0)
	{
	
		 String s = Result.getText()+'0';
		 Result.setText(s);
		
		}
	if (bs==b1)
	{
		 String s = Result.getText()+'1';
		 Result.setText(s);
	}
	if (bs==b2)
	{

		 String s = Result.getText()+'2';
		 Result.setText(s);
	}
	if (bs==b3)
	{
		 String s = Result.getText()+'3';
		 Result.setText(s);}
	if (bs==b4)
	{

		 String s = Result.getText()+'4';
		 Result.setText(s);
	}
	if (bs==b5)
	{

		 String s = Result.getText()+'5';
		 Result.setText(s);
	}
	if (bs==b6)
	{

		 String s = Result.getText()+'6';
		 Result.setText(s);
	}
	if (bs==b7)
	{
		 String s = Result.getText()+'7';
		 Result.setText(s);}
	if (bs==b8)
	{
		 String s = Result.getText()+'8';
		 Result.setText(s);}
	if (bs==b9)
	{
		 String s = Result.getText()+'9';
		 Result.setText(s);
			
}
	 if (bs==bm)
	{
		int a= Integer.parseInt(Result.getText());
		op='-';
		Result.setText("");

	}
	if (bs==bss)
	{
		a= Integer.parseInt(Result.getText());
		op='/';
		Result.setText("");

	}
	if (bs==bp)
	{
		 a= Integer.parseInt(Result.getText());
		op='+';
		Result.setText("");

	}
	if (bs==bf)
	{
		 a= Integer.parseInt(Result.getText());
		op='*';
		Result.setText("");

	}
	if (bs==bpm)
	{
		int  c= Integer.parseInt(Result.getText());
		 c*=-1;
		pm = false ;
		Result.setText(String.valueOf(c));
		
	}
	if (bs==clearall)
	{
		Result.setText("");
	}
	
	if (bs==Enter)
	{
		 b= Integer.parseInt(Result.getText());
		
		
	if (op=='+') { 
		int res = a+b;
		Result.setText(String.valueOf(res));

	}
	if (op=='-') { 
		int res = a-b;
		Result.setText(String.valueOf(res));

	}
	if (op=='*') { 
		int res = a*b;
		Result.setText(String.valueOf(res));

	}
	if (op=='/') { 
		int res = a/b;
		Result.setText(String.valueOf(res));

	}
	
	}
}
}





