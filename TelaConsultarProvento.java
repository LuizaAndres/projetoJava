import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

public class TelaConsultarProvento extends JFrame {
//criando Objetos
    JTextArea textArea1 = new JTextArea(15,30);
    JScrollPane scrollPane = new JScrollPane(textArea1);

    public TelaConsultarProvento() {
//tela e objetos
        String text = "";
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        textArea1.setLineWrap(true);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pane.add(scrollPane);
//caracteristicas da tela
        this.setSize(360,320);
        this.setVisible(true);
// consultar DAO pessoas        
        Map<Integer,Pessoas>pessoas = new HashMap<>();
        DAO dao = new DAO();
        try {
            pessoas=dao.getPessoas(dao, pessoas);

        for(Pessoas pessoa:pessoas.values()){
            text += pessoa.getNome()+"\n";
            System.out.println("aqui"+pessoa.getDividas().toString());
//duvida aqui
            pessoas=dao.getDividas(dao, pessoas);
            for(Dividas divida : pessoa.getDividas()){
                System.out.println("asdgbsa");
                text += divida.toString()+"\n";
            }
            
        }
        textArea1.setText(text);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }

    public static void main(String[] args){
        new TelaConsultarProvento();
    }
}