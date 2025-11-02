import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class example3 implements ActionListener {

    private JFrame mainFrame;
    private JMenuBar menuBar;
    private JMenu file, edit, help;
    private JPanel leftPanel, rightTopPanel, rightBottomPanel;

    public static void main(String[] args) {
        new example3();
    }

    public example3() {
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Mx. Bradford learning swing");
        mainFrame.setSize(1000, 700);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- MENU BAR ---
        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        mainFrame.setJMenuBar(menuBar);

        // --- LEFT GRID PANEL ---
        leftPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        String[] labels = {"Top 0", "Top 1", "Top 0", "Top 2", "Top 0", "Top 3", "Top 0", "Top 4", "Top 0"};
        for (String text : labels) {
            leftPanel.add(new JButton(text));
        }

        // --- RIGHT SIDE (TOP + BOTTOM) ---
        rightTopPanel = new JPanel(new BorderLayout());
        rightTopPanel.add(new JLabel("TopRight", SwingConstants.CENTER), BorderLayout.CENTER);

        rightBottomPanel = new JPanel(new BorderLayout());
        rightBottomPanel.add(new JLabel("1", SwingConstants.CENTER), BorderLayout.CENTER);

        JSplitPane rightSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, rightTopPanel, rightBottomPanel);
        rightSplit.setResizeWeight(0.5);

        // --- MAIN SPLIT (LEFT + RIGHT) ---
        JSplitPane mainSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightSplit);
        mainSplit.setResizeWeight(0.5);

        mainFrame.add(mainSplit, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // No actions yet
    }
}
