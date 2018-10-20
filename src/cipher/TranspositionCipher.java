package cipher;

public class TranspositionCipher implements Cipher {
    private int transpositionLevel;
    private String eingabe;

    public TranspositionCipher(int transpsitionLevel) throws Exception {
        if (transpsitionLevel < 1) {
            throw new Exception("Level must higher than 1");
        }
        this.transpositionLevel = transpsitionLevel;
    }

    public int getTranspositionLevel() {
        return transpositionLevel;
    }

    public void setTranspositionLevel(int transpositionLevel) throws Exception {
        if (transpositionLevel < 1) {
            throw new Exception("Level must higher than 1");
        }
        this.transpositionLevel = transpositionLevel;
    }


    public String decrypt(String text) {
        int zähler = text.length() - text.replace(" ", "").length();
        if (zähler != this.transpositionLevel) {
            return text;
        }
        String[] text2 = new String[this.transpositionLevel];
        for (int i = 0; i < this.transpositionLevel; i++) {
            int hilfe = text.indexOf(" ");
            text2[i] = text.substring(0, text.lastIndexOf(" "));
            i++;
            if(i<this.transpositionLevel){
                text = text.substring(text.indexOf(" ")+1,text.length());
            }
        }
        int count = 0;
        int[] counter = new int[this.transpositionLevel];
        for (int i = 0; i<text.length()-this.transpositionLevel;i++){
            int reset = count%this.transpositionLevel;
            if(reset==0){
                count=0;
            }
            text= text+text2[count].charAt(counter[count]);
            counter[count]=counter[count]+1;
            count++;
        }
        return text;
    }

    public String encrypt(String text) {
        text= text.replace(" ","");
        String encrypt ="";
        int zähler=0;
        String[] space = new String[this.transpositionLevel];
        for(int i=0;i<space.length;i++){
            space[i]="";
        }
        for(int i = 0; i < text.length(); i++) {
            int reset = zähler%this.transpositionLevel;
            if(reset == 0) {
                zähler = 0;
            }
            space[zähler] = space[zähler] + text.charAt(i);
            zähler++;
        }
        for(int i = 0; i < space.length; i++) {
            encrypt = encrypt + space[i] + " ";
        }
        return encrypt;
    }

}
