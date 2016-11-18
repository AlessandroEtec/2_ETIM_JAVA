package interfaces;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal extends JFrame {
    JButton btnBorderLayout;
    public Principal() {
        setTitle("Tela Principal");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        btnBorderLayout = new JButton("Border");
        btnBorderLayout.setBounds(20, 60, 120, 30);
        
        btnBorderLayout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GerenciadorBorderLayout janela
                        = new GerenciadorBorderLayout();
                janela.setVisible(true);
            }
        });
        add(btnBorderLayout);
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setVisible(true);
    }

}


