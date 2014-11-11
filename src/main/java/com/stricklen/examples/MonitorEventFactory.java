package com.stricklen.examples;

import com.lmax.disruptor.EventFactory;


public class MonitorEventFactory implements EventFactory<MonitorEvent> {

    @Override
    public MonitorEvent newInstance() {
        return new MonitorEvent("test message");
    }
}
