public class QuestionsAnswers<Q, A> implements Questions {
    private Q question;
    private A answer;

    //t-type, e- element , k key  ,v value s u v

    public QuestionsAnswers(Q question, A answer){
        this.question=question;
        this.answer = answer;
    }

    @Override
    public Q getQuestion(){
        return this.question;
    }
    @Override
    public A getAnswer(){
        return this.answer;
    }
}
