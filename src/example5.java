import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class example5 implements ActionListener {

    private JFrame mainFrame;
    private JMenuBar menuBar;
    private JMenu file, edit, help;

    public static void main(String[] args) {
        new example5();
    }

    public example5() {
        prepareGUI();
    }

    private void prepareGUI() {

        mainFrame = new JFrame("Mx. Bradford learning swing");
        mainFrame.setSize(1000, 700);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());


        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        mainFrame.setJMenuBar(menuBar);


        JPanel leftGrid = new JPanel(new GridLayout(3, 3, 5, 5));
        String[] labels = {
                "Top 0", "Top 1", "Top 0",
                "Top 2", "Top 0", "Top 3",
                "Top 0", "Top 4", "Top 0"
        };
        for (String text : labels) {
            leftGrid.add(new JButton(text));
        }


        JPanel rightPanel = new JPanel(new BorderLayout());
        JLabel topRight = new JLabel("TopRight", SwingConstants.CENTER);
        JLabel bottomRight = new JLabel("1", SwingConstants.CENTER);
        topRight.setFont(new Font("Arial", Font.BOLD, 20));
        bottomRight.setFont(new Font("Arial", Font.BOLD, 20));

        rightPanel.add(topRight, BorderLayout.CENTER);
        rightPanel.add(bottomRight, BorderLayout.SOUTH);


        mainFrame.add(leftGrid, BorderLayout.WEST);
        mainFrame.add(rightPanel, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
