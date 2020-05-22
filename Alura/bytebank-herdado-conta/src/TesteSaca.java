
public class TesteSaca {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(222, 333);
		cc.deposita(200);
		try {
			cc.saca(210);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(cc.getSaldo());
	}

}
