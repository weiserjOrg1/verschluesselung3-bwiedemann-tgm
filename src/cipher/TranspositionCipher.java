package cipher;

public class TranspositionCipher implements Cipher{
    private int transpositionLevel;
   public TranspositionCipher(int transpsitionLevel){
        this.transpositionLevel=transpsitionLevel;
   }

    public int getTranspositionLevel() {
        return transpositionLevel;
    }

    public void setTranspositionLevel(int transpositionLevel) {
        this.transpositionLevel = transpositionLevel;
    }


    public String decrypt(String text) {
       return ("g");
    }
    public String encrypt(String text) {

        return("f") ;
    }
}
