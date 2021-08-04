package model.groupModel;

import java.util.ArrayList;

public class AddedGroupInfo {
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String groupName;
    public ArrayList<String> columnNames;
}
