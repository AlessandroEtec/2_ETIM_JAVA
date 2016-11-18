/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author alessandro
 */
public class Botao extends JButton {

    public Botao() {
        setText("");
        setFont(new Font("Arial", Font.BOLD, 20));
        this.addActionListener(new Acao());
    }

    public class Acao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            
        }

    }

}
