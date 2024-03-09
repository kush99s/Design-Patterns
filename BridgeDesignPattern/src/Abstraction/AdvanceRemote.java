package Abstraction;

import Implementation.Device;

public class AdvanceRemote extends Remote{

	public AdvanceRemote(Device device) {
		super(device);
	}
	
	public void setChannel(int channel) {
		device.setChannel(channel);
	}
	
	public void getChannel() {
		device.getChannel();
	}

}
