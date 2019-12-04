//funciona

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class TelaCadastrarDivida extends JFrame {
//criando objetos
    JLabel labelPessoa = new JLabel("Pessoa");
    JComboBox<String> comboPessoa = new JComboBox<>();
    JLabel labelAno = new JLabel("Ano");
    JLabel labelMes = new JLabel ("Mês");
    JLabel labelValor = new JLabel("Valor");
    JLabel labelDesconto = new JLabel("Desconto");
    JTextField textAno = new JTextField(5);
    JTextField textValor = new JTextField(10);
    JComboBox comboMes = new JComboBox();
    JTextField textDesconto = new JTextField(10);
    JButton botaoGravar = new JButton("GRAVAR");

    public TelaCadastrarDivida() {
//criando tela e caracteristicas adicionando objetos na tela
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        pane.add(labelPessoa);
        pane.add(comboPessoa);
        pane.add(labelAno);
        pane.add(textAno);
        pane.add(comboMes);
        pane.add(labelValor);
        pane.add(textValor);
        pane.add(labelDesconto);
        pane.add(textDesconto);
        pane.add(botaoGravar);
//opcoes combomes
        comboMes.addItem("Janeiro");
        comboMes.addItem("Fevereiro");
        comboMes.addItem("Março");
        comboMes.addItem("Abril");
        comboMes.addItem("Maio");
        comboMes.addItem("Junho");
        comboMes.addItem("Julho");
        comboMes.addItem("Agosto");
        comboMes.addItem("Setembro");
        comboMes.addItem("Outubro");
        comboMes.addItem("Novembro");
        comboMes.addItem("Dezembro");
//select das pessoas
        Map<Integer,Pessoas>pessoas = new HashMap<>();
        DAO dao = new DAO();
        try {
            pessoas=dao.getPessoas(dao, pessoas);
        for(Pessoas pessoa:pessoas.values()){
            comboPessoa.addItem(pessoa.getId()+"");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        botaoGravar.addActionListener(new ActionListener(){

        @Override
			public void actionPerformed(ActionEvent e) {
				handleAction();				
			}
        });
        this.setSize(360,180);
        this.setVisible(true);
    }

    public void handleAction() {
        DAO dao = new DAO();

    Object[] objects = { textAno.getText(), comboMes.getSelectedIndex(), textValor.getText(), textDesconto.getText(),comboPessoa.getSelectedItem().toString()};
    try {
        dao.insert("INSERT INTO dividas (ano,mes,valor,percentual_desconto,pessoas_id) VALUES (?,?,?,?,?)", objects);
        JOptionPane.showMessageDialog(null, "Divida cadastrada com sucesso!","OK!",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
    }
}

    public static void main(String[] args) {
        new TelaCadastrarDivida();
    }
}