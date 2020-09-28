package ru.mirea.inbo0519.zverev.pr4;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    protected int scoreA=0, scoreB=0;

    public Game(){
        super("That's your game!");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(640, 480);
        setLayout(null);

        JButton button1 = new JButton("AC Milan");
        button1.setBounds(50, 120, 130, 50);
        button1.setActionCommand("pressed1");

        add(button1);
        JButton button2 = new JButton("Real Madrid");
        button2.setBounds(430, 120, 130, 50);
        button2.setActionCommand("pressed2");
        add(button2);

        JLabel score = new JLabel("Result: "+String.valueOf(scoreA)+" X "+String.valueOf(scoreB));
        score.setBounds(240, 30, 150, 50);
        score.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.CYAN, 4, true),
                BorderFactory.createEmptyBorder(20, 30, 20, 20)));
        add(score);

        JLabel lastscorer = new JLabel("Last Scorer: N/A");
        lastscorer.setBounds(200, 120, 220, 50);
        lastscorer.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.RED, 4, true),
                BorderFactory.createEmptyBorder(20, 30, 20, 20)));
        add(lastscorer);

        Label winner = new Label("Winner: DRAW");
        winner.setBounds(260, 300, 150, 50);
        add(winner);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreA++;
                score.setText("Result: "+String.valueOf(scoreA)+" X "+String.valueOf(scoreB));
                lastscorer.setText("Last Scorer: AC Milan");
                if (scoreA>scoreB)
                    winner.setText("Winner: AC Milan");
                else
                    winner.setText("Winner: Real Madrid");
                if (scoreA==scoreB)
                    winner.setText("Winner: DRAW");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreB++;
                score.setText("Result: "+String.valueOf(scoreA)+" X "+String.valueOf(scoreB));
                lastscorer.setText("Last Scorer: Real Madrid");
                if (scoreA>scoreB)
                    winner.setText("Winner: AC Milan");
                else
                    winner.setText("Winner: Real Madrid");
                if (scoreA==scoreB)
                    winner.setText("Winner: DRAW");
            }
        });

        setVisible(true);
    }
}

