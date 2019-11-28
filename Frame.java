import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame { //contido de opcao e subopcao
    
    private JMenuBar menuBar = new JMenuBar(); //a barra de menu
    
    private JMenu menuCadastrar = new JMenu("Cadastrar"); //opcoes
    private JMenuItem menuCadFunc = new JMenuItem("Funcionario"); //subopcoes
    private JMenuItem menuCadCli = new JMenuItem("Cliente"); //subopcoes
    private JMenuItem menuCadVenda = new JMenuItem("Venda"); //subopcoes
    private JMenuItem menuItemFechar = new JMenuItem("Fechar"); //subopcoes

    private JMenu menuConsultar = new JMenu("Consultar"); //opcoes
    private JMenuItem menuConsFunc = new JMenuItem("Funcionario"); //subopcoes
    private JMenuItem menuConsCli = new JMenuItem("Cliente"); //subopcoes
    

    public Frame() {

        menuCadastrar.add(menuCadFunc); //dentro do objeto de menu adicionei o objeto abrir
        menuCadastrar.add(menuCadCli);
        menuCadastrar.add(menuCadVenda);
        menuCadastrar.addSeparator();
        menuCadastrar.add(menuItemFechar);

        menuConsultar.add(menuConsFunc);
        menuConsultar.add(menuConsCli);
        
        menuBar.add(menuCadastrar);// no objeto barra de menu coomocou a opcao arquivo
        menuBar.add(menuConsultar);

        this.setJMenuBar(menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(310,200);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Frame janela = new Frame();
    }
}