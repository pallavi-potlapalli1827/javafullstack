import java.util.*; 
class CharStuffing
{
public static void main(String args[])
{
Sample s=new Sample(); s.stuffing(); s.unStuffing();
 
}
}
class Sample
{
Scanner sc=new Scanner(System.in);
StringBuilder s=new StringBuilder(sc.next().toUpperCase()); void stuffing()
{
s.insert(0,"F");
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)=='E'||s.charAt(i)=='F'){ s.insert(i,"E");
i++;
}
}
System.out.println("After char stuffing the string is "+s.toString());
}
void unStuffing()
{
s.delete(0,1);
for(int i=1;i<s.length();i++)
{
if((s.charAt(i)=='E'&&s.charAt(i-1)=='E')||s.charAt(i)=='F')
{
s.delete(i-1,i);
}
}
System.out.println("After char unstuffing the string is "+s.toString());
}
}
