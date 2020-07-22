import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class MainMenu extends JFrame {
    private JRadioButton l3tViewerButton;
    private JRadioButton drawScrambleButton;
    private JPanel panel;
    private JLabel scrambleLabel;
    private JTextArea scrambleTextBox;
    private JLabel saveLabel;
    private JTextField fileNameTextBox;
    private JButton saveButton;
    private JLabel svgEndingLabel;
    private FTO fto;


    public MainMenu() {
        super();
        setContentPane(panel);
        scrambleTextBox.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    String a = e.getDocument().getText(0, e.getDocument().getLength());
                    fto = new FTO();
                    fto.doMoves(a);
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try {
                    String a = e.getDocument().getText(0, e.getDocument().getLength());
                    fto = new FTO();
                    if(!a.equals("")) {
                        fto.doMoves(a);
                    }
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try {
                    String a = e.getDocument().getText(0, e.getDocument().getLength());
                    fto = new FTO();
                    fto.doMoves(a);
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter myWriter = new FileWriter(fileNameTextBox.getText() + ".svg");
                    if(drawScrambleButton.isSelected()){
                        myWriter.write(Main.drawScramble(fto.getState()));
                    }
                    else {
                        myWriter.write(Main.getSVG(fto.getState()));
                    }
                    myWriter.close();
                    System.out.println("Success!");
                } catch (IOException ex) {
                    System.out.println("An error occurred.");
                    ex.printStackTrace();
                }
            }
        });
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
