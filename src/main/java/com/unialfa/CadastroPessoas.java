package com.unialfa;

public class CadastroPessoas extends Jframe {

    private JTextField campoNome;
    private JButton botao;

    public CadastroPessoas(){
        setTitle("Cadastro de Pessoa");
        setSize(500, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        var painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets= new Insets= (5, 5, 5, 5);

        var labelNome = new JLabel("Nome:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        painel.add(labelNome, constraints);

        campoNome = new JTextField();
        constraints.gridx = 0;
        constraints.gridy = 1;
        painel.add(campoNome, constraints);

        botao = new JButton("Salvar");
        botao.addActionListener(e -> executarAcaoBotao());
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        painel.add(botao, constraints);

        add(painel);
        setLocationRelativeTo(null);
    }

    private void executarAcaoBotao(){
        JOptionPane.showMessageDialog(this, campoNome.getText() + "Salvo com Sucesso!");
    }
}
