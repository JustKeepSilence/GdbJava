package model.groupModel;

import java.util.ArrayList;

public class AddedGroupColumnsInfo {
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(ArrayList<String> columnNames) {
        this.columnNames = columnNames;
    }

    public ArrayList<String> getDefaultValues() {
        return defaultValues;
    }

    public void setDefaultValues(ArrayList<String> defaultValues) {
        this.defaultValues = defaultValues;
    }

    public String groupName;
    public ArrayList<String> columnNames;
    public ArrayList<String> defaultValues;
}
