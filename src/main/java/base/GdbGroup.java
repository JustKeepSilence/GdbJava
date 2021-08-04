package base;

import model.groupModel.*;
import response.TimeCols;
import response.TimeRows;

import java.util.ArrayList;

public abstract class GdbGroup {

    //add groups to gdb
    public abstract TimeRows AddGroups(ArrayList<AddedGroupInfo> groupInfos) throws Exception;

    // delete groups from gdb
    public abstract TimeRows DeleteGroups(GroupNamesInfo groupNamesInfo) throws Exception;

    // get all groups in gdb

    public abstract GroupNamesInfo GetGroups() throws Exception;

    // get the column name and item count of the given groupName and condition

    public abstract GroupPropertyInfo GetGroupProperty(String groupName, String condition) throws Exception;

    // update groupNames,the history data of oldGroup will migrate to new newGroup as well

    public abstract TimeRows UpdateGroupNames(ArrayList<UpdatedGroupNameInfo> infos) throws Exception;

    // update column names of group,you can't update columns of id, itemName, dataType's column name.

    public abstract TimeCols UpdateGroupColumnNames(UpdatedGroupColumnNamesInfo info) throws Exception;

    // delete columns from group, you can't delete id, itemName, dataType column

    public abstract TimeCols DeleteGroupColumns(DeletedGroupColumnNamesInfo info) throws Exception;

    // add columns to group, all columns type are text default.And you can't add duplicate columns

    public abstract TimeCols AddGroupColumns(AddedGroupColumnsInfo info) throws Exception;

    // delete all items and corresponding history data in the given groups,so after this operation
    // you can't write or get data from this group any more,you MUST use this method carefully

    public abstract TimeRows CleanGroupItems(ArrayList<String> groupNames) throws Exception;
}
