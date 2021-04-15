public class Bath extends HouseDecorator {
	Ev ev;
	
	public Bath(Ev ev) {
		this.ev = ev;
	}
	public String getDescription() {
		return ev.getDescription() + "bath-";
	}
	@Override
	public double cost() {
		return 800 + ev.cost();
	}
}