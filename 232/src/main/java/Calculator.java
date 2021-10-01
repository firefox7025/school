import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Calculator {
    private JFrame calcFrame;
    private JPanel calcContentPane;
    private JLabel lblDisplay;
    private JButton cmdClr;
    private JButton cmdAdd;
    private JButton cmdSub;
    private JButton cmdMul;
    private JButton cmdDiv;
    private JButton cmdEqual;
    private JButton cmdOne;
    private JButton cmdTwo;
    private JButton cmdThree;
    private JButton cmdFour;
    private JButton cmdFive;
    private JButton cmdSix;
    private JButton cmdSeven;
    private JButton cmdEight;
    private JButton cmdNine;
    private JButton cmdZero;

    public Calculator() {
        buildGUI();
    }

    public static void main(String[] args) {
        Calculator simpleCalc = new Calculator();
    }

    private void buildGUI() {
        calcFrame = new JFrame("Simple Calculator");
        calcFrame.setBounds(200, 200, 486, 564);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcContentPane = new JPanel(new GridBagLayout());
        calcContentPane.setBounds(34, 37, 387, 470);
        calcFrame.setContentPane(calcContentPane);

        ButtonClickListener btnClickListener = new ButtonClickListener();

        lblDisplay = new JLabel("0", JLabel.RIGHT);
        lblDisplay.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblDisplay.setFont(new Font("Serif", Font.BOLD, 34));

        GridBagConstraints c1 = new GridBagConstraints();
        c1.weightx = .25;
        c1.weighty = .15;
        c1.gridx = 0;
        c1.gridy = 0;
        c1.gridwidth = 4;
        c1.insets = new Insets(10, 10, 10, 10);
        c1.fill = GridBagConstraints.BOTH;
        calcContentPane.add(lblDisplay, c1);

        GridBagConstraints c2 = new GridBagConstraints();
        cmdClr = new JButton("CLR");
        cmdClr.setMargin(new Insets(-10, -10, -10, -10));
        cmdClr.setFont(new Font("Serif", Font.BOLD, 34));
        cmdClr.setActionCommand("Clr");
        cmdClr.addActionListener(btnClickListener);
        c2.weightx = .25;
        c2.weighty = .15;
        c2.gridx = 0;
        c2.gridy = 0;
        c2.gridwidth = 3;
        c2.insets = new Insets(10, 10, 10, 10);
        c2.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdClr, c2);

        GridBagConstraints c3 = new GridBagConstraints();
        cmdAdd = new JButton("+");
        cmdAdd.setMargin(new Insets(-10, -10, -10, -10));
        cmdAdd.setFont(new Font("Serif", Font.BOLD, 34));
        cmdAdd.setActionCommand("Add");
        cmdAdd.addActionListener(btnClickListener);
        c3.weightx = .25;
        c3.weighty = .15;
        c3.gridx = 3;
        c3.gridy = 1;
        c3.gridwidth = 1;
        c3.insets = new Insets(10, 10, 10, 10);
        c3.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdAdd, c3);

        GridBagConstraints c4 = new GridBagConstraints();
        cmdOne = new JButton("1");
        cmdOne.setMargin(new Insets(-10, -10, -10, -10));
        cmdOne.setFont(new Font("Serif", Font.BOLD, 34));
        cmdOne.setActionCommand("One");
        cmdOne.addActionListener(btnClickListener);
        c4.weightx = .25;
        c4.weighty = .15;
        c4.gridx = 0;
        c4.gridy = 2;
        c4.gridwidth = 1;
        c4.insets = new Insets(10, 10, 10, 10);
        c4.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdOne, c4);

        GridBagConstraints c5 = new GridBagConstraints();
        cmdTwo = new JButton("2");
        cmdTwo.setMargin(new Insets(-10, -10, -10, -10));
        cmdTwo.setFont(new Font("Serif", Font.BOLD, 34));
        cmdTwo.setActionCommand("Two");
        cmdTwo.addActionListener(btnClickListener);
        c5.weightx = .25;
        c5.weighty = .15;
        c5.gridx = 1;
        c5.gridy = 2;
        c5.gridwidth = 1;
        c5.insets = new Insets(10, 10, 10, 10);
        c5.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdTwo, c5);

        GridBagConstraints c6 = new GridBagConstraints();
        cmdThree = new JButton("3");
        cmdThree.setMargin(new Insets(-10, -10, -10, -10));
        cmdThree.setFont(new Font("Serif", Font.BOLD, 34));
        cmdThree.setActionCommand("Three");
        cmdThree.addActionListener(btnClickListener);
        c6.weightx = .25;
        c6.weighty = .15;
        c6.gridx = 2;
        c6.gridy = 2;
        c6.gridwidth = 1;
        c6.insets = new Insets(10, 10, 10, 10);
        c6.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdThree, c6);

        GridBagConstraints c7 = new GridBagConstraints();
        cmdSub = new JButton("-");
        cmdSub.setMargin(new Insets(-10, -10, -10, -10));
        cmdSub.setFont(new Font("Serif", Font.BOLD, 34));
        cmdSub.setActionCommand("Sub");
        cmdSub.addActionListener(btnClickListener);
        c7.weightx = .25;
        c7.weighty = .15;
        c7.gridx = 3;
        c7.gridy = 2;
        c7.gridwidth = 1;
        c7.insets = new Insets(10, 10, 10, 10);
        c7.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdSub, c7);

        GridBagConstraints c8 = new GridBagConstraints();
        cmdFour = new JButton("4");
        cmdFour.setMargin(new Insets(-10, -10, -10, -10));
        cmdFour.setFont(new Font("Serif", Font.BOLD, 34));
        cmdFour.setActionCommand("Four");
        cmdFour.addActionListener(btnClickListener);
        c8.weightx = .25;
        c8.weighty = .15;
        c8.gridx = 0;
        c8.gridy = 3;
        c8.gridwidth = 1;
        c8.insets = new Insets(10, 10, 10, 10);
        c8.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdFour, c8);

        GridBagConstraints c9 = new GridBagConstraints();
        cmdFive = new JButton("5");
        cmdFive.setMargin(new Insets(-10, -10, -10, -10));
        cmdFive.setFont(new Font("Serif", Font.BOLD, 34));
        cmdFive.setActionCommand("Five");
        cmdFive.addActionListener(btnClickListener);
        c9.weightx = .25;
        c9.weighty = .15;
        c9.gridx = 1;
        c9.gridy = 3;
        c9.gridwidth = 1;
        c9.insets = new Insets(10, 10, 10, 10);
        c9.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdFive, c9);

        GridBagConstraints c10 = new GridBagConstraints();
        cmdSix = new JButton("6");
        cmdSix.setMargin(new Insets(-10, -10, -10, -10));
        cmdSix.setFont(new Font("Serif", Font.BOLD, 34));
        cmdSix.setActionCommand("Six");
        cmdSix.addActionListener(btnClickListener);
        c10.weightx = .25;
        c10.weighty = .15;
        c10.gridx = 2;
        c10.gridy = 3;
        c10.gridwidth = 1;
        c10.insets = new Insets(10, 10, 10, 10);
        c10.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdSix, c10);

        GridBagConstraints c11 = new GridBagConstraints();
        cmdMul = new JButton("*");
        cmdMul.setMargin(new Insets(-10, -10, -10, -10));
        cmdMul.setFont(new Font("Serif", Font.BOLD, 34));
        cmdMul.setActionCommand("Mul");
        cmdMul.addActionListener(btnClickListener);
        c11.weightx = .25;
        c11.weighty = .15;
        c11.gridx = 3;
        c11.gridy = 3;
        c11.gridwidth = 1;
        c11.insets = new Insets(10, 10, 10, 10);
        c11.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdMul, c11);

        GridBagConstraints c12 = new GridBagConstraints();
        cmdSeven = new JButton("7");
        cmdSeven.setMargin(new Insets(-10, -10, -10, -10));
        cmdSeven.setFont(new Font("Serif", Font.BOLD, 34));
        cmdSeven.setActionCommand("Seven");
        cmdSeven.addActionListener(btnClickListener);
        c12.weightx = .25;
        c12.weighty = .15;
        c12.gridx = 0;
        c12.gridy = 4;
        c12.gridwidth = 1;
        c12.insets = new Insets(10, 10, 10, 10);
        c12.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdSeven, c12);

        GridBagConstraints c13 = new GridBagConstraints();
        cmdEight = new JButton("8");
        cmdEight.setMargin(new Insets(-10, -10, -10, -10));
        cmdEight.setFont(new Font("Serif", Font.BOLD, 34));
        cmdEight.setActionCommand("Eight");
        cmdEight.addActionListener(btnClickListener);
        c13.weightx = .25;
        c13.weighty = .15;
        c13.gridx = 1;
        c13.gridy = 4;
        c13.gridwidth = 1;
        c13.insets = new Insets(10, 10, 10, 10);
        c13.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdEight, c13);

        GridBagConstraints c14 = new GridBagConstraints();
        cmdNine = new JButton("9");
        cmdNine.setMargin(new Insets(-10, -10, -10, -10));
        cmdNine.setFont(new Font("Serif", Font.BOLD, 34));
        cmdNine.setActionCommand("Nine");
        cmdNine.addActionListener(btnClickListener);
        c14.weightx = .25;
        c14.weighty = .15;
        c14.gridx = 2;
        c14.gridy = 4;
        c14.gridwidth = 1;
        c14.insets = new Insets(10, 10, 10, 10);
        c14.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdNine, c14);

        GridBagConstraints c15 = new GridBagConstraints();
        cmdDiv = new JButton("/");
        cmdDiv.setMargin(new Insets(-10, -10, -10, -10));
        cmdDiv.setFont(new Font("Serif", Font.BOLD, 34));
        cmdDiv.setActionCommand("Div");
        cmdDiv.addActionListener(btnClickListener);
        c15.weightx = .25;
        c15.weighty = .15;
        c15.gridx = 3;
        c15.gridy = 4;
        c15.gridwidth = 1;
        c15.insets = new Insets(10, 10, 10, 10);
        c15.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdDiv, c15);

        GridBagConstraints c16 = new GridBagConstraints();
        cmdZero = new JButton("0");
        cmdZero.setMargin(new Insets(-10, -10, -10, -10));
        cmdZero.setFont(new Font("Serif", Font.BOLD, 34));
        cmdZero.setActionCommand("Zero");
        cmdZero.addActionListener(btnClickListener);
        c16.weightx = .25;
        c16.weighty = .15;
        c16.gridx = 0;
        c16.gridy = 5;
        c16.gridwidth = 1;
        c16.insets = new Insets(10, 10, 10, 10);
        c16.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdZero, c16);

        GridBagConstraints c17 = new GridBagConstraints();
        cmdEqual = new JButton("=");
        cmdEqual.setMargin(new Insets(-10, -10, -10, -10));
        cmdEqual.setFont(new Font("Serif", Font.BOLD, 34));
        cmdEqual.setActionCommand("Equal");
        cmdEqual.addActionListener(btnClickListener);
        c17.weightx = .25;
        c17.weighty = .15;
        c17.gridx = 1;
        c17.gridy = 5;
        c17.gridwidth = 3;
        c17.insets = new Insets(10, 10, 10, 10);
        c17.fill = GridBagConstraints.BOTH;
        calcContentPane.add(cmdEqual, c17);

        calcFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {

        private int total = 0;
        private char previousOperation = ' ';
        private int plusClicked = 0;
        private int minusClicked = 0;
        private int multiplyClicked = 0;
        private int divideClicked = 0;
        private int equalClicked = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "One":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "1");
                    break;
                case "Two":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "2");
                    break;
                case "Three":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "3");
                    break;
                case "Four":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "4");
                    break;
                case "Five":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "5");
                    break;
                case "Six":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "6");
                    break;
                case "Seven":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "7");
                    break;
                case "Eight":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "8");
                    break;
                case "Nine":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "9");
                    break;
                case "Zero":
                    digitPrep();
                    lblDisplay.setText(lblDisplay.getText() + "0");
                    break;
                case "Add":
                    plusClicked = 1;
                    calculate();
                    break;
                case "Sub":
                    minusClicked = 1;
                    calculate();
                    break;
                case "Mul":
                    multiplyClicked = 1;
                    calculate();
                    break;
                case "Div":
                    divideClicked = 1;
                    calculate();
                    break;
                case "Clr":
                    lblDisplay.setText("0");
                    total = 0;
                    previousOperation = ' ';
                    plusClicked = 0;
                    minusClicked = 0;
                    multiplyClicked = 0;
                    divideClicked = 0;
                    break;
                case "Equal":
                    equalClicked = 1;
                    calculate();
                    break;
            }
        }

        public void digitPrep() {
            if (Objects.equals(lblDisplay.getText(), "0")) {
                lblDisplay.setText("");
            }
        }

        public void calculate() {
            if (previousOperation == ' ') {
                total = Integer.parseInt(lblDisplay.getText());
                lblDisplay.setText("0");
            } else {
                if (previousOperation == '+') {
                    total = total + Integer.parseInt(lblDisplay.getText());
                    lblDisplay.setText("0");
                }
                if (previousOperation == '-') {
                    total = total - Integer.parseInt(lblDisplay.getText());
                    lblDisplay.setText("0");
                }
                if (previousOperation == '*') {
                    total = total * Integer.parseInt(lblDisplay.getText());
                    lblDisplay.setText("0");
                }
                if (previousOperation == '/') {
                    total = total / Integer.parseInt(lblDisplay.getText());
                    lblDisplay.setText("0");
                }
            }
            if (plusClicked == 1) {
                previousOperation = '+';
                plusClicked = 0;
            }
            else if (minusClicked == 1) {
                previousOperation = '-';
                minusClicked = 0;
            }
            else if (multiplyClicked == 1) {
                previousOperation = '*';
                multiplyClicked = 0;
            }
            else if (divideClicked == 1) {
                previousOperation = '/';
                divideClicked = 0;
            }
            else {
                previousOperation = ' ';
                equalClicked = 0;
                lblDisplay.setText(Integer.toString(total));
            }
        }
    }

}
