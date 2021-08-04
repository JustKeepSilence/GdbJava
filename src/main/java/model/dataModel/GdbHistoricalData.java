package model.dataModel;

import java.util.concurrent.ConcurrentHashMap;

public class GdbHistoricalData<T> {
    public ConcurrentHashMap<String, HData<T>> historicalData;

    public ConcurrentHashMap<String, HData<T>> getHistoricalData() {
        return historicalData;
    }

    public void setHistoricalData(ConcurrentHashMap<String, HData<T>> historicalData) {
        this.historicalData = historicalData;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int times;
}

