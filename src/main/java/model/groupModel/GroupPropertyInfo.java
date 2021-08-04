package model.groupModel;

import java.util.ArrayList;

public class GroupPropertyInfo {
    public int itemCount;

    public ArrayList<String> getItemColumnNames() {
        return itemColumnNames;
    }

    public void setItemColumnNames(ArrayList<String> itemColumnNames) {
        this.itemColumnNames = itemColumnNames;
    }

    public ArrayList<String> itemColumnNames;
}
