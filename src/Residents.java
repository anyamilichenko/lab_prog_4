public class Residents extends Person {
    private String city;
    public Residents(String name, String[] description, String city) {
        this.name = name;
        this.description = description;
        this.city = city;

    }
    public void Iclever(){
        System.out.println("Мы умнее!");
    }

    //НЕСТАТИЧЕСКИЙ ВЛОЖЕННЫЙ КЛАСС
    //вызываем в main метод start(), относящийся к классу Residents
    //затем в этом методе создаем объект неститческого вложенного класса
    //city, а потом используем его
    private class City{
        public void writeTheCity(){
            System.out.println("из города" + city);
        }
    }
    public void start(){
        City city = new City();
        city.writeTheCity();

    }

}