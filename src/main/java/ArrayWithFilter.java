import java.util.ArrayList;

/*
 * Complete the class below.
 *
 * Filter Array as companies have more then 10000 employees.
 *
 */

public class ArrayWithFilter {

    private int employees;
    private String name;

    public ArrayWithFilter(String name, int employees) {
        this.name = name;
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ArrayList<ArrayWithFilter> arrayList = new ArrayList<>();
        arrayList.add(new ArrayWithFilter("Adobe", 20000));
        arrayList.add(new ArrayWithFilter("Kodak", 9999));
        arrayList.add(new ArrayWithFilter("Microsoft", 20000));
        arrayList.add(new ArrayWithFilter("Steam", 10000));

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getEmployees() > 10000)
            {
                System.out.println("Id: " + (i+1) + " - " + arrayList.get(i).getName());
            }
        }
    }
}