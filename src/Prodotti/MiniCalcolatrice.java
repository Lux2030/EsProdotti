package Es_progetto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniCalcolatrice extends JFrame {
	
	private JTextField numero1Field, numero2Field;
    private static JLabel risultatoLabel;
    
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("Mini Calcolatrice");
        Container mainContainer = mainWindow.getContentPane();
        mainContainer.setLayout(new GridLayout(3, 1));
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        JTextField Inserimentonumero1 = new JTextField(10);
        JTextField Inserimentonumero2 = new JTextField(10);
        inputPanel.add(new JLabel("Numero 1:"));
        inputPanel.add(Inserimentonumero1);
        inputPanel.add(new JLabel("Numero 2:"));
        inputPanel.add(Inserimentonumero2);
        mainContainer.add(inputPanel);

        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton calcoloSomma = new JButton("Calcola Somma");
        footer.add(calcoloSomma);
        JButton calcoloDifferenza = new JButton("Calcola Differenza");
        footer.add(calcoloDifferenza);
        JButton calcoloProdotto = new JButton("Calcola Prodotto");
        footer.add(calcoloProdotto);
        JButton calcoloQuoziente = new JButton("Calcola Quoziente");
        footer.add(calcoloQuoziente);
        mainContainer.add(footer);

        JPanel resultPanel = new JPanel();
        risultatoLabel = new JLabel("Risultato: ");
        resultPanel.add(risultatoLabel);
        mainContainer.add(resultPanel);
        
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainWindow.setSize(600, 350);
        mainWindow.setVisible(true);
        
    }
 }     

    

