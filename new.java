import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class new extends Applet implements ActionListener
{
 TextField t1,t2,t3;
 Button b1,b2,b3,b4;
 Label l1,l2,l3;
 public void init()
 {
  l1=new Label("FIRST NUMBER");
  add(l1);
  t1=new TextField();
  add(t1);
  l2=new Label("SECOND NUMBER");
  add(l2);
  t2=new TextField();
  add(t2);
  l3=new Label(" ");
  add(l3);
  t3=new TextField();
  add(t3);
  b1=new Button("ADDITION");
  b2=new Button("SUBSTRACTION");
  b3=new Button("MULTIPLICATION");
  b4=new Button("DIVISION");
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  GridLayout gl=new GridLayout(5,2);
  setLayout(gl);
  }
  public void actionPerformed(ActionEvent ae)
  {
   if(ae.getSource()==b1)
   {
   int n1=Integer.parseInt(t1.getText());
   int n2=Integer.parseInt(t2.getText());
   int n3=n1+n2;
   l3.setText("ADDITION");
   t3.setText(Integer.toString(n3));
   }
   if(ae.getSource()==b2)
  {
  int n1=Integer.parseInt(t1.getText());
  int n2=Integer.parseInt(t2.getText());
  int n3=n1-n2;
  l3.setText("SUBSTRACTION");
  t3.setText(Integer.toString(n3));
  }
  if(ae.getSource()==b3)
  {
  int n1=Integer.parseInt(t1.getText());
  int n2=Integer.parseInt(t2.getText());
  int n3=n1*n2;
  l3.setText("MULTIPLICATION");
  t3.setText(Integer.toString(n3));
  }
  if(ae.getSource()==b4)
  {
  float n1=Float.parseFloat(t1.getText());
  float n2=Float.parseFloat(t2.getText());
  float n3=n1/n2;
  l3.setText("DIVISION");
  t3.setText(Float.toString(n3));
  }
  }
}
