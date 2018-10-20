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
            this.newAlphabet="QWERAUPSIOBNMHKLÖDFGJTZßÜÄYXCV";
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
    public String encrypt(String text) {
        StringBuilder x = new StringBuilder();
        for(int i = 0;i<text.length();i++) {
            x.append(newAlphabet.charAt(super.getAlphabet().indexOf(text.toUpperCase().charAt(i))));
        }
        return x.toString();
    }
    public static void main(String[] args) {
        KeywordCipher c = new KeywordCipher("bra");
        System.out.println("benni");
        System.out.println(c.encrypt("benni"));
    }
}
