import javax.imageio.ImageIO;
import javax.imageio.ImageTranscoder;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
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
                    makeFile("liveImages/test");

                    String svg_URI_input = Paths.get("liveImages/test.svg").toUri().toURL().toString();
                    TranscoderInput input_svg_image = new TranscoderInput(svg_URI_input);
                    OutputStream png_ostream = new FileOutputStream("test.png");
                    TranscoderOutput output_png_image = new TranscoderOutput(png_ostream);
                    PNGTranscoder my_converter = new PNGTranscoder();
                    my_converter.transcode(input_svg_image, output_png_image);
                    png_ostream.flush();
                    png_ostream.close();

                } catch (BadLocationException | IOException | TranscoderException ex) {
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
                        makeFile("liveImages/test");


                        String svg_URI_input = Paths.get("liveImages/test.svg").toUri().toURL().toString();
                        TranscoderInput input_svg_image = new TranscoderInput(svg_URI_input);
                        OutputStream png_ostream = new FileOutputStream("test.png");
                        TranscoderOutput output_png_image = new TranscoderOutput(png_ostream);
                        PNGTranscoder my_converter = new PNGTranscoder();
                        my_converter.transcode(input_svg_image, output_png_image);
                        png_ostream.flush();
                        png_ostream.close();
                    }
                } catch (BadLocationException | IOException | TranscoderException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try {
                    String a = e.getDocument().getText(0, e.getDocument().getLength());
                    fto = new FTO();
                    fto.doMoves(a);
                    makeFile("liveImages/test");


                    String svg_URI_input = Paths.get("liveImages/test.svg").toUri().toURL().toString();
                    TranscoderInput input_svg_image = new TranscoderInput(svg_URI_input);
                    OutputStream png_ostream = new FileOutputStream("test.png");
                    TranscoderOutput output_png_image = new TranscoderOutput(png_ostream);
                    PNGTranscoder my_converter = new PNGTranscoder();
                    my_converter.transcode(input_svg_image, output_png_image);
                    png_ostream.flush();
                    png_ostream.close();
                } catch (BadLocationException | IOException | TranscoderException ex) {
                    ex.printStackTrace();
                }
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeFile("" + fileNameTextBox.getText());
            }
        });
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void makeFile(String path){
        try {
            FileWriter myWriter = new FileWriter(path + ".svg");
            if(drawScrambleButton.isSelected()){
                String a = scrambleTextBox.getText();
                fto = new FTO();
                fto.doMoves(a);
                myWriter.write(Main.drawScramble(fto.getState()));
            }
            else {
                String a = scrambleTextBox.getText();
                fto = new FTO();
                fto.doMoves(a);
                myWriter.write(Main.getSVG(fto.getState()));
            }
            myWriter.close();
            System.out.println("Success!");
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
}
