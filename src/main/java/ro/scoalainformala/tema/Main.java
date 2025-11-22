package ro.scoalainformala.tema;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative[] reps = {
                new SalesRepresentative(10, 500),
                new SalesRepresentative(7, 800),
                new SalesRepresentative(5, 1300)
        };

        SalesSorter sorter = new SalesSorter();
        SalesRepresentative[] sorted = sorter.sort(reps);

        System.out.println("Sales representative sorted by revenue:");
        for (SalesRepresentative rep : sorted) {
            System.out.println(rep);
        }
    }
}