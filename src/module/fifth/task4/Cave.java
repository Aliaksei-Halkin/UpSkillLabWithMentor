package module.fifth.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cave {
    private List<Riches> riches = new ArrayList<>();

    public Cave() {

    }

    protected void addRiches(Riches riches) {
        this.riches.add(riches);
    }

    public List<Riches> getRiches() {
        return riches;
    }

    public void viewRiches() {
        for (Riches riche : riches) {
            System.out.println(riche);
        }
    }

    public void expensiveBox() {


    }

}
