import java.util.ArrayList;
import java.util.List;
public class Registration {
	private List<Ev> icerik;
	private List<Integer> reserve_no;
	
	public List<Ev> icerikAl() {
		return icerik;
	}
	
	public List<Integer> get_reserve_no(){
		return reserve_no;
	}
	
	public void icerikAta( List<Ev> icerik , int index ,List<Integer> reserve_no) {
		if(index!=-1){
			this.icerik = icerik;
			this.reserve_no = reserve_no;
		}
	}
	
	public Remember_Registration hatirlayiciYarat() {
		
		return new Remember_Registration( this );
	}
	
	public void hatirlayiciAta( Remember_Registration hatirlayici) {
		this.icerik = hatirlayici.icerikAl();
	}
}