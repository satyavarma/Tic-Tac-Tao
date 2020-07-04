import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="GameEx2" height=500 width=500>
</applet>
*/
public class GameEx2 extends Applet implements ActionListener{
	
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillOval(40, 180, 80, 80);
		g.setColor(Color.red);
		g.fillOval(380, 180, 80, 80);
		g.setColor(Color.white);
		g.drawString("P1",73,225);
		g.drawString("P2",415,225);
		g.setColor(Color.red);
		g.drawString("Warning : Most Addictable Game!",170,50);
	}
	Button a1,a2,a3,a4,a5,a6,a7,a8,a9,ref;
	Label l1 = new Label("Tic Tac Toe  ");
	Font f = new Font("Verdana",Font.BOLD,15);
	int i=1;
	public void init(){
	 GridBagLayout gbl = new GridBagLayout();
	 GridBagConstraints gbc = new GridBagConstraints();
	 setLayout(gbl);
	
	 gbc.gridx = 1;
	 gbc.gridy = 4;
	 gbc.gridwidth=3;
	 gbc.ipadx = 30;
	 gbc.ipady = 30;
	 l1.setFont(f);
	 add(l1,gbc);
	 
	 
	 a1 = new Button(" ");
	 gbc.gridx=0;
	 gbc.gridy=0;
	 gbc.gridwidth=1;
	 a1.setPreferredSize(new Dimension(50,40));
	 a1.setBackground(Color.lightGray);
	 add(a1,gbc);
	 a1.addActionListener(this);
	 
	 a2 = new Button(" ");
	 gbc.gridx=1;
	 gbc.gridy=0;
	 gbc.gridwidth=1;
	 a2.setPreferredSize(new Dimension(50,40));
	 a2.setBackground(Color.lightGray);
	 add(a2,gbc);
	 a2.addActionListener(this);

	 a3 = new Button(" ");
	 gbc.gridx=2;
	 gbc.gridy=0;
	 gbc.gridwidth=1;
	 a3.setPreferredSize(new Dimension(50,40));
	 a3.setBackground(Color.lightGray);
	 add(a3,gbc);
	 a3.addActionListener(this);
	 
	 a4 = new Button(" ");
	 gbc.gridx=0;
	 gbc.gridy=1;
	 gbc.gridwidth=1;
	 a4.setPreferredSize(new Dimension(50,40));
	 a4.setBackground(Color.lightGray);
	 add(a4,gbc);
	 a4.addActionListener(this);
	 
	 a5 = new Button(" ");
	 gbc.gridx=1;
	 gbc.gridy=1;
	 gbc.gridwidth=1;
	 a5.setPreferredSize(new Dimension(50,40));
	 a5.setBackground(Color.lightGray);
	 add(a5,gbc);
	 a5.addActionListener(this);
	  
	 a6 = new Button(" ");
	 gbc.gridx=2;
	 gbc.gridy=1;
	 gbc.gridwidth=1;
	 a6.setPreferredSize(new Dimension(50,40));
	 a6.setBackground(Color.lightGray);
	 add(a6,gbc);
	 a6.addActionListener(this);
	 
	 a7 = new Button(" ");
	 gbc.gridx=0;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a7.setPreferredSize(new Dimension(50,40));
	 a7.setBackground(Color.lightGray);
	 add(a7,gbc);
	 a7.addActionListener(this);
	 
	 a8 = new Button(" ");
	 gbc.gridx=1;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a8.setPreferredSize(new Dimension(50,40));
	 a8.setBackground(Color.lightGray);
	 add(a8,gbc);
	 a8.addActionListener(this);
	 
	 a9 = new Button(" ");
	 gbc.gridx=2;
	 gbc.gridy=2;
	 gbc.gridwidth=1;
	 a9.setPreferredSize(new Dimension(50,40));
	 a9.setBackground(Color.lightGray);
	 add(a9,gbc);
	 a9.addActionListener(this);
	 
	 ref = new Button("Refresh");
	 gbc.gridx=0;
	 gbc.gridy=5;
	 gbc.gridwidth=4;
	 ref.setPreferredSize(new Dimension(14,2));
	 ref.setBackground(Color.cyan);
	 add(ref,gbc);
	 ref.addActionListener(this);
	 
	}
	
	public void actionPerformed(ActionEvent e){
		
		
		if(e.getSource()==a1){
			if(i%2==1){
				a1.setBackground(Color.blue);
				a1.setLabel("|||");
				a1.setEnabled(false);
			}
			else{
				a1.setBackground(Color.red);
				a1.setLabel("---");
				a1.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a2){
			if(i%2==1){
				a2.setBackground(Color.blue);
				a2.setLabel("|||");
				a2.setEnabled(false);
			}
			else{
				a2.setBackground(Color.red);
				a2.setLabel("---");
				a2.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a3){
			if(i%2==1){
				a3.setBackground(Color.blue);
				a3.setLabel("|||");
				a3.setEnabled(false);
			}
			else{
				a3.setBackground(Color.red);
				a3.setLabel("---");
				a3.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a4){
			if(i%2==1){
				a4.setBackground(Color.blue);
				a4.setLabel("|||");
				a4.setEnabled(false);
			}
			else{
				a4.setBackground(Color.red);
				a4.setLabel("---");
				a4.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a5){
			if(i%2==1){
				a5.setBackground(Color.blue);
				a5.setLabel("|||");
				a5.setEnabled(false);
			}
			else{
				a5.setBackground(Color.red);
				a5.setLabel("---");
				a5.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a6){
			if(i%2==1){
				a6.setBackground(Color.blue);
				a6.setLabel("|||");
				a6.setEnabled(false);
			}
			else{
				a6.setBackground(Color.red);
				a6.setLabel("---");
				a6.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a7){
			if(i%2==1){
				a7.setBackground(Color.blue);
				a7.setLabel("|||");
				a7.setEnabled(false);
			}
			else{
				a7.setBackground(Color.red);
				a7.setLabel("---");
				a7.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a8){
			if(i%2==1){
				a8.setBackground(Color.blue);
				a8.setLabel("|||");
				a8.setEnabled(false);
			}
			else{
				a8.setBackground(Color.red);
				a8.setLabel("---");
				a8.setEnabled(false);
			}
		}
		
		else if(e.getSource()==a9){
			if(i%2==1){
				a9.setBackground(Color.blue);
				a9.setLabel("|||");
				a9.setEnabled(false);
			}
			else{
				a9.setBackground(Color.red);
				a9.setLabel("---");
				a9.setEnabled(false);
			}
		}
		
		if(((a1.getLabel()==a2.getLabel() && a2.getLabel()==a3.getLabel()) && (a1.getLabel()!=" ")) || ((a4.getLabel()==a5.getLabel() && a5.getLabel()==a6.getLabel()) && (a4.getLabel()!=" ")) || ((a7.getLabel()==a8.getLabel() && a8.getLabel()==a9.getLabel()) && (a7.getLabel()!=" "))){
			if(i%2==1)
				l1.setText("P1 Won");
			else
				l1.setText("P2 Won");
			a1.setEnabled(false);
			a2.setEnabled(false);
			a3.setEnabled(false);
			a4.setEnabled(false);
			a5.setEnabled(false);
			a6.setEnabled(false);
			a7.setEnabled(false);
			a8.setEnabled(false);
			a9.setEnabled(false);
		}
		else if(((a1.getLabel()==a4.getLabel() && a4.getLabel()==a7.getLabel()) && (a1.getLabel()!=" ")) || ((a2.getLabel()==a5.getLabel() && a5.getLabel()==a8.getLabel()) && (a2.getLabel()!=" ")) || ((a3.getLabel()==a6.getLabel() && a6.getLabel()==a9.getLabel()) && (a6.getLabel()!=" "))){
			if(i%2==1)
				l1.setText("P1 Won");
			else
				l1.setText("P2 Won");	
			a1.setEnabled(false);
			a2.setEnabled(false);
			a3.setEnabled(false);
			a4.setEnabled(false);
			a5.setEnabled(false);
			a6.setEnabled(false);
			a7.setEnabled(false);
			a8.setEnabled(false);
			a9.setEnabled(false);
		}
		else if(((a1.getLabel()==a5.getLabel() && a5.getLabel()==a9.getLabel()) && (a1.getLabel()!=" ")) || ((a3.getLabel()==a5.getLabel() && a5.getLabel()==a7.getLabel()) && (a3.getLabel()!=" "))){
			if(i%2==1)
				l1.setText("P1 Won");
			else
				l1.setText("P2 Won");
			a1.setEnabled(false);
			a2.setEnabled(false);
			a3.setEnabled(false);
			a4.setEnabled(false);
			a5.setEnabled(false);
			a6.setEnabled(false);
			a7.setEnabled(false);
			a8.setEnabled(false);
			a9.setEnabled(false);
		}
		else if(i==9)
			l1.setText("Match tied");
		i++;
		
		if(e.getSource()==ref){
			i=1;
			a1.setEnabled(true);
			a2.setEnabled(true);
			a3.setEnabled(true);
			a4.setEnabled(true);
			a5.setEnabled(true);
			a6.setEnabled(true);
			a7.setEnabled(true);
			a8.setEnabled(true);
			a9.setEnabled(true);
			
			a1.setBackground(Color.lightGray);
			a1.setLabel(" ");
			a2.setBackground(Color.lightGray);
			a2.setLabel(" ");
			a3.setBackground(Color.lightGray);
			a3.setLabel(" ");
			a4.setBackground(Color.lightGray);
			a4.setLabel(" ");
			a5.setBackground(Color.lightGray);
			a5.setLabel(" ");
			a6.setBackground(Color.lightGray);
			a6.setLabel(" ");
			a7.setBackground(Color.lightGray);
			a7.setLabel(" ");
			a8.setBackground(Color.lightGray);
			a8.setLabel(" ");
			a9.setBackground(Color.lightGray);
			a9.setLabel(" ");
			
			l1.setText("Tic Tac Toe ");
		}
	}
}