package cipher;

import java.security.Key;

public class KeywordCipher extends MonoAlphabeticCipher {
    private String keyword;
    private String newAlphabet;
    public KeywordCipher(String keyword) throws Exception{
        this.keyword = "bra";
        creat(keyword);
    }


    public void creat(String key)throws Exception {
        if (this.keyword == key) {
            this.setSecretAlphabet("QWERAUPSIOBNMHKLÖDFGJTZßÜÄYXCV");

        }else{
            throw new Exception();
        }
    }


    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }



}
