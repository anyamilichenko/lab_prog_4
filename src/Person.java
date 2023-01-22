public abstract class Person implements Actions, Runable, Seeable, AbleToPersevere, Ieat, AbleToDecidedToGo, ShowTheWay, Iconsider{

    public String name;
    public String[] description;
    public boolean inHome = false;


    @Override
    public void hug(Person[] persons) {
        System.out.print("стали обнимать ");
        for (int i = 0; i < persons.length; i++) {
            if (i == 0) {
                System.out.print(persons[i].name + " ");
            } else {
                System.out.print("и " + persons[i].name + " ");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < description.length; i++) {
            if (i == 0) {
                result.append(description[i]);
            } else {
                result.append("и ").append(description[i]).append(" ");
            }
        }
        result.append(name + " ");
        return result.toString();
    }

    @Override
    public void gotOut() {
        System.out.print("вылезли ");
    }

    @Override
    public void move() {
        System.out.print("бежали ");
    }

    @Override
    public void runOut() {
        inHome = false;
        System.out.print("выбежали ");
    }

    @Override
    public void riseUp() {
        System.out.print("поднялись ");
    }

    @Override
    public void stay(Places place) {
        System.out.print("остался " + place);
    }

    @Override
    public void rushed(String description) {
        System.out.print("бросились ");
    }

    @Override
    public void decided() {
        System.out.print("решили ");
    }

    @Override
    public void seen() {
        System.out.print("видели ");
    }

    @Override
    public void hid(Places place) {
        inHome = true;
        System.out.print("спрятались ");
    }
    //unchecked исключение, так как наследуется от RuntimeException(checked исключения наследуются от Exception)
    @Override
    public void peek(Places place) {
        if (inHome) {
            System.out.print("заглядывали ");
        } else {
            throw new RuntimeException("inHome == false in method peek");//Если исключительная ситуация, то сгенерировать исключение
        }
    }

    @Override
    public void hear() {
        System.out.print("услышали ");
    }

    @Override
    public void notScared() {
        System.out.print("не испугались ");
    }

    @Override
    public void questioned() {
        System.out.print("расспрашивали ");
    }

    @Override
    public void beSurprised() {
        System.out.print("удивились ");
    }


    @Override
    public void decidedtoGo(Places place) {
        System.out.println("решил отправиться в " + place);
    }

    @Override
    public void persevere() {
        System.out.print("стоял на своем ");
    }

    @Override
    public void dissuaded() {
        System.out.print("отговаривали его  ");
    }

    @Override
    public void eat(Times time) {
        System.out.print("покормили его " + time);
    }

    @Override
    public void brought_out(Places place) {
        System.out.print("вывели на " + place );
    }
    @Override
    public void showTheWay(Places place){
        System.out.println("показали дорогу в " + place);
    }
    @Override
    public void consider() {

        System.out.print("считали что ");
    }

}
