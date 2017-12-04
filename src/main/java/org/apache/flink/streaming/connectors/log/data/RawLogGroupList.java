package org.apache.flink.streaming.connectors.log.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RawLogGroupList implements Serializable{
    public List<RawLogGroup> rawLogGroups;

    public RawLogGroupList(){
        rawLogGroups = new ArrayList<RawLogGroup>();
    }

    public void add(RawLogGroup lg){
        rawLogGroups.add(lg);
    }

    public List<RawLogGroup> getRawLogGroups() {
        return rawLogGroups;
    }

    public void setRawLogGroups(List<RawLogGroup> rawLogGroups) {
        this.rawLogGroups = rawLogGroups;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for(RawLogGroup lg: rawLogGroups){
            strBuilder.append(lg.toString() + "\r\n");
        }
        return "RawLogGroupList{" +
                "rawLogGroups=" + strBuilder.toString() +
                '}';
    }
}