package ro.scoalainformala.tema;

public class SalesSorter {

    public SalesRepresentative[] sort(SalesRepresentative[] reps) {
        boolean swapped;
        int n = reps.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (reps[j].getRevenue() < reps[j + 1].getRevenue()) {
                    SalesRepresentative temp = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return reps;
    }
}
