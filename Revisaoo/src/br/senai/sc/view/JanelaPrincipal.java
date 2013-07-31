package br.senai.sc.view;

import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação
 * @version 1.0 31/07/13
 * @author larissa_mezari
 */
public class JanelaPrincipal {
    public void mostraMenu (int opcao){
        int opcao = 0;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showImputDialog("informe a opção:"
                    + "\n1 - Funcionário" 
                    + "\n2 - Cliente"
                    + "\n3 - Fornecedor"
                    + "\n4 - Transportadora"
                    + "\n5 - Sair"));
        }
        
        switch (opcao){
            case 1: 
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "opcao inexistente" );
        }
    }
}
