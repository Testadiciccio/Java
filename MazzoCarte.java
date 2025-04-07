import java.security.SecureRandom;
public class MazzoCarte
{
	private static final SecureRandom casuale = new SecureRandom();
	private static final int NUMERO_CARTE = 52;
	
	private Carta[] mazzo = new Carta[NUMERO_CARTE];
	private int cartaCorrente = 0;
	
	public MazzoCarte()
	{
		String[] valori = {"Asso", "Due", "Tre", "Quattro", "Cinque", "Sei", "Sette", "Otto", "Nove", "Dieci", "Fante", "Donna", "Re"};
		String[] semi = {"Cuori", "Quadri", "Fiori", "Picche"};
		
		for(int x = 0; x < mazzo.length; x++)
		{
			mazzo[x] = new Carta(valori[x % 13], semi[x / 13]);
		}
	}
	
	public void mischia()
	{
		cartaCorrente = 0;
		
		for(int primo = 0; primo < mazzo.length; primo++)
		{
			int secondo = casuale.nextInt(NUMERO_CARTE);
			
			Carta temp = mazzo[primo];
			mazzo[primo] = mazzo[secondo];
			mazzo[secondo] = temp;
		}
	}
	
	public Carta mostraCarta()
	{
		if(cartaCorrente < mazzo.length)
			return mazzo[cartaCorrente ++];
		
		else
			return null;
	}
}