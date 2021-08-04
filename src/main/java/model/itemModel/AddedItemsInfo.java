package model.itemModel;

import java.util.ArrayList;
import java.util.Map;

public class AddedItemsInfo {
    public String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Map<String, String>> getItemValues() {
        return itemValues;
    }

    public void setItemValues(ArrayList<Map<String, String>> itemValues) {
        this.itemValues = itemValues;
    }

    public ArrayList<Map<String, String>> itemValues;
}
