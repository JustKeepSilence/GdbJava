package gdb.data;

import base.GdbData;
import model.dataModel.DeadZone;
import model.dataModel.GdbHistoricalData;
import model.dataModel.GdbRealTimeData;
import model.itemModel.DeletedItemsInfo;
import response.TimeRows;

import java.util.ArrayList;

public class GdbDataImpl extends GdbData {
    @Override
    public <T> TimeRows BatchWriteData(ArrayList<String> groupNames, ArrayList<ArrayList<String>> itemNames, ArrayList<ArrayList<T>> itemValues, Boolean flags) throws Exception {
        return null;
    }

    @Override
    public <T> TimeRows BatchWriteHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames, ArrayList<ArrayList<Integer>> timeStamps, ArrayList<ArrayList<T>> itemValues) throws Exception {
        return null;
    }

    @Override
    public GdbRealTimeData GetRealTimeData(ArrayList<String> groupNames, ArrayList<String> itemNames) throws Exception {
        return null;
    }

    @Override
    public <T> GdbHistoricalData<T> GetHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames, ArrayList<Integer> startTimes, ArrayList<Integer> endTimes, ArrayList<Integer> intervals) throws Exception {
        return null;
    }

    @Override
    public <T> GdbHistoricalData<T> GetHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames) throws Exception {
        return null;
    }

    @Override
    public <T> GdbHistoricalData<T> GetHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames, ArrayList<ArrayList<Integer>> timeStamps) throws Exception {
        return null;
    }

    @Override
    public <T> GdbHistoricalData<T> GetHistoricalData(String groupName, ArrayList<String> itemNames, Integer startTime, Integer endTime, Integer interval, String filterCondition, ArrayList<DeadZone> zones) throws Exception {
        return null;
    }

    @Override
    public <T> TimeRows DeleteHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames, ArrayList<Integer> startTimes, ArrayList<Integer> endTimes) throws Exception {
        return null;
    }

    @Override
    public TimeRows CleanItemData(DeletedItemsInfo info) throws Exception {
        return null;
    }
}
