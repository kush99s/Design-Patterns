package Implementation;

public class RadioDeviceImpl implements Device {

	public RadioDeviceImpl() {
		
	}

	@Override
	public void isEnabled() {

	}

	@Override
	public void enable() {
		System.out.println("Radio is working");
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getVolume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVolume(int percent) {
		System.out.println("Volume set: "+percent);

	}

	@Override
	public void getChannel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub

	}

}
