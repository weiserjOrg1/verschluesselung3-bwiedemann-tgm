package gui;

import cipher.MonoAlphabeticCipher;
import cipher.SubstitutionCipher;

public class Model {
    private String eingabe;
    private int versch;
    private String fakeAlpha;
    private MonoAlphabeticCipher vMethod;

    public Model(){
        this.vMethod = new SubstitutionCipher("QWERTZßÜAUIOPSKLÖDFGBNMHJÄYXCV");
    }

    public String getEingabe() {
        return eingabe;
    }

    public void setEingabe(String eingabe) {
        this.eingabe = eingabe;
    }

    public int getVersch() {
        return versch;
    }

    public void setVersch(int versch) {
        this.versch = versch;
    }

    public String getFakeAlpha() {
        return fakeAlpha;
    }

    public void setFakeAlpha(String fakeAlpha) {
        this.fakeAlpha = fakeAlpha;
    }

    public MonoAlphabeticCipher getvMethod() {
        return vMethod;
    }

    public void setvMethod(MonoAlphabeticCipher vMethod) {
        this.vMethod = vMethod;
    }
}
