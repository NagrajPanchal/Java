import java.util.Scanner;
public class Switch
{

	public static void main(String[] args)
	{
		int a;
        System.out.println("Please Choose instruments options");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        for (int i = 0; i < 1; i++ )
        {
String musicInstrument;
// switch statement with int data type
switch (a)
{
case 1:
musicInstrument = "Guitar";
break;
case 2:
musicInstrument = "Piano";
break;
case 3:
musicInstrument = "Drums";
break;
case 4:
musicInstrument = "Flute";
break;
case 5:
musicInstrument = "Ukelele";
break;
case 6:
musicInstrument = "Violin";
break;
case 7:
musicInstrument = "Trumpet";
break;
default:
musicInstrument = "Invalid";
break;
}
System.out.println(musicInstrument);
}
		 
	}

}
