import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {
	
		
	
	public void read_file(/*String file_name*/) throws IOException
	{
		List<Ev> houseList = new ArrayList<Ev>();
		List<String> process = new ArrayList<String>();
		String elements[],elements2[];
		FileReader reader=new FileReader("a.txt");
		BufferedReader hold=new BufferedReader(reader);
		int house_count=Integer.parseInt(hold.readLine());
		for(int i=0;i<house_count;i++)
		{
			Ev ev = new Build();
			String line=hold.readLine();
		
			elements=line.split(" ");
			for(int j=0;j<elements.length;j++)
			{
				if(elements[j].equals("room"))
					ev = new Room(ev);
				else if(elements[j].equals("bath"))
					ev = new Bath(ev);
				else if(elements[j].equals("wc"))
					ev = new Wc(ev);
				else if(elements[j].equals("pool"))
					ev = new Pool(ev);
			}
			houseList.add(ev);
		}

		
		Registration dokuman = new Registration();
		Registration_Add program =new Registration_Add( dokuman );
		List<Integer> start= new ArrayList<Integer>();
		dokuman.icerikAta( houseList , -1 ,start );
		Islev chain,chain1;
		chain1 = new Rent();
		chain = chain1.sonrakiniAyarla( new Buy() );
		chain = chain.sonrakiniAyarla( new Reserve(program) );
		chain = chain.sonrakiniAyarla( new Cancel(program) );

		int process_count=Integer.parseInt(hold.readLine());
		for(int i=0;i<process_count;i++)
		{
			String line=hold.readLine();
			elements2=line.split(" ");
			for(int j=0;j<elements2.length;j++)
			{
				process.add(elements2[j]);
			}
			chain.calistir(houseList,process);
		}
		
	}
	public static void main(String args[]) {
		Main m = new Main();
		try {
			m.read_file(/*args[1]*/);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Ev ev = new Build();
		
		ev = new Room(ev);
		ev = new Room(ev);
		ev = new Room(ev);
		ev = new Room(ev);
		ev = new Bath(ev);
		ev = new Bath(ev);
		System.out.println(ev.getDescription()
				+ " $" + ev.cost());
		Ev ev3 = new Build();
		ev3 = new Bath(ev3);
		ev3 = new Bath(ev3);
		ev3 = new Bath(ev3);
		ev3 = new Bath(ev3);
		
		ev3 = new Room(ev3);
		ev3 = new Room(ev3);
		ev3 = new Room(ev3);
		
		System.out.println(ev3.getDescription()
				+ " $" + ev3.cost());
		Ev ev4 = new Build();
		ev4 = new Bath(ev4);
		ev4 = new Bath(ev4);
		ev4 = new Room(ev4);
		ev4 = new Room(ev4);
		ev4 = new Room(ev4);
		ev4 = new Room(ev4);
		ev4 = new Room(ev4);
		ev4 = new Room(ev4);
		
		System.out.println(ev4.getDescription()
				+ " $" + ev4.cost());
		
		
		List<Ev> evList = new ArrayList<Ev>();
		evList.add(ev3);
		evList.add(ev);
		evList.add(ev4);
		
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("reserve");
		arraylist.add("5");
		arraylist.add("10000");
		arraylist.add("room");
		arraylist.add("bath");
		List<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("reserve");
		arraylist2.add("1");
		arraylist2.add("7500");
		arraylist2.add("room");
		arraylist2.add("room");
		arraylist2.add("room");
		arraylist2.add("bath");
		arraylist2.add("bath");
		List<String> arraylist3 = new ArrayList<String>();
		arraylist3.add("cancel");
		arraylist3.add("1");
		
		Registration d�k�man = new Registration();
		Registration_Add program =new Registration_Add( d�k�man );
		List<Integer> start= new ArrayList<Integer>();
		d�k�man.i�erikAta( evList , -1 ,start );
		
		��lev zincir1, zincir2, zincir;
		// Zincir 1 i olu�tur. A -> C -> B
		zincir1 = new Buy();
		zincir = zincir1.sonrakiniAyarla( new Rent() );
		zincir = zincir.sonrakiniAyarla( new Reserve(program) );
		zincir = zincir.sonrakiniAyarla( new Cancel(program) );
		//zincir1.�al��t�r(evList,arraylist);
		zincir1.�al��t�r(evList,arraylist2);
		for(int i=0;i<evList.size();i++)
			System.out.println(evList.get(i).getDescription());
		System.out.println("main "+d�k�man.i�erikAl().size());
		zincir1.�al��t�r(evList,arraylist);
		for(int i=0;i<evList.size();i++)
			System.out.println(evList.get(i).getDescription());
	
		zincir1.�al��t�r(evList,arraylist3);
		for(int i=0;i<evList.size();i++)
			System.out.println("main "+d�k�man.i�erikAl());*/
		
		
		
	
	}
}