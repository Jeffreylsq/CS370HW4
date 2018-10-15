
public class Fork {

	private boolean pick;
	
	public Fork()
	{
		pick = false;
	}
	
	public void pickUp() throws InterruptedException
	{
		synchronized(this)
		{
			if(pick)
			{
				wait(); //fork was used by someone 
			}
				pick = true;		
		}
	}
	
	public void putDown()throws InterruptedException
	{
		synchronized(this)
		{
			pick = false;
			notifyAll();
		}
	}
}
