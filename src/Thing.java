import java.util.Arrays;
import java.util.Objects;

public abstract class Thing implements Movements {
    public String name;
    public String[] description;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = result + Arrays.hashCode(description) + 69;
        return result;
    }

    @Override
    public void eq(){
        System.out.print("поравнялись ");
    }

    @Override
    public void closer() {
        System.out.print("приближались ");
    }

    @Override
    public void stop() {
        System.out.print("остановились ");
    }

    @Override
    public void gettingBigger() {
        System.out.print("становилось больше ");
    }
    @Override
    public void raise(Thing thing, Places place) {
        System.out.print("поднял " + place + " ");
    }

    @Override
    public void seem() {
        System.out.print("показалось ");
    }

    @Override
    public void lying(Thing thing) {
        System.out.print("лежал ");
    }

}
