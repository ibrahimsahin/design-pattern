import java.util.List;

public class Cancel extends Islev {
	private Registration_Add program;
	
	public Cancel(Registration_Add program) {
		this.program=program;
	}
	@Override
	protected int isleviYerineGetir(List<Ev> islemVerisi, List<String> request) {
		program.geriAl( islemVerisi ,Integer.parseInt(request.get(1)));
		return 1;
	}

}