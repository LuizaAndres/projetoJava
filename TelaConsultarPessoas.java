//linha 28
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class TelaConsultarPessoas extends JFrame {

    
    public TelaConsultarPessoas() {
String nome="";
        Container pane = this.getContentPane();
// cria um mapa que vai armazenar os obj de pessoas       
        Map<Integer,Pessoas>pessoas = new HashMap<>();
//acessa o BD
        DAO dao = new DAO();
        try {
//pega as instancias de pessoas do bd
            pessoas=dao.getPessoas(dao, pessoas);
//copia os valores pra vairiavel nome
        for(Pessoas pessoa:pessoas.values()){
            nome += pessoa.getNome()+"\n";
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        JTextArea textArea1 = new JTextArea(15,30);
//imprime tudo o que ta na var nome
        textArea1.setText(nome);
        JScrollPane scrollPane = new JScrollPane(textArea1);
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        textArea1.setLineWrap(true);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pane.add(scrollPane);
        this.setSize(360,320);
        this.setVisible(true);

    }

    public static void main(String[] args){
        TelaConsultarPessoas janela = new TelaConsultarPessoas();
    }
}