package com.stricklen.examples;


import com.lmax.disruptor.EventHandler;

public class MonitorEventHandler implements EventHandler<MonitorEvent> {
    @Override
    public void onEvent(MonitorEvent monitorEvent, long l, boolean b) throws Exception {
        System.out.println(monitorEvent.getTimestamp() + "-" + monitorEvent.getMessage());
    }
}
