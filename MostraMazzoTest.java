public class MostraMazzoTest
{
	public static void main(String[] args)
	{
		MazzoCarte ilMazzo = new MazzoCarte();
		ilMazzo.mischia();
		
		for(int i = 1; i <= 52; i++)
		{
			System.out.printf("%-19s", ilMazzo.mostraCarta());
			
			if(i % 4 == 0)
				System.out.println();
		}
	}
}