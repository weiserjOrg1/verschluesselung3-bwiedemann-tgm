package gui;

import cipher.*;
import cipher.Exception;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;

public class Controller implements ActionListener {
    private View v;
    private Model m;

    public Controller() {
        this.m = new Model();
        this.v = new View(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (v.getShiftR() == e.getSource()) {
            v.getSecret().setEnabled(false);
            v.getKey().setEnabled(false);
            v.getShift().setEnabled(true);
        }
        if (v.getSecretR() == e.getSource()) {
            v.getShift().setEnabled(false);
            v.getKey().setEnabled(false);
            v.getSecret().setEnabled(true);
        }
        if (v.getKeywordR() == e.getSource()) {
            v.getShift().setEnabled(false);
            v.getSecret().setEnabled(false);
            v.getKey().setEnabled(true);
        }
        if (v.getTransR() == e.getSource()) {
            v.getShift().setEnabled(false);
            v.getSecret().setEnabled(false);
            v.getKey().setEnabled(false);
            v.getLevel().setEnabled(true);
        }

        if (v.getBencrypt() == e.getSource()) {
            if (this.v.getShiftR().isSelected()) {
                m.setvMethod(new ShiftCipher(Integer.parseInt(v.getShift().getText())));
            } else if (this.v.getSecretR().isSelected()) {
                m.setvMethod(new SubstitutionCipher(v.getSecret().getText()));
            } else if (this.v.getKeywordR().isSelected()) {
                try {

                    m.setvMethod(new KeywordCipher(v.getKey().getText()));
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "keyword Exception");
                }
            }else if(this.v.getTransR().isSelected()){
                try {
                    m.setT(new TranspositionCipher(Integer.parseInt(v.getLevel().getText())));
                }catch (Exception ew){
                    JOptionPane.showMessageDialog(null, "Its not a number");
                }
            }


            if (v.getcDecrypt().isSelected()) {
                this.v.getAusgabe().setText(this.m.getvMethod().decrypt(this.v.getEingabe().getText()));
            } else {
                this.v.getAusgabe().setText(this.m.getvMethod().encrypt(this.v.getEingabe().getText()));
            }
        }
    }

    public static void main(String[] args) {
        Controller c = new Controller();
    }
}
