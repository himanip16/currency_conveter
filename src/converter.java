import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class converter {
    public static void CurrencyConverter(){
        JFrame f = new JFrame("Currency Converter");
        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b2, b3;

        l1= new JLabel("Rupees:");
        l1.setBounds(30,40,60,30);
        l2= new JLabel("Dollars: ");
        l2.setBounds(170, 40, 60, 30);

        t1= new JTextField("");
        t1.setBounds(80,40,50,30);
        t2= new JTextField("");
        t2.setBounds(240, 40, 50, 30);

        b1 = new JButton("INR");
        b1.setBounds(50,80,60,20);
        b2 = new JButton("Dollar");
        b2.setBounds(200,80,100,20);
        b3 = new JButton("Close");
        b3.setBounds(150,180,100,20);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d= Double.parseDouble(t1.getText());
                double d1=Math.round((d/65.25)*100.0)/100.0;
                String str1= String.valueOf(d1);
                t2.setText( str1);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d= Double.parseDouble(t2.getText());
                double d2=Math.round(d*65.25*100.0)/100.0;
                String str2 = String.valueOf(d2);
                t1.setText( str2 );
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(null);
        f.setSize(400, 300);

        //default is false, without setting to true, nothing would display
        f.setVisible(true);

    }

    public static void main(String[] args) {
        CurrencyConverter();
    }
}
