class wideningByte
{
	public static void main(String[] args)
	{
	byte b1=100;
	short s1=b1;
	System.out.println(s1);

	/*CTE
	char ch=b1;
	System.out.println(ch);
	*/

	int i=b1;
	System.out.println(i);

	long l=b1;
	System.out.println(l);

	float f=b1;
	System.out.println(f);

	double d=b1;
	System.out.println(d);
	}
}