import java.util.ArrayList;
import java.util.List;

public class Screen {
	
	List<Seat> seats = new ArrayList<>();
	int screenId;
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	

}
