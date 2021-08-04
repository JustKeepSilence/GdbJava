package model.itemModel;

import java.util.ArrayList;
import java.util.Map;

public class GdbItems {
    public ArrayList<Map<String, String>> getItemValues() {
        return itemValues;
    }

    public void setItemValues(ArrayList<Map<String, String>> itemValues) {
        this.itemValues = itemValues;
    }

    public ArrayList<Map<String, String>> itemValues;
}
