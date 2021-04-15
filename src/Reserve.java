import java.util.ArrayList;
import java.util.List;

public class Reserve extends Islev {
	private Registration_Add program;
	
	public Reserve(Registration_Add program) {
		this.program=program;
	}
	public void setList(List<String> liste1 , List<Integer> liste2 , List<String> liste3 , int baslangic)
	{
		int hold,rank,first=1;
		boolean var;
		for(int i=baslangic ; i<liste3.size() ; i++){
			var=liste1.contains(liste3.get(i));
			if(var==false)
			{
				liste1.add(liste3.get(i));
				liste2.add(first);
			}
			else if(var==true)
			{
				rank=liste1.indexOf(liste3.get(i));
				hold=liste2.get(rank);
				hold++;
				liste2.set(rank, hold);//setleme i�lemi
			}
		}
	}
	@Override
	protected int isleviYerineGetir( List<Ev> islemVerisi , List<String> request) {
		if(request.get(0).equals("reserve")){
			int sira,ev_uygun_degil=0,index=0,control=0,reserve_no;
			List<String> requestElement = new ArrayList<String>();
			List<Integer> requestNumber = new ArrayList<Integer>();
			List<String> handleElement = new ArrayList<String>();
			List<Integer> handleNumber = new ArrayList<Integer>();
			List<String> tempList = new ArrayList<String>();
			double maxCost=0,price_offer,home_price;
			String temp[];
			price_offer=Integer.parseInt(request.get(2));
			reserve_no=Integer.parseInt(request.get(1));
			setList(requestElement, requestNumber, request,3);
			
			for(int i=0 ; i<islemVerisi.size() ; i++ )
			{
				home_price= islemVerisi.get(i).cost();
				temp=islemVerisi.get(i).getDescription().split("-");
				for(int j=0;j<temp.length;j++)
					tempList.add(temp[j]);
				setList(handleElement,handleNumber,tempList,0);				
				for(int j=0 ; j<requestElement.size() ; j++ )
				{
					sira=handleElement.indexOf(requestElement.get(j));
					if(sira!=-1)
					{
						if(handleNumber.get(j)<requestNumber.get(sira))
						{
							ev_uygun_degil=-1; 
							break;
						}
					}			
				}
				if(ev_uygun_degil!=-1)
				{
					if(price_offer>=home_price && home_price>maxCost)
					{
						maxCost=home_price;
						index=i;
						control=1;
					}
				}
				ev_uygun_degil=0;
				handleElement.removeAll(handleElement);
				handleNumber.removeAll(handleNumber);
				tempList.removeAll(tempList);
			}
			if(control==1)
			{
				program.dokumanYaz( islemVerisi , index , Integer.parseInt(request.get(1)));
			}
			System.out.println( maxCost+"\n" );
			return 1;
		}
		 
		else{
			System.out.println("bu reserve i�levi de�ildir...");
			return -1;
		}
	}
}