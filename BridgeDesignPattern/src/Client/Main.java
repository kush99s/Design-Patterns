package Client;
import Abstraction.AdvanceRemote;
import Abstraction.Remote;
import Implementation.Device;
import Implementation.RadioDeviceImpl;
import Implementation.TvDeviceImpl;

public class Main {

	public static void main(String args[]) {
		Device tv = new TvDeviceImpl();
		Device radio = new RadioDeviceImpl();
		
		Remote remote = new Remote(radio);
		AdvanceRemote advanceRemote = new AdvanceRemote(tv);
		
		remote.togglePower();
		remote.volumeDown();
		advanceRemote.setChannel(100);
		advanceRemote.togglePower();
	}

}
