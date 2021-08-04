package base;

import com.sun.istack.internal.Nullable;
import model.dataModel.DeadZone;
import model.dataModel.GdbHistoricalData;
import model.dataModel.GdbRealTimeData;
import model.itemModel.DeletedItemsInfo;
import response.TimeRows;

import java.util.ArrayList;

public abstract class GdbData {
    // batchWrite realTimeData to gdb, T can only be Float, Int, String or Boolean
    public abstract <T> TimeRows BatchWriteData(ArrayList<String> groupNames, ArrayList<ArrayList<String>> itemNames,
                                                ArrayList<ArrayList<T>> itemValues, @Nullable Boolean flags) throws Exception;

    // batchWrite history data to gdb, T can only be Float, Int, String or Boolean
    public abstract <T> TimeRows BatchWriteHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames,
                                                          ArrayList<ArrayList<Integer>> timeStamps,
                                                          ArrayList<ArrayList<T>> itemValues) throws Exception;

    // get RealTimeData from gdb
    public abstract GdbRealTimeData GetRealTimeData(ArrayList<String> groupNames, ArrayList<String> itemNames) throws Exception;

    // get historyData from gdb With startTime, endTime and intervals
    public abstract <T> GdbHistoricalData<T> GetHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames,
                                                            ArrayList<Integer> startTimes, ArrayList<Integer> endTimes, ArrayList<Integer>
                                          intervals) throws Exception;

    // get raw that is all history data from gdb
    public abstract  <T> GdbHistoricalData<T> GetHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames) throws Exception;

    // get history data with timeStamp from gdb
    public abstract <T> GdbHistoricalData<T> GetHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames,
                                                               ArrayList<ArrayList<Integer>> timeStamps) throws Exception;

    // get history data with condition and deadZone info from gdb
    public abstract <T> GdbHistoricalData<T> GetHistoricalData(String groupName, ArrayList<String> itemNames, Integer startTime,
                                                               Integer endTime, Integer interval, String filterCondition, ArrayList<DeadZone> zones) throws Exception;
    // delete history data from gdb
    public abstract <T> TimeRows DeleteHistoricalData(ArrayList<String> groupNames, ArrayList<String> itemNames,
                                                      ArrayList<Integer> startTimes, ArrayList<Integer> endTimes) throws Exception;

    // delete item and history data of the given item
    public abstract TimeRows CleanItemData(DeletedItemsInfo info) throws Exception;
}
