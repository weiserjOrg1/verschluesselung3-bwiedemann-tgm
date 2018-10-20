package cipher;

import java.security.Key;

public class KeywordCipher extends MonoAlphabeticCipher {
    private String keyword;
    private String newAlphabet;
    public KeywordCipher(String keyword){
        this.keyword = "bra";
        creat(keyword);
    }


    public void creat(String key){
        if(this.keyword == key) {
            this.setSecretAlphabet("QWERAUPSIOBNMHKLÖDFGJTZßÜÄYXCV");
        }else{
            System.out.println("wrong");
        }
    }


    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public static void main(String[] args) {
        KeywordCipher c = new KeywordCipher("bra");
        System.out.println("benni");
        System.out.println(c.encrypt("benni"));
    }
}
