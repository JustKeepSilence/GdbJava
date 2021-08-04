package gdb.group;

import base.GdbGroup;
import model.groupModel.*;
import response.TimeCols;
import response.TimeRows;

import java.nio.channels.FileChannel;
import java.util.ArrayList;

public class GdbGroupImpl extends GdbGroup {
    @Override
    public TimeRows AddGroups(ArrayList<AddedGroupInfo> groupInfos) throws Exception {
        return null;
    }

    @Override
    public TimeRows DeleteGroups(GroupNamesInfo groupNamesInfo) throws Exception {
        return null;
    }

    @Override
    public GroupNamesInfo GetGroups() throws Exception {
        return null;
    }

    @Override
    public GroupPropertyInfo GetGroupProperty(String groupName, String condition) throws Exception {
        return null;
    }

    @Override
    public TimeRows UpdateGroupNames(ArrayList<UpdatedGroupNameInfo> infos) throws Exception {
        return null;
    }

    @Override
    public TimeCols UpdateGroupColumnNames(UpdatedGroupColumnNamesInfo info) throws Exception {
        return null;
    }

    @Override
    public TimeCols DeleteGroupColumns(DeletedGroupColumnNamesInfo info) throws Exception {
        return null;
    }

    @Override
    public TimeCols AddGroupColumns(AddedGroupColumnsInfo info) throws Exception {
        return null;
    }

    @Override
    public TimeRows CleanGroupItems(ArrayList<String> groupNames) throws Exception {
        return null;
    }

}
