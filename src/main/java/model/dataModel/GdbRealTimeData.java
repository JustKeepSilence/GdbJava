package model.dataModel;

import java.util.concurrent.ConcurrentHashMap;

public class GdbRealTimeData {
    public ConcurrentHashMap<String, Object> getRealTimeData() {
        return realTimeData;
    }

    public void setRealTimeData(ConcurrentHashMap<String, Object> realTimeData) {
        this.realTimeData = realTimeData;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public ConcurrentHashMap<String, Object> realTimeData;
    public int times;
}
