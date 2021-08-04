package base;

import model.itemModel.*;
import response.TimeRows;

import java.util.ArrayList;

public abstract class GdbItem {
    // add items to gdb
    public abstract TimeRows AddItems(AddedItemsInfo itemsInfo) throws Exception;

    // delete items from gdb
    public abstract TimeRows DeleteItems(DeletedItemsInfo info) throws Exception;

    // getItems from gdb
    public abstract GdbItems GetItems(ItemsInfo info) throws Exception;

    // update items in gdb according to given condition and clause condition is where
    // clause in SQL and clause is set clause in SQL.You can't update id or itemName or dataType column
    public abstract TimeRows UpdateItems(UpdatedItemsInfo info) throws Exception;

    // check whether the given items existed in the given group
    public abstract void CheckItems(String groupName, ArrayList<String> itemNames) throws Exception;
}
