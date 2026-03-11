class Sentence {

    String sentence;

    Sentence(String sentence) {
        this.sentence = sentence;

    }

    void countWords() {
        String[] words = sentence.split("");
        System.out.println("Total no of words:" + words.length);

    }

}

public class S7P10 {
    public static void main(String[] args) {
        Sentence s1 = new Sentence("java is powerful");
        s1.countWords();
    }
}
