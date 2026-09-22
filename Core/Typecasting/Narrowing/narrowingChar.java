class narrowingChar
{
	public static void main(String[] args)
	{	
	char ch = 'H';

	short s = (short) ch;
	System.out.println(s);

	byte b = (byte) ch;
	System.out.println(b);

	}
}