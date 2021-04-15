import java.util.ArrayList;
import java.util.List;

public class Registration_Add {
	private Registration dokuman;
	private List< Remember_Registration > gecmisListesi= new ArrayList< Remember_Registration >();
	private List<Integer> reserves = new ArrayList<Integer>();
	
	public Registration_Add( Registration dokuman ) {
		this.dokuman = dokuman;
	}
	
	public void dokumanYaz( List<Ev> yeniIcerik ,int index , int reserve_no) {
		Remember_Registration hatirlayici = dokuman.hatirlayiciYarat();

		gecmisListesi.add( hatirlayici );
		yeniIcerik.remove(index);
		reserves.add(reserve_no);
		dokuman.icerikAta( yeniIcerik , index ,reserves);
		
		
	}
	
	public void geriAl( List<Ev> yeniIcerik ,int reserve_no) {
		
		int found=0,sira=gecmisListesi.size()-1;
		reserves=dokuman.get_reserve_no();
		for(int i=sira ; i>-1 ; i--)
		{
			System.out.println(reserves.get(i)+"-"+reserve_no);
			if(reserves.get(i)==reserve_no)
			{
				reserves.remove(i);
				found=1;
				break;
			}
			sira--;
			
		}
		if(found==1)
		{
			
			yeniIcerik=dokuman.icerikAl();
			Remember_Registration hatirlayici = gecmisListesi.remove(sira);
			dokuman.hatirlayiciAta( hatirlayici );
		}
	}
}