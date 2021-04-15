import java.util.List;

public abstract class Islev {
	protected Islev sonrakiIslev;
	
	protected Islev sonrakiniAyarla( Islev sonraki ) {
		sonrakiIslev = sonraki;
		return sonraki;
	}
	
	protected void calistir( List<Ev> islemVerisi , List<String> request) {
		int result=isleviYerineGetir( islemVerisi , request );
		System.out.println(result);
		if(result==1)
			return;
		if ( sonrakiIslev != null ) 
		{
			sonrakiIslev.calistir( islemVerisi , request );
		}
	}
	
	protected abstract int isleviYerineGetir( List<Ev> islemVerisi , List<String> request);
}