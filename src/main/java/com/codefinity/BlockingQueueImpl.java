package com.codefinity;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueueImpl {
    private final List<Object> queue = new LinkedList();
    private int limit = 10;

    public BlockingQueueImpl() {
    }

    public BlockingQueueImpl(int limit){
        this.limit = limit;
    }

    public synchronized void put(Object item) throws InterruptedException  {
        //TODO: Implement a put() method that replicates the behavior of the same method in BlockingQueue
    }


    public synchronized Object take() throws InterruptedException {
        //TODO: Implement a take() method that replicates the behavior of the same method in BlockingQueue
        return queue.remove(0);
    }

    public Integer size() {
        return queue.size();
    }
}
