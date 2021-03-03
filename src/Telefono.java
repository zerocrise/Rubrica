import javax.swing.*;
import java.awt.*;

public class Telefono extends JFrame {
private JTextField nome,cognome,numero;

public Telefono(){
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
this.pack();
this.setVisible(true);

    }
    public static void main(String[] args){
    new Telefono();
    }
}
