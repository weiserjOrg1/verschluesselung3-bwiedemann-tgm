package gui;

import cipher.*;
import cipher.Exception;

public class Model {
    private String eingabe;
    private int versch;
    private String fakeAlpha;
    private String keyword;
    private MonoAlphabeticCipher vMethod;
    private TranspositionCipher t;


    public Model() {

        this.vMethod = new SubstitutionCipher("QWERTZßÜAUIOPSKLÖDFGBNMHJÄYXCV");
        try {

            this.vMethod = new KeywordCipher("bra");
        } catch (Exception e1) {

        }
        try {

            this.t = new TranspositionCipher(2);
        } catch (Exception eq) {

        }
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public TranspositionCipher getT() {
        return t;
    }

    public void setT(TranspositionCipher t) {
        this.t = t;
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
