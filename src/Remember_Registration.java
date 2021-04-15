import java.util.ArrayList;
import java.util.List;

public class Remember_Registration {
private List<Ev> icerik ;

	public Remember_Registration( Registration dokuman ) {
		this.icerik = dokuman.icerikAl();
	}

	public List<Ev> icerikAl() {
		return icerik;
	}
}