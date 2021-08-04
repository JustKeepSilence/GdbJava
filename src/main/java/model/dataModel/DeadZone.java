package model.dataModel;

public class DeadZone {
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getDeadZoneCount() {
        return deadZoneCount;
    }

    public void setDeadZoneCount(Integer deadZoneCount) {
        this.deadZoneCount = deadZoneCount;
    }

    public String itemName;
    public Integer deadZoneCount;
}
