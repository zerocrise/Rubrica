import javax.swing.*;
import java.awt.*;
<<<<<<< HEAD

public class Telefono extends JFrame {
private JTextField nome,cognome,numero;

public Telefono(){
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telefono extends JFrame implements ActionListener {
private JTextField nome,cognome,numero;
private  Rubrica rubrica;
private int indice=0;
public Telefono(){
    rubrica=new Rubrica();

>>>>>>> Initial commit
this.setTitle("Rubrica");
JPanel p1=new JPanel();
p1.add(new JLabel("Cognome:"));
cognome=new JTextField(10);
p1.add(cognome);
p1.add(new JLabel("Nome:"));
nome=new JTextField(10);
p1.add(nome);
p1.add(new JLabel("Numero:"));
numero=new JTextField(12);
p1.add(numero);
this.add(p1, BorderLayout.CENTER);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
<<<<<<< HEAD
=======
JButton aggiungi=new JButton("Add");
p1.add(aggiungi);
aggiungi.addActionListener(this);
JPanel p2=new JPanel();
p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
JButton modifica=new JButton("Modifica");
p2.add(modifica);
JButton elimina=new JButton("Elimina");
p2.add(elimina);
this.add(p2,BorderLayout.LINE_END);
modifica.addActionListener(new Ascoltatore(rubrica,indice));
elimina.addActionListener(new Ascltatore(rubrica,indice));

>>>>>>> Initial commit
this.pack();
this.setVisible(true);

    }
    public static void main(String[] args){
    new Telefono();
    }
<<<<<<< HEAD
=======

    @Override
    public void actionPerformed(ActionEvent e) {
     String no=nome.getText();
     String co=cognome.getText();
     String num=numero.getText();
     Contatto c=new Contatto(co,no,num);
     rubrica.aggiungi(c);
     }
>>>>>>> Initial commit
}
