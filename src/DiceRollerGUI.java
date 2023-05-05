import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceRollerGUI extends JFrame implements ActionListener {
    private JLabel numberOfDiceLabel;
    private JLabel resultLabel;
    private JTextField numberOfDiceTextField;
    private JButton rollButton;

    public DiceRollerGUI() {
        super("Dice Roller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(new FlowLayout());

        numberOfDiceLabel = new JLabel("Number of dice to roll:");
        contentPane.add(numberOfDiceLabel);

        numberOfDiceTextField = new JTextField(5);
        contentPane.add(numberOfDiceTextField);

        rollButton = new JButton("Roll the dice!");
        rollButton.addActionListener(this);
        contentPane.add(rollButton);

        resultLabel = new JLabel("Result: ");
        contentPane.add(resultLabel);

        setContentPane(contentPane);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int numberOfDice = Integer.parseInt(numberOfDiceTextField.getText());
        Random random = new Random();

        StringBuilder result = new StringBuilder("Result: ");

        for (int i = 0; i < numberOfDice; i++) {
            int diceRoll = random.nextInt(6) + 1;
            result.append(diceRoll).append(" ");
        }

        resultLabel.setText(result.toString());
    }

    public static void main(String[] args) {
        new DiceRollerGUI();
    }
}
