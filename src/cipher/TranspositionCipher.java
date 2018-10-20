package cipher;

public class TranspositionCipher implements Cipher{
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
       if(transpositionLevel < 1){
           throw new Exception("Level must higher than 1");
       }
        this.transpositionLevel = transpositionLevel;
    }


    public String decrypt(String text) {
       return ("g");
    }
    public String encrypt(String text) {

        return("f") ;
    }
}
