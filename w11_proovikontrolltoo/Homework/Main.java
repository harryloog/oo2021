import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
        ArrayList<QuestionsAnswers> questionsAnswers = new ArrayList<QuestionsAnswers>();
        questionsAnswers.add(new QuestionsAnswers<String, Integer>("Mis on 2+2", 4));
        questionsAnswers.add(new QuestionsAnswers<String, String>("Õun inglise keeles?", "Apple"));
        questionsAnswers.add(new QuestionsAnswers<String, Character>("Mis kaashäälik esineb kõige rohkem sõnas \"Banaan\"?", 'n'));
        questionsAnswers.add(new QuestionsAnswers<Double, String>(3.14, "Pi"));
        questionsAnswers.add(new QuestionsAnswers<Integer, String>(4, "2 + 2"));
        for (QuestionsAnswers questionsAnswers2 : questionsAnswers) {
            System.out.println(questionsAnswers2.getQuestion()+" : "+questionsAnswers2.getAnswer());
        }    
        


    }
}