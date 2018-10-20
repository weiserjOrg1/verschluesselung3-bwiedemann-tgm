package cipher;

public class SubstitutionCipher extends MonoAlphabeticCipher {
    public SubstitutionCipher(String secretAlphabet) {
        setSecretAlphabet(secretAlphabet);
    }
    public void setSecretAlphabet(String secretAlphabet){
        super.setSecretAlphabet(secretAlphabet);
    }

    public static void main(String[] args) {
        SubstitutionCipher s = new SubstitutionCipher("QWERUIOPÜTZASDFXCVBNMßGHJKLÖÄY");
        System.out.println("WiedemannBenni");
        System.out.println(s.encrypt("WiedemannBenni"));

    }
}
