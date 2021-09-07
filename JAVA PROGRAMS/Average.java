public class Average
{
public static void main(String[]args)
{
int sum=0;
int average;
int count=0;
for(int i=1;i<=5;i++)
{
sum+=i;
count++;
}
average=sum/count;
System.out.println(average);
}
}