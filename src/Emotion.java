public class Emotion extends Thing{
    private String name;

    public Emotion(){
        this.name = name;
    }
    private interface IGetEmotion{
        String getemotion();
    }
    //ЛОКАЛЬНЫЙ КЛАСС
    public IGetEmotion GetEmotion(){
        class PersonEmotion implements IGetEmotion{
            final String name = Emotion.this.name;
            @Override
            public String getemotion(){
                return this.name;
            }
        }
        return new PersonEmotion();
    }
}

