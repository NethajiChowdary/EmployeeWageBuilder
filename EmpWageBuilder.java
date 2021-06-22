import java.util.Random;
class EmpWageBuilder
{
public static void main(String[] args)
{
int full_day =8;
int wage_per_hour=20;
int daily_wage;
int part_time=4;

System.out.println("Welcome to Employee Wage Computation");
Random random = new Random();
int random1 = random.nextInt(2);
if(random1 == 1)
{
System.out.println("Employee is Present");
daily_wage=full_day*wage_per_hour;
System.out.println("Employee wage is " +daily_wage);
}
else if(random1 == 2)
{
System.out.println("Employee is Part time");
daily_wage=part_time*wage_per_hour;
System.out.println("Employee wage is " +daily_wage);
}
else
System.out.println("Employee is Absent");
}
}
