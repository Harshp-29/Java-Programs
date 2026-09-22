class narrowingDouble
{
	public static void main(String[] args)
	{
	double d=65.1212;
	
	float f1 = (float)d;
	System.out.println(f1);

	int i = (int)d;
 	System.out.println(i);

	char ch = (char)d;
	System.out.println(ch);

	short s = (short)d;
	System.out.println(s);

	long l = (long)d;
	System.out.println(l);

	byte b = (byte) d;
	System.out.println(b);

	}
}