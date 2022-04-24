import java.io.*;
import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class lexical
{
	public static boolean findnum(String x)
	{
		boolean numeric ;
		numeric = x.matches("-?\\d+(\\.\\d+)?");
		if(numeric)
		return true;
		else
		return false;
	}
	public static boolean findop(String x) 
	{
		String operators[] ={"+","-","/","*","="};
		for(int i = 0; i<operators.length; i++)
		{
			if(operators[i].equals(x))
			// Traverse all operators if operator in this and the string match then true
			return true;
		}
		return false;
	}
	public static boolean findkey(String x) 
	{
		String keys[] = {"main","int","double","float","char","String","long","boolean","byte","short"};
		for(int i = 0; i<keys.length; i++)
		{
			if(keys[i].equals(x))
			return true;
		}
		return false;
	}
	public static boolean findsep(String x) 
	{
		String sep[] ={"(",")",",","[","]","{","}",";"};
		for(int i = 0; i<sep.length; i++)
		{
			if(sep[i].equals(x))
			return true;
		}
		return false;
	}
	public static boolean check(String x)
	{
		boolean temp ;
		temp = x.matches("^[a-zA-Z]{1}");
		if(temp)
		return true;
		else
		return false;
	}
	public static void main(String args[])throws IOException
	{
        File f = new File("C:\\Users\\ASUS\\Desktop\\11 Vowel\\ABC.txt");
		Scanner sc= new Scanner(f);
        if (f.exists()) {
            while(sc.hasNext())
            {
                String b=sc.next();
                if(findop(b)==true)
                System.out.println(b+" is an operator.");
                else if(findkey(b)==true)
                System.out.println(b+" is a keyword.");
                else if(findsep(b)==true)
                System.out.println(b+" is a seperator.");
                else if(findnum(b)==true)
                System.out.println(b+" is a constant.");
                else if (check(b)==true)
                System.out.println(b+" is a variable.");
                else
                System.out.println(b+" is not a Valid identifier!");
            }
          } else {
            System.out.println("The file does not exist.");
          }
	}
}