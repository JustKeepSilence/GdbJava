package model.dataModel;

import java.util.ArrayList;

public class HData<T> {
    public ArrayList<Integer> getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(ArrayList<Integer> timeStamps) {
        this.timeStamps = timeStamps;
    }

    public ArrayList<T> getItemValues() {
        return itemValues;
    }

    public void setItemValues(ArrayList<T> itemValues) {
        this.itemValues = itemValues;
    }

    public ArrayList<Integer> timeStamps;
    public ArrayList<T> itemValues;
}
