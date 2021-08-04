package model.groupModel;

import java.util.ArrayList;

public class UpdatedGroupColumnNamesInfo {
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<String> getOldColumnNames() {
        return oldColumnNames;
    }

    public void setOldColumnNames(ArrayList<String> oldColumnNames) {
        this.oldColumnNames = oldColumnNames;
    }

    public ArrayList<String> getNewColumnNames() {
        return newColumnNames;
    }

    public void setNewColumnNames(ArrayList<String> newColumnNames) {
        this.newColumnNames = newColumnNames;
    }

    public String groupName;
    public ArrayList<String> oldColumnNames;
    public ArrayList<String> newColumnNames;
}
