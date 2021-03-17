package pattern.objectpool;

public class ExportingProcess {
	
	public long processNo;
	
	public ExportingProcess(long processNo)
	{
		this.processNo = processNo;
		
		System.out.println("Object with process No : "+processNo+" was created");
	}
	
	public long getProcessNo()
	{
		return processNo;
	}
}
