import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener; 

// contido de opcao e subopcao
public class Frame extends JFrame { 
// a barra de menu
    private JMenuBar menuBar = new JMenuBar(); 
//opcao
    private JMenu menuCadastrar = new JMenu("Arquivo");

 
//label
private JLabel labelBemVindo;

//criando botoes
    JButton cadastrar = new JButton("Cadastrar");
    JButton consultar = new JButton("Consultar");
    JButton fechar = new JButton("Fechar");

    public Frame() {

       
//label
        labelBemVindo = new JLabel("Bem Vindo");
                
        Container pane = this.getContentPane();

        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pane.add(cadastrar);
        pane.add(consultar);
        pane.add(fechar);

        final ActionListener handlerAction = new ActionListener(){
            public void actionPerformed (final ActionEvent event){
                methodAction(event);
            }

        };

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(310,200);
        this.setVisible(true);
    }

    private void methodAction(final ActionEvent e){
        if (e.getSource() == cadastrar){
            cadastrarUsuario();
        }
        if (e.getSource() == fechar){
            JOptionPane.showConfirmDialog(//mensagem de confirmacao
                this, 
                "Deseja Fechar?",
                "Fechar",
                JOptionPane.OK_CANCEL_OPTION,//tipo de opção
                JOptionPane.QUESTION_MESSAGE//ponto de interrogacao
            );
            if(ret == JOptionPane.OK_OPTION){//se clicar no ok
                System.exit(0);//sai do programa
            }
        }
    }
        
    public static void main(String[] args){
        Frame janela = new Frame();
    }
}