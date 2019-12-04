//arquivo pronto
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class TelaCadastrarPessoa extends JFrame {
    // criando objetos da tela
    private JLabel labelCadPess;
    private JLabel labelNome;
    // criar pular linha
    private JTextField textNome;
    private JLabel labelEmail;
    private JTextField textEmail;
    private JButton gravar;

    public TelaCadastrarPessoa() {
        // dando caracteristica pras coisas da tela
        labelCadPess = new JLabel("Cadastrar Pessoa\n");
        // pular linha
        labelNome = new JLabel("Nome");
        textNome = new JTextField(20);
        labelEmail = new JLabel("E-mail");
        textEmail = new JTextField(20);
        gravar = new JButton("Gravar");
        // criando container da tela e suas caracteristicas e os sobjetos que vão em
        // tela
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        pane.add(labelCadPess);
        // inserir algo que faz pular linha
        pane.add(labelNome);
        pane.add(textNome);
        pane.add(labelEmail);
        pane.add(textEmail);
        pane.add(gravar);

        gravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                handleAction();
            }

        });
        // caracteristicas da tela
        this.setSize(250, 250);
        this.setVisible(true);
    }

    public void handleAction() {
        DAO dao = new DAO();

        Object[] objects = { textNome.getText(), textEmail.getText() };
        try {
            dao.insert("INSERT INTO pessoas (nome,email) VALUES (?,?)", objects);
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!","OK!",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args){
        new TelaCadastrarPessoa();
    }
}