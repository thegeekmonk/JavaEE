package pattern.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {
	private ConcurrentLinkedQueue<T> pool;
	private ScheduledExecutorService executorService;
	
	public ObjectPool(final int minObject)
	{
		initialize(minObject);
	}
	
	public ObjectPool(final int minObject,final int maxObject,final long validationInterval)
	{
		initialize(minObject);
		
		executorService = Executors.newSingleThreadScheduledExecutor();
		
		executorService.scheduleWithFixedDelay(new Runnable() //annonymous class
				{ 
			       @Override
			       public void run()
			       {
			    	   int size = pool.size();
			    	   
			    	   if(size < minObject)
			    	   {
			    		   int sizeToBeAddeed = minObject - size;
			    		   
			    		   for(int i = 0;i < sizeToBeAddeed;i++)
			    		   {
			    			   pool.add(createObject());
			    		   }
			    	   }
			    	   else if(size > maxObject)
			    	   {
			    		   int sizeToBeRemoved = size - maxObject;
			    		   
			    		   for(int i = 0;i < sizeToBeRemoved;i++)
			    		   {
			    			   pool.poll();
			    		   }
			    		   
			    	   }			    	   
			       }
				},validationInterval,validationInterval,TimeUnit.SECONDS);			
		
	}
	
	protected abstract T createObject();
	
	public T borrowObject()
	{
		T Object;		
		if((Object = pool.poll()) == null)
		{
			Object = createObject();
		}
		
		return Object;
	}
	
	public void returnObject(T Object)
	{
		if(Object == null)
			return;
		else
			this.pool.offer(Object);
	}
	
	public void shutdown()
	{
		if(executorService != null)
			executorService.shutdown();
	}
		
	public void initialize(final int minObject)
	{
		for(int i = 0;i < minObject;i++)
		{
			pool.add(createObject());
		}
	}

}
