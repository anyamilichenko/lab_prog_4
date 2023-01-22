public class ThingForMove extends Thing{
    public String[] cars;

    public ThingForMove(String name, String[] description) {
        this.name = name;
        this.description = description;
    }

    public ThingForMove(String name, String[] description, String[] carsM) {
        this.name = name;
        this.description = description;
        this.cars = carsM;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < description.length; i++) {
            if(i == 0){
                result.append(description[i]);
            }else{
                result.append("и ").append(description[i]).append(" ");
            }
        }
        result.append(name + " ");
        return result.toString();
    }
    //СТАТИЧЕСКИЙ ВЛОЖЕННЫЙ КЛАСС
    //Death имеет мало чего общего с ThingForMove, просто логически сгруппировав
    //мы получили, что класс Death должен находиться тут, так как это неживое
    public static class Death{
        public void gotodeath(){
            System.out.println("он идет на верную гибель");
        }
    }

}
