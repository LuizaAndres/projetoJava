import java.awt.*;
import javax.swing.*;

public class TelaConsultarDivida extends JFrame {

    JTextArea textArea1 = new JTextArea(15,30);
    JScrollPane scrollPane = new JScrollPane(textArea1);

    public TelaConsultarDivida() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        textArea1.setLineWrap(true);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        pane.add(scrollPane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,320);
        this.setVisible(true);
    }

    public static void main(String[] args){
        TelaConsultarDivida janela = new TelaConsultarDivida();
    }
}