import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    String title = "dice app";
    Random random = new Random();
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    int randomNum2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    String message = String.format("dices 1 = $d \n dices 2 = $d ", randomNum1, randomNum2);
    JFrame frame = null;
    int messageOption = JOptionPane.INFORMATION_MESSAGE;

    void start() {
        JOptionPane.showMessageDialog(frame, message, title, messageOption);
    }

    public static void main(String[] args) {
        new App().start();
    }

}