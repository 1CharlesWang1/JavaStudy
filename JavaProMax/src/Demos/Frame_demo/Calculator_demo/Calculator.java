package Demos.Frame_demo.Calculator_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    // Create the text field for displaying the result
    private JTextField resultField;
    // Create the buttons for the numbers and operators
    private JButton[] buttons;
    // Create the operator buttons
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalButton;
    // Create the variable to store the first and second operands
    private double operand1, operand2;
    // Create the variable to store the operator
    private String operator;

    public Calculator() {
        // Set the title of the window
        super("Calculator");
        // Set the layout of the window
        setLayout(new BorderLayout());
        // Create the text field for displaying the result
        resultField = new JTextField(20);
        // Create the buttons for the numbers and operators
        buttons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
        }
        // Create the operator buttons
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalButton = new JButton("=");
        // Create the panel for the numbers
        JPanel numbersPanel = new JPanel();
        numbersPanel.setLayout(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            numbersPanel.add(buttons[i]);
        }
        numbersPanel.add(buttons[0]);
        // Create the panel for the operators
        JPanel operatorsPanel = new JPanel();
        operatorsPanel.setLayout(new GridLayout(5, 1));
        operatorsPanel.add(addButton);
        operatorsPanel.add(subtractButton);
        operatorsPanel.add(multiplyButton);
        operatorsPanel.add(divideButton);
        operatorsPanel.add(equalButton);
        // Add the number buttons and operator buttons to the window
        add(numbersPanel, BorderLayout.CENTER);
        add(operatorsPanel, BorderLayout.EAST);
        add(resultField, BorderLayout.NORTH);
        // Add the action listeners to the buttons
        for (int i = 0; i < 10; i++) {
            buttons[i].addActionListener(this);
        }
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalButton.addActionListener(this);
        // Set the size and location of the window
        setSize(250, 300);
        setLocation(400, 400);
        // Set the default close operation of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Set the window to be visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the source of the button that was clicked
        JButton button = (JButton) e.getSource();
        // Get the text of the button that was clicked
        String buttonText = button.getText();
        // Check if the button text is a number
        if (Character.isDigit(buttonText.charAt(0))) {
            // Append the number to the result field
            resultField.setText(resultField.getText() + buttonText);
        } else {
            // Check if the operator button was clicked
            switch (buttonText) {
                case "+":
                    // Store the first operand and the operator
                    operand1 = Double.parseDouble(resultField.getText());
                    operator = "+";
                    // Clear the result field
                    resultField.setText("");
                    break;
                case "-":
                    // Store the first operand and the operator
                    operand1 = Double.parseDouble(resultField.getText());
                    operator = "-";
                    // Clear the result field
                    resultField.setText("");
                    break;
                case "*":
                    // Store the first operand and the operator
                    operand1 = Double.parseDouble(resultField.getText());
                    operator = "*";
                    // Clear the result field
                    resultField.setText("");
                    break;
                case "/":
                    // Store the first operand and the operator
                    operand1 = Double.parseDouble(resultField.getText());
                    operator = "/";
                    // Clear the result field
                    resultField.setText("");
                    break;
                case "=":
                    // Store the second operand
                    operand2 = Double.parseDouble(resultField.getText());
                    // Perform the calculation based on the operator
                    switch (operator) {
                        case "+":
                            resultField.setText(String.valueOf(operand1 + operand2));
                            break;
                        case "-":
                            resultField.setText(String.valueOf(operand1 - operand2));
                            break;
                        case "*":
                            resultField.setText(String.valueOf(operand1 * operand2));
                            break;
                        case "/":
                            resultField.setText(String.valueOf(operand1 / operand2));
                            break;
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
