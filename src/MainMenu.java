import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;


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
    private JLabel scrambleImageLabel;
    private FTO fto;


    public MainMenu() {
        super();
        setContentPane(panel);
        drawScrambleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liveUpdate();
            }
        });
        l3tViewerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liveUpdate();
            }
        });
        liveUpdate();
        scrambleTextBox.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                liveUpdate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                liveUpdate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                liveUpdate();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeFile("" + fileNameTextBox.getText());
            }
        });
        pack();
        setSize(400,700);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void makeFile(String path){
        try {
            FileWriter myWriter = new FileWriter(path + ".svg");
            if(drawScrambleButton.isSelected()){
                String a = scrambleTextBox.getText();
                fto = new FTO();
                if(!a.equals("")) {
                    fto.doMoves(a);
                }
                myWriter.write(Main.drawScramble(fto.getState()));
            }
            else {
                String a = scrambleTextBox.getText();
                fto = new FTO();
                fto.doMoves(a);
                myWriter.write(Main.getSVG(fto.getState()));
            }
            myWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void liveUpdate(){
        try {
            String a = scrambleTextBox.getText();
            fto = new FTO();
            if(!a.equals("")) {
                fto.doMoves(a);

            }
            makeFile("liveImages/liveImage");
            String svgInput = Paths.get("liveImages/liveImage.svg").toUri().toURL().toString();
            TranscoderInput transcoderInput = new TranscoderInput(svgInput);
            OutputStream outputStream = new FileOutputStream("liveImages/liveImage.png");
            TranscoderOutput transcoderOutput = new TranscoderOutput(outputStream);
            PNGTranscoder pngTranscoder = new PNGTranscoder();
            pngTranscoder.transcode(transcoderInput, transcoderOutput);
            outputStream.flush();
            outputStream.close();

            ImageIcon icon = new ImageIcon("liveImages/liveImage.png");
            icon.getImage().flush();
            scrambleImageLabel.setIcon(icon);
        } catch (IOException | TranscoderException ex) {
            ex.printStackTrace();
        }
    }
}
