package com.servicefeign.servicefeign.service;

import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
