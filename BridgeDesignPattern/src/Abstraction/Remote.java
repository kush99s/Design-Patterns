package Abstraction;

import Implementation.Device;

public class Remote {

	Device device;
	public Remote(Device device) {
		this.device = device;
	}
	
	public void togglePower() {
		device.enable();
	}
	
	public void volumeUp() {
		device.setVolume(50);
	}

	public void volumeDown() {
		device.setVolume(25);
	}

}
