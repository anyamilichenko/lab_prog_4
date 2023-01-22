public class Main  {
    public static void main(String[] args) {


        //АНОНИМНЫЙ КЛАСС
        Residents anonResident = new Residents("жители", new String[0], "Ягодный"){
            @Override
            public void Iclever(){
                System.out.println("Нет, мы умнее!");
            }
        };



        Place onRoadStart = new Place("В это время ", Places.ROAD);
        ThingForMove dust = new ThingForMove("облако пыли ", new String[0]);
        Person shorties = new Shorties("Коротышки", new String[0]);
        Person all = new Guy("Все", new String[0]);
        Person znaika = new Guy("Знайка", new String[0]);
        Person bublik = new Guy("Бублик", new String[0]);
        Person shurupchik = new Guy("Шурупчик", new String[0]);
        Person gvozdik = new Guy("Гвоздик", new String[0]);
        String[] desDragon = new String[1];
        desDragon[0] = "стоголовый";
        Person dragon = new Guy("Дракон", new String[0]);
        ThingForMove cars = new ThingForMove("три машины ", new String[0]);
        String[] carsM = new String[3];
        carsM[0] = "первая ";
        carsM[1] = "вторая ";
        carsM[2] = "третья ";
        ThingForMove car = new ThingForMove("машина ", new String[0], carsM);
        String[] desApple = new String[2];
        desApple[0] = "большое ";
        desApple[1] = "краснобокое ";
        Thing apple = new ThingForMove("яблоко ", desApple);
        String[] desPear = new String[2];
        desApple[0] = "спелая ";
        Thing pear = new ThingForMove("груша ", desPear);
        String[] desSliv = new String[2];
        desApple[0] = "полдесятка ";
        Thing slivi = new ThingForMove("сливы ", desSliv);
        Person[] persons = new Person[3];
        persons[0] = bublik;
        persons[1] = shurupchik;
        persons[2] = gvozdik;

        // 4 лаба
        Person kids = new Shorties("Малыши", new String[0]);
        Residents residents = new Residents("жители", new String[0], "Цветочный");
        ThingForMove.Death death = new ThingForMove.Death();//Создали объект класса Death






        //4 лаба
        System.out.print(znaika.name + " ");
        znaika.decidedtoGo(Places.GREEN_CITY);
        System.out.print("");
        System.out.print(residents.name + " ");
        //когда мы используем объект класса Residents, то мы внутри реализации метода
        //start() создаем объект нестатического вложенного класса City и используем его
        residents.start();
        residents.dissuaded();
        System.out.print(znaika.name + " ");
        znaika.persevere();
        System.out.print("Нечего делать");
        System.out.print(kids.name + " ");
        kids.eat(Times.THEN);
        kids.brought_out(Places.CITY_SUBURB);
        kids.showTheWay(Places.GREEN_CITY);
        System.out.println(kids.name + " ");
        kids.consider();
        death.gotodeath(); //используем метод статического вложенного класса







//3 лаба
        System.out.print(onRoadStart);
        dust.seem();
        System.out.print(dust + ".");
        System.out.print(dust.name + " ");
        System.out.print("быстро ");
        dust.closer();
        dust.gettingBigger();
        System.out.print(".");
        shorties.rushed("врасыпную ");
        System.out.print(shorties.name + " ");
        shorties.hid(Places.HOUSES);

        try {  //определяем блок кода, где может произойти исключение
            shorties.peek(Places.WINDOW);
        } catch (RuntimeException e) { //блок кода,  где происходит обработка исключения
            System.out.print(e);
        }

        System.out.print(".");
        System.out.print(all.name + " ");
        all.decided();
        System.out.print(dragon);
        dragon.move();
        System.out.print(znaika);
        znaika.notScared();
        znaika.stay(Places.STREET);
        System.out.print(".");
        all.seen();
        System.out.print(Places.CITY);
        cars.closer();
        System.out.print(cars.name + " ");
        System.out.print(".");
        System.out.print(cars.name + " ");
        cars.raise(dust, Places.ROAD);
        System.out.print(".");
        System.out.print(car.cars[0] + car.name + " ");
        car.lying(apple);
        System.out.print(car.cars[1] + car.name + " ");
        car.lying(pear);
        System.out.print(car.cars[2] + car.name + " ");
        car.lying(slivi);
        cars.eq();
        System.out.print(znaika.name + " ");
        cars.stop();
        System.out.print("и ");
        bublik.runOut();
        all.gotOut();

        System.out.print(bublik.name + " ");
        System.out.print(shurupchik.name + " ");
        System.out.print(gvozdik.name + " ");
        System.out.print(".");
        shorties.seen();
        System.out.print(shorties.name + " ");
        shorties.runOut();
        System.out.print("из " + Places.HOUSES);
        shorties.hug(persons);
        all.questioned();
        all.hear();
        System.out.print(dragon.name + "нет никогда не было");
        System.out.print(all.name + " ");
        all.beSurprised();
    }
}

