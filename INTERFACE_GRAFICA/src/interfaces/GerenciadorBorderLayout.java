package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alessandro
 */
public class GerenciadorBorderLayout extends JFrame {

    public GerenciadorBorderLayout() {
        setTitle("BorderLayout (Layout da Borda) ");
        setLayout(new BorderLayout());
        setSize(600, 500);
        JButton btnCentro = new JButton("Centro");
        btnCentro.setBackground(new Color(255,0,255));
        JButton btnEsquerda = new JButton("Esquerda");
        JButton btnDireita = new JButton("Direita");
        JButton btnNorte = new JButton("Norte");
        JButton btnSul = new JButton("Sul");
        add(btnCentro,BorderLayout.CENTER);
        add(btnEsquerda,BorderLayout.WEST);
        add(btnDireita,BorderLayout.EAST);
        add(btnSul,BorderLayout.SOUTH);
        add(btnNorte,BorderLayout.NORTH);
    }

    
}
