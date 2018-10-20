package cipher;

public class MonoAlphabeticCipher implements Cipher {
    private String secretAlphabet;
    private String alphabet;
    public MonoAlphabeticCipher() {
        setAlphabet("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜß");
    }

    private void setAlphabet(String eingabe) {
        this.alphabet=eingabe;
    }
    protected void setSecretAlphabet(String text){
        if (text.length()==30){
            for (int i=0;i<text.length();i++) {
                for (int j=0; j<text.length();j++) {
                    if(i != j) {
                        if(text.charAt(j) == text.charAt(i)) {
                            text = "QWERTZßÜAUIOPSKLÖDFGBNMHJÄYXCV";
                            System.out.println("Ein Buchstabe kommt mehr als 1 mal vor");

                        }
                    }

                }
            }
            for(int i = 0;i<alphabet.length();i++) {
                if(text.indexOf(alphabet.charAt(i))==-1) {
                    text = "QWERTZßÜAUIOPSKLÖDFGBNMHJÄYXCV";
                    System.out.println("Ein Buchstabe ist nicht erlaubt");

                }
            }
        } else {
            text = "QWERTZßÜAUIOPSKLÖDFGBNMHJÄYXCV";
            System.out.println("Buchstaben fehlen");
        }
        this.secretAlphabet=text;
    }
    public String decrypt(String text) {
        StringBuilder x = new StringBuilder();
        for(int i = 0;i<text.length();i++) {
            x.append(alphabet.charAt(secretAlphabet.indexOf(text.toUpperCase().charAt(i))));
        }
        return x.toString();
    }
    public String encrypt(String text) {
        StringBuilder x = new StringBuilder();
        for(int i = 0;i<text.length();i++) {
            x.append(secretAlphabet.charAt(alphabet.indexOf(text.toUpperCase().charAt(i))));
        }
        return x.toString();
    }

    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    public String getAlphabet() {
        return alphabet;
    }
}
