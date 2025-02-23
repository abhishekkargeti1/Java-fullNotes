package com.Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WebServerSimulation {

  public static void main(String[] args) {
    
    ExecutorService threadPool = Executors.newFixedThreadPool(3);
    
    System.out.println("Server started , ready to process requestes...");
    
    for(int i=1 ; i<=10 ; i++)
    {
      ClientRequesthandler task = new ClientRequesthandler(i);
      threadPool.execute(task);
    }
    
    threadPool.shutdown();
    
    try
    {
      if(!threadPool.awaitTermination(10, TimeUnit.SECONDS))
      {
        threadPool.shutdownNow();
      }
    }
    catch (InterruptedException e) {
      
      threadPool.shutdownNow();
    }
    
    System.out.println("Server Has Shut down");
  }

}