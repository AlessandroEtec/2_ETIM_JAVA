package interfaces;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GerenciadorFlowLayout extends JFrame {

    JButton btnA, btnB, btnC, btnD, btnE, btnF;
   
    public GerenciadorFlowLayout() {
        Dimension tamanho = new Dimension(80, 25);
        setTitle("Gerenciador Flow Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        btnA = new JButton("A");
        btnA.setPreferredSize(tamanho);
        btnB = new JButton("B");
        btnB.setPreferredSize(tamanho);
        btnC = new JButton("C");
        btnD = new JButton("D");
        btnE = new JButton("E");
        btnF = new JButton("F");
        add(btnA);         add(btnB);
        add(btnC);         add(btnD);
        add(btnE);         add(btnF);
    }

    public static void main(String[] args) {
       GerenciadorFlowLayout janela = new GerenciadorFlowLayout();
       janela.setVisible(true);
    }
}
