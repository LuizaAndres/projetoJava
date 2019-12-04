import java.awt.*;
import java.util.Map;
import java.util.HashMap;
import javax.swing.*;

public class TelaConsultarDivida extends JFrame {
//criando objetos
    JTextArea textArea1 = new JTextArea(15,30);
    JScrollPane scrollPane = new JScrollPane(textArea1);

    public TelaConsultarDivida() {
//tela e objetos
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
            pessoas=dao.getDividas(dao, pessoas);
//duvida aqui
        for(Pessoas pessoa:pessoas.values()){
            pane.add(pessoa.getNome());
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args){
        new TelaConsultarDivida();
    }
}