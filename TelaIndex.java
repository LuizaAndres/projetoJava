//arquivo pronto
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaIndex extends JFrame{
//criando objetos    
    JButton cadPess = new JButton("Cadastrar Pessoa");
    JButton cadDiv = new JButton("Cadastrar Divida");
    JButton cadProv = new JButton("Cadastrar Provimento");
    JButton consPess = new JButton("Consultar pessoa");
    JButton consDiv = new JButton("Consultar Divida");
    JButton consProv = new JButton("Consultar Provimentos");
    
    public TelaIndex() {
//criando tela e tipo        
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
//adicioando objetos
        pane.add(cadPess);
        pane.add(cadDiv);
        pane.add(cadProv);
        pane.add(consPess);
        pane.add(consDiv);
        pane.add(consProv);
//fazendo os obj terem função
        ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                methodAction(event);
            }
        };
//caracteristicas da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,250);
        this.setVisible(true);
//adicionando os objetos
        cadPess.addActionListener(handlerAction);
        cadDiv.addActionListener(handlerAction);
        cadProv.addActionListener(handlerAction);
        consPess.addActionListener(handlerAction);
        consDiv.addActionListener(handlerAction);
        consProv.addActionListener(handlerAction);
    }
//fazendo objetos terem função por botão    
    private void methodAction(final ActionEvent event) {
        if (event.getSource() == cadPess) {
            new TelaCadastrarPessoa();
        }
        if (event.getSource() == cadDiv) {
            new TelaCadastrarDivida();
        }
        if (event.getSource() == cadProv) {
            new TelaCadastrarProvento();
        }
        if (event.getSource() == consPess) {
            new TelaConsultarPessoas();
        }
        if (event.getSource() == consDiv) {
            new TelaConsultarDivida();
        }
        if (event.getSource() == consProv) {
            new TelaConsultarProvento();
        }
    }
       
    public static void main(String[] args){
        new TelaIndex();
    }
}