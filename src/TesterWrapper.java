
public class TesterWrapper {

	public TesterWrapper() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Integer i = new Integer("546");
		String x = Integer.toOctalString(10);
		System.out.println(x);
		
		Boolean b = new Boolean("true");
		boolean resultadoAnd = Boolean.logicalAnd(true, true);
		System.out.println(resultadoAnd);
		
		Long l = new Long(235325);
		Long longer = l.MAX_VALUE;
	}

}
