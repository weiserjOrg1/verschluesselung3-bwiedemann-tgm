package cipher;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftCipher extends MonoAlphabeticCipher {
    private int versch;

    public ShiftCipher(int i) {
        super();
        this.versch = i;
        evalsecret();


    }


    private void evalsecret() {
        String aneu="";
        char[] bla = new char[30];
        char temp = 'A';
        for(int i =0;i<26;i++){
            bla[i] = temp;
            temp += 1;
        }
        bla[26]='Ä';
        bla[27]='Ö';
        bla[28]='Ü';
        bla[29]='ß';
        System.out.println(Arrays.toString(bla));

        for (int i = 0; i < bla.length; i++) {
            char c = bla[i];
            c = bla[(i+this.versch)%30];
            aneu +=c;
        }
        super.setSecretAlphabet(aneu);
    }


    public int getVersch() {
        return versch;
    }

    public void setVersch(int versch) {
        this.versch = versch;
    }

    public static void main(String[] args) {
        ShiftCipher s = new ShiftCipher(4);

    }
}
