package custom1;

class Case extends Exception
{
	public void password(String str) throws MinimumLengthException, AtleastoneSpecialCharacterException, AtleastOneUpperCaseLetter
	{
		int n = str.length();
		if(n<8) {
			throw new MinimumLengthException();
		}
		boolean f = false;
		boolean sp =false;
		for(int i=0; i<n; i++)
		{
			char ch = str.charAt(i);
			if(((int) ch>=65 ) && ((int)ch <=90 )) 
			{
				f=true ;
			}
			
			if(ch=='.') {
				sp=true;
			}else if(ch=='!')
			{
				sp=true;
			}
			else if(ch=='$')
			{
				sp=true;
			}
			else if(ch=='<')
			{
				sp=true;
			}else if(ch=='>')
			{
				sp=true;
			}
		}
		
		if(f==false)
		{
			throw new AtleastOneUpperCaseLetter();
		}
		else if(sp == false)
		{
			throw new AtleastoneSpecialCharacterException();
		}
		else 
		{
			System.out.println("Password is ok");
		}
	}
	
	
			
	
	
			
}
