package model.groupModel;

import java.util.ArrayList;

public class DeletedGroupColumnNamesInfo {
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

    public String groupName;
    public ArrayList<String> columnNames;
}
