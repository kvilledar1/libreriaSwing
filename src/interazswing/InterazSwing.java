/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interazswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



/**
 *
 * @author Alfredo Villeda
 */
public class InterazSwing {

    public static void main(String[] args) {
    
        JFrame frame = new JFrame("KIM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

    
        JLabel label = new JLabel("Nombre:");
        frame.add(label);

        
        JTextField textField = new JTextField(100);
        frame.add(textField);

       
        JButton button = new JButton("Aceptar");
        frame.add(button);

        
        button.addActionListener((ActionEvent e) -> {
            String inputText = textField.getText();
            JOptionPane.showMessageDialog(frame, "Texto ingresado: " + inputText);
        });

        
        JCheckBox checkBox = new JCheckBox("seleccione la opcion");
        frame.add(checkBox);

        
        JRadioButton radioButton1 = new JRadioButton("IPHONE");
        JRadioButton radioButton2 = new JRadioButton("SAMSUNG ");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);

        
        String[] options = {"IPHONE", "SAMSUNG2", "HUAWEI"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        
        String[] items = {"RESULTADO 1 ", "RESULTADO 2", "RESULTADO 3"};
        JList<String> list = new JList<>(items);
        frame.add(list);

        
        frame.pack();
        frame.setVisible(true);
    }
    
}
