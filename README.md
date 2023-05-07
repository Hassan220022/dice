# Dice Roller

The Dice Roller is a Java program that allows users to simulate rolling one or more dice. The program has two versions: a command-line version and a graphical user interface (GUI) version.

## Command-line version

The command-line version of the Dice Roller allows users to input the number of dice they want to roll and displays the results of the roll in the console. The program uses the Java standard library's `Random` class to generate random numbers between 1 and 6 for each die roll.

### Usage

To use the command-line version of the Dice Roller, follow these steps:

1. Compile the `DiceRoller.java` file using a Java compiler such as `javac`:

   ```
   javac DiceRoller.java
   ```

2. Run the compiled `DiceRoller` class using the Java Virtual Machine (JVM):

   ```
   java DiceRoller
   ```

3. Input the number of dice you want to roll when prompted by the program. The program will display the result of each roll in the console.

## GUI version

The GUI version of the Dice Roller provides a graphical user interface for users to input the number of dice they want to roll and displays the results of the roll in a label on the screen. The program uses Java's Swing library to create the GUI components and the `Random` class to generate the random numbers for each die roll.

### Usage

To use the GUI version of the Dice Roller, follow these steps:

1. Compile the `DiceRollerGUI.java` file using a Java compiler such as `javac`:

   ```
   javac DiceRollerGUI.java
   ```

2. Run the compiled `DiceRollerGUI` class using the Java Virtual Machine (JVM):

   ```
   java DiceRollerGUI
   ```

3. Input the number of dice you want to roll into the text field provided in the GUI.

4. Click the "Roll the dice!" button to initiate the roll. The program will display the result of each roll in the label below the button.

## License

The Dice Roller is released under the [MIT License](https://opensource.org/licenses/MIT).
