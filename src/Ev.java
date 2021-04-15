import java.util.ArrayList;
import java.util.List;
public abstract class Ev {
	String description = "";
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}