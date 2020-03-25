package ua.training;

/**
 * Created by Anton Tsarenko on 19.11.2019.
 */
public class Model {

    private String helloWord;
    private String javaWord;


    // The Program logic

    /**
     * in this method make sentence Hello Java
     * @param helloWord, first word
     * @param javaWord, second word
     * @return concat
     */
    public String makeSentence(String helloWord, String javaWord){
        return helloWord + " " + javaWord;
    }

    public String getHelloWord() {
        return helloWord;
    }

    public void setHelloWord(String helloWord) {
        this.helloWord = helloWord;
    }

    public String getJavaWord() {
        return javaWord;
    }

    public void setJavaWord(String javaWord) {
        this.javaWord = javaWord;
    }
}
