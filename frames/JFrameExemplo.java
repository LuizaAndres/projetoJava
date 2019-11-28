package frames;

import javax.swing.*;

public class JFrameExemplo {
    public static void main(String[] args){

        JFrame janela = new JFrame("Minha primeira janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pro botao x fechar, noa precisa mais
        janela.setSize(800,600); //tamanho da tela
        janela.setVisible(true);// tela visivel
        
    }
}