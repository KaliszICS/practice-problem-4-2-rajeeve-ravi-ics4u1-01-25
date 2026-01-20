import java.util.ArrayList;

/**
 * The type Practice problem.
 */
public class PracticeProblem {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {
    }

    /**
     * Tower of hanoi string [ ].
     *
     * @param n the n
     * @return the string [ ]
     */
    public static String[] towerOfHanoi(int n) {
        if (n <= 0) return new String[0];
        ArrayList<String> movesList = new ArrayList<>();
        solveHanoi(n, 'L', 'R', 'M', movesList);
        return movesList.toArray(new String[0]);
    }

    private static void solveHanoi(int n, char from, char to, char aux, ArrayList<String> list) {
        if (n == 1) {
            list.add("" + from + to);
            return;
        }
        solveHanoi(n - 1, from, aux, to, list);
        list.add("" + from + to);
        solveHanoi(n - 1, aux, to, from, list);
    }

    /**
     * Q 1.
     */
    public static void q1() {}

    /**
     * Q 2.
     */
    public static void q2() {}

    /**
     * Q 3.
     */
    public static void q3() {}

    /**
     * Q 4.
     */
    public static void q4() {}

    /**
     * Q 5.
     */
    public static void q5() {}
}

/**
 * The type Dog.
 */
class Dog {
    private String name;
    private String breed;
    private int weight;

    /**
     * Instantiates a new Dog.
     *
     * @param name   the name
     * @param breed  the breed
     * @param weight the weight
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() { return name; }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Gets breed.
     *
     * @return the breed
     */
    public String getBreed() { return breed; }

    /**
     * Sets breed.
     *
     * @param breed the breed
     */
    public void setBreed(String breed) { this.breed = breed; }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public int getWeight() { return weight; }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(int weight) { this.weight = weight; }
}

/**
 * The type Car.
 */
class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Instantiates a new Car.
     *
     * @param make  the make
     * @param model the model
     * @param year  the year
     * @param price the price
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Gets make.
     *
     * @return the make
     */
    public String getMake() { return make; }

    /**
     * Sets make.
     *
     * @param make the make
     */
    public void setMake(String make) { this.make = make; }

    /**
     * Gets model.
     *
     * @return the model
     */
    public String getModel() { return model; }

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(String model) { this.model = model; }

    /**
     * Gets year.
     *
     * @return the year
     */
    public int getYear() { return year; }

    /**
     * Sets year.
     *
     * @param year the year
     */
    public void setYear(int year) { this.year = year; }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() { return price; }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) { this.price = price; }
}
