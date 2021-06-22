import java.util.Random;
class EmpWageBuilder
{
public static void main(String[] args)
{
System.out.println("Welcome to Employee Wage Computation");
Random random = new Random();
int random1 = random.nextInt(2);
if(random1 == 1)
System.out.println("Employee is Absent");
else
System.out.println("Employee is Present");
}
}
