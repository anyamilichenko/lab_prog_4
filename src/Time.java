public class Time extends  Enviroment {
    public Time(String time, Places places) {
        this.time = time;
        this.place = places.toString();
    }

    @Override
    public String toString() {
        return time + place;
    }
}