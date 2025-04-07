public class Carta
{
	private final String valore;
	private final String seme;
	
	public Carta(String valoreCarta, String valoreSeme)
	{
		valore = valoreCarta;
		seme = valoreSeme;
	}
	
	public String toString()
	{
		return valore + " di " + seme;
	}
}