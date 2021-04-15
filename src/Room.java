public class Room extends HouseDecorator {
	Ev ev;
	
	public Room(Ev ev) {
		this.ev = ev;
	}
	
	public String getDescription() {
		return ev.getDescription() + "room-";
	}
	@Override
	public double cost() {
		return 1000 + ev.cost();
	}
}