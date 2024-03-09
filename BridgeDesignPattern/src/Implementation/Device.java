package Implementation;

public interface Device {
	
	public void isEnabled();
	public void enable();
	public void disable();
	public void getVolume();
	public void setVolume(int percent);
	public void getChannel();
	public void setChannel(int channel);
	
}
