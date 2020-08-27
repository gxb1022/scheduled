package com.example.scheduled;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class Task {

    private static final int FOURTEEN_MIN = 3 * 60 * 1000;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");

    @Scheduled(cron = "0 */1 * * * *")
    @SchedulerLock(name = "scheduledTaskName", lockAtMostFor = FOURTEEN_MIN, lockAtLeastFor = FOURTEEN_MIN)
    @Async("taskExecutor")
    public void cc(){
        log.info("当前时间{}",sdf.format(new Date()));
        Thread t = Thread.currentThread();
        String name = t.getName();
        log.info("当前线程名称{}",name);
        System.out.println("ceshi===================");
    }

    @Scheduled(cron = "0 */1 * * * *")
    @SchedulerLock(name = "scheduledTaskName", lockAtMostFor = FOURTEEN_MIN, lockAtLeastFor = FOURTEEN_MIN)
    @Async("taskExecutor")
    public void bb(){
        log.info("当前时间{}",sdf.format(new Date()));
        Thread t = Thread.currentThread();
        String name = t.getName();
        log.info("当前线程名称{}",name);
        System.out.println("ceshi2===================");
    }


    @Scheduled(cron = "0 */1 * * * *")
    @Async("taskExecutor")
    public void vv(){
        log.info("当前时间{}",sdf.format(new Date()));
        Thread t = Thread.currentThread();
        String name = t.getName();
        log.info("当前线程名称{}",name);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}
