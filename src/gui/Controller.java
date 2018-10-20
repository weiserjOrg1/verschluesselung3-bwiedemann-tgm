package gui;

import cipher.ShiftCipher;
import cipher.SubstitutionCipher;

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
            v.getShift().setEnabled(true);
        }
        if (v.getSecretR() == e.getSource()) {
            v.getShift().setEnabled(false);
            v.getSecret().setEnabled(true);
        }
        if (v.getBencrypt() == e.getSource()) {
            if (this.v.getShiftR().isSelected()) {
                m.setvMethod(new ShiftCipher(Integer.parseInt(v.getShift().getText())));
            } else {
                m.setvMethod(new SubstitutionCipher(v.getSecret().getText()));
            }

            this.v.getAusgabe().setText(this.m.getvMethod().encrypt(this.v.getEingabe().getText()));
            //this.v.getAusgabe().setText(this.m.getvMethod().decrypt(this.v.getEingabe().getText()));
        }
    }

    public static void main(String[] args) {
        Controller c = new Controller();
    }
}
