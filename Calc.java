import javax.swing.*;
import java.awt.event.*;
public class Calc implements ActionListener
{
    JFrame f;
    JPanel p;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    JLabel res;
    String s="";

    public static void main(String args[])
    {
        Calc c=new Calc();
    }
    Calc()
    {
        f=new JFrame("Calculator");
        p=new JPanel();
        b0= new JButton("0");
        b1= new JButton("1");
        b2= new JButton("2");
        b3= new JButton("3");
        b4= new JButton("4");
        b5= new JButton("5");
        b6= new JButton("6");
        b7= new JButton("7");
        b8= new JButton("8");
        b9= new JButton("9");
        b10= new JButton("+");
        b11= new JButton("-");
        b12= new JButton("*");
        b13= new JButton("/");
        b14= new JButton("=");
        b15=new JButton("C");
        b16=new JButton(".");
        b17=new JButton("sin");
        b18=new JButton("cos");
        b19=new JButton("tan");
        res=new JLabel();


        b0.setBounds(50,50,50,50);
        b1.setBounds(50,50,50,50);
        b2.setBounds(50,50,50,50);
        b3.setBounds(50,50,50,50);
        b4.setBounds(50,50,50,50);
        b5.setBounds(50,50,50,50);
        b6.setBounds(50,50,50,50);
        b7.setBounds(50,50,50,50);
        b8.setBounds(50,50,50,50);
        b9.setBounds(50,50,50,50);
        b10.setBounds(50,50,50,50);
        b11.setBounds(50,50,50,50);
        b12.setBounds(50,50,50,50);
        b13.setBounds(50,50,50,50);
        b14.setBounds(50,50,50,50);
        b15.setBounds(50,50,50,50);
        b16.setBounds(50,50,50,50);
        b17.setBounds(50,50,50,50);
        b18.setBounds(50,50,50,50);
        b19.setBounds(50,50,50,50);

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
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);

        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);

        p.add(res);
        f.add(p);
        f.setSize(900,900);
        f.setVisible(true);
    }
       public void actionPerformed(ActionEvent e)
    {
          s=s+e.getActionCommand();
         int c=checkCase(s);
         switch (c)
         {
           case 1:
           res.setText("");
           s="";
           break;


           case 2:
           double n1=0,n2=0,r=0;
           String rs;
           char ch='a';
           int l=s.length();
           if (s.charAt(l-1)=='=')
           {
               for (int i=0;i<l;i++)
               {
                    ch=s.charAt(i);
                    if (ch=='+'||ch=='-'||ch=='*'||ch=='/')
                    {
                        n1=Double.valueOf(s.substring(0,i));

                        n2=Double.valueOf(s.substring(i+1,l-1));
                        break;
                    }
                    else if (ch=='s'||ch=='c'||ch=='t')
                    {
                      n1=Double.valueOf(s.substring(3,l-1));
                      break;
                    }
               }
               switch (ch)
               {
                 case '+':
                 r=n1+n2;
                 break;
                 case '-':
                 r=n1-n2;
                 break;
                 case '*':
                 r=n1*n2;
                 break;
                 case '/':
                 r=n1/n2;
                 break;
                 case 's':
                 r=(double) Math.round(Math.sin(Math.toRadians(n1))*100)/100;;
                 break;
                 case 'c':
                 r=(double) Math.round(Math.cos(Math.toRadians(n1))*100)/100;
                 break;
                 case 't':
                 r=(double) Math.round(Math.tan(Math.toRadians(n1))*100)/100;
               }
               }
               rs=Double.toString(r);
               res.setText(rs);
               s=rs;
           break;



           case 3:
           res.setText(s);
          }
    }

    public int checkCase(String a)
    {

        for (int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if (ch=='C')
            return 1;
            else if (ch=='=')
            return 2;

        }
        return 3;
    }
}
