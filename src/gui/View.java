package gui;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JButton bencrypt;
    private JTextField eingabe, secret, shift, key, level;
    private JLabel ausgabe;
    private JRadioButton secretR, shiftR, keywordR, transR ;
    private JCheckBox cDecrypt;

    public View(Controller c) {
        this.setTitle("Verschl");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.bencrypt = new JButton("Encrypt");
        this.eingabe = new JTextField("eingabe");
        this.level = new JTextField("level");
        this.secret = new JTextField("eingabe");
        this.shift = new JTextField("eingabe");
        this.key = new JTextField("key");
        this.ausgabe = new JLabel("ausgabe");
        this.secretR = new JRadioButton("secret");
        this.shiftR = new JRadioButton("shift");
        this.keywordR = new JRadioButton("keyword");
        this.transR = new JRadioButton("transposition");
        this.cDecrypt = new JCheckBox("decrypt");
        ButtonGroup b = new ButtonGroup();
        b.add(keywordR);
        b.add(transR);
        b.add(secretR);
        b.add(shiftR);

        Container center = new Container();
        center.setLayout(new GridLayout(6, 2, 5, 5));
        center.add(eingabe);
        center.add(secret);
        center.add(ausgabe);
        center.add(shift);
        center.add(key);
        center.add(level);
        center.add(secretR);
        center.add(shiftR);
        center.add(keywordR);
        center.add(transR);
        center.add(cDecrypt);


        this.setLayout(new BorderLayout());
        this.add(bencrypt, BorderLayout.SOUTH);
        this.add(center, BorderLayout.CENTER);

        shiftR.addActionListener(c);
        secretR.addActionListener(c);
        bencrypt.addActionListener(c);
        keywordR.addActionListener(c);
        cDecrypt.addActionListener(c);

        this.setVisible(true);
    }

    public JButton getBencrypt() {
        return bencrypt;
    }

    public JTextField getLevel() {
        return level;
    }

    public void setLevel(JTextField level) {
        this.level = level;
    }

    public void setBencrypt(JButton bencrypt) {
        this.bencrypt = bencrypt;
    }

    public JTextField getEingabe() {
        return eingabe;
    }

    public void setEingabe(JTextField eingabe) {
        this.eingabe = eingabe;
    }

    public JTextField getSecret() {
        return secret;
    }

    public void setSecret(JTextField secret) {
        this.secret = secret;
    }

    public JTextField getShift() {
        return shift;
    }

    public void setShift(JTextField shift) {
        this.shift = shift;
    }

    public JLabel getAusgabe() {
        return ausgabe;
    }

    public void setAusgabe(JLabel ausgabe) {
        this.ausgabe = ausgabe;
    }

    public JRadioButton getSecretR() {
        return secretR;
    }

    public void setSecretR(JRadioButton secretR) {
        this.secretR = secretR;
    }

    public JRadioButton getShiftR() {
        return shiftR;
    }

    public void setShiftR(JRadioButton shiftR) {
        this.shiftR = shiftR;
    }

    public JCheckBox getcDecrypt() {
        return cDecrypt;
    }

    public void setcDecrypt(JCheckBox cDecrypt) {
        this.cDecrypt = cDecrypt;
    }

    public JTextField getKey() {
        return key;
    }

    public void setKey(JTextField key) {
        this.key = key;
    }

    public JRadioButton getKeywordR() {
        return keywordR;
    }

    public void setKeywordR(JRadioButton keywordR) {
        this.keywordR = keywordR;
    }

    public JRadioButton getTransR() {
        return transR;
    }

    public void setTransR(JRadioButton transR) {
        this.transR = transR;
    }

}
