package com.example.financialindexes.domain;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class TickRepository {

    private final Map<Long, Tick> ticks = new ConcurrentHashMap<>();

    /**
     * Persist a tick.
     * */
    public void save(Tick tick) {
        ticks.put(tick.getTimestamp(), tick);
    }

    /**
     * Retrieve a tick by its timestamp.
     * */
    public Tick findByTimestamp(long timestamp) {
        return ticks.get(timestamp);
    }
}