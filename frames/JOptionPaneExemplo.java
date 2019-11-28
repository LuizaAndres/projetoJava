package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //obj que fica standby esperando uma ação

public class JOptionPaneExemplo extends JFrame {
    private JButton mensagem; //criou o botao
    private JButton fechar;

    public JOptionPaneExemplo(){
        super("TESTE DE OptionPane");

        mensagem = new JButton("Mensagem"); //define o botao como botao
        fechar = new JButton("Fechar");

        Container pane = this.getContentPane();// criando um container, caixa onde coloca coisas, vai no jframe e transforma a porte cinza da tela e traz como uma variavel tipo uma tela que podemos colocar as informacoes

        pane.add(mensagem); //adiciona no painel(container)
        pane.add(fechar);

        pane.setLayout(null);

        mensagem.setBounds(10,30,100,22);//tamanho do botão x,y,w,h
        fechar.setBounds(10,60,100,22);

        mensagem.addActionListener(new ActionListener(){//criou o action listener classe abstrata que tem metodo o action performed
            public void actionPerformed(ActionEvent e/*parametro qualquer que é o evento*/){
                buttonMensagemActionPerformed(e);//nova funcao que passa o parametro e
            }
        });

        fechar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonConfirmaActionPerformed(e);
            }
        });

        this.setSize(250,210); //tamnho da tela
        this.setContentPane(pane); //definindo a tela
        this.setVisible(true); //deixar a tela visivel
    }

    private void buttonMensagemActionPerformed(ActionEvent e){//mostra painel
        JOptionPane.showMessageDialog(//mostra mensagem
            this, //quem chamou o evento
            "ISSO É UM TESTE",//mensagem da tela
            "FUNCIONA!",//nome da tela
            JOptionPane.INFORMATION_MESSAGE //mensagem informativa que gera um botao ok
        );
    }

    private void buttonConfirmaActionPerformed(ActionEvent e){
        int ret = JOptionPane.showConfirmDialog(//mensagem de confirmacao
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

    public static void main(String[] args){
        JOptionPaneExemplo janela = new JOptionPaneExemplo();        
    }
}