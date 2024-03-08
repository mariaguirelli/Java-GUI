package com.unialfa;

public class App {

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame tela = new CadastroPessoas();
            tela.setVisible(true);

        }
    }
}
