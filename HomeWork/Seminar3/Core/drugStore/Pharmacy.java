package HomeWork.Seminar3.Core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private int id;
    private List<Component> components;
    private int componentsCount;

    public Pharmacy(int id) {
        this.id = id;
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }
    public Pharmacy addComponent (Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" + "id=" + getId() +
                ", components=" + components +
                ", index=" + componentsCount +
                '}'+"Total power = "+getPower(this)+"\n";
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int result;
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        result = Integer.compare(pow1, pow2);
        if (Integer.compare(pow1, pow2) == 0) {
            
            return result = 0;
        }
        return Integer.compare(pow1, pow2);
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;
    }

    private int getPower (Pharmacy pharm) {
        int result = 0;
        for (Component elem: pharm.getComponents()) {
            result += elem.getPower();
        }
        return result;
    }
    public int getId() {
        return id;
    }


}
