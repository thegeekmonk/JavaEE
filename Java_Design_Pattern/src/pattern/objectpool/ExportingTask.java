package pattern.objectpool;

public class ExportingTask implements Runnable{
    
	private ObjectPool<ExportingProcess> pool;
	private int threadNo;
	
	public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo)
	{
		this.threadNo = threadNo;
		this.pool = pool;
	}
	
	public void run()
	{
		ExportingProcess exportingProcess = pool.borrowObject();
		
		System.out.println("Thread : "+threadNo+" Object with processNo "+exportingProcess.getProcessNo()+" Was borrowed");		
		
		pool.returnObject(exportingProcess);
		
		System.out.println("Thread : "+threadNo+" Object with processNo "+exportingProcess.getProcessNo()+" Was returned");
	}
}
