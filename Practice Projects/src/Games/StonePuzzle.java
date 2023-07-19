package Games;

import javax.swing.*;

public class StonePuzzle {

    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setSize(514, 595);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setTitle("StonePuzzle Games");
        jf.setAlwaysOnTop(true);
        jf.setLocationRelativeTo(null);

        jf.setLayout(null);
        JLabel jl = new JLabel(new ImageIcon());
        jf.setVisible(true);
    }
}
