import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaIndex extends JFrame implements ActionListener{
    
    
        
    JButton cadPess = new JButton("Cadastrar Pessoa");
    JButton cadDiv = new JButton("Cadastrar Divida");
    JButton cadProv = new JButton("Cadastrar Provimento");
    JButton consPess = new JButton("Consultar pessoa");
    JButton consDiv = new JButton("Consultar Divida");
    JButton consProv = new JButton("Consultar Provimentos");
    
    public TelaIndex() {
        
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pane.add(cadPess);
        pane.add(cadDiv);
        pane.add(cadProv);
        pane.add(consPess);
        pane.add(consDiv);
        pane.add(consProv);

        ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                methodAction(event);
            }
        };

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,250);
        this.setVisible(true);

         cadPess.addActionListener(handlerAction);
        cadDiv.addActionListener(handlerAction);
        cadProv.addActionListener(handlerAction);
        consPess.addActionListener(handlerAction);
        consDiv.addActionListener(handlerAction);
        consProv.addActionListener(handlerAction);

    }
    private void methodAction(final ActionEvent event) {
        if (event.getSource() == cadPess) {
            Pessoas cadastro = new CadastrarPessoa();
        }
        if (event.getSource() == cadDiv) {
            System.out.println("Cadastrar Dívidas");
        }
        if (event.getSource() == cadProv) {
            System.out.println("Cadastrar Proventos");
        }
        if (event.getSource() == consPess) {
            System.out.println("Consultar Pessoas");
        }
        if (event.getSource() == consDiv) {
            System.out.println("Consultar Dívidas");
        }
        if (event.getSource() == consProv) {
            System.out.println("Consultar Proventos");
        }
        
    }
       
        
    }
    public static void main(String[] args){
        TelaIndex janela = new TelaIndex();
    }
}