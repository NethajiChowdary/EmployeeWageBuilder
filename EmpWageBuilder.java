import java.util.Random;
class EmpWageBuilder
{
public static void main(String[] args)
{
int full_day =8;
int wage_per_hour=20;
int daily_wage;
int part_time=4;
int num_of_workingdays=20;
int max_hrs_in_month=100;
int emphrs=0, totalEmphrs=0, totalWorkingdays=0;
System.out.println("Welcome to Employee Wage Computation");
while(totalEmphrs<=max_hrs_in_month && totalWorkingdays<num_of_workingdays)

{
totalWorkingdays++;

Random random = new Random();
int random1 = random.nextInt(3);

switch(random1)
{
case 1:
emphrs=8;
break;

case 2:
emphrs=4;

break;
default:
emphrs=0;
}
totalEmphrs=emphrs;
System.out.println("Day#: "+totalWorkingdays +" Emp hr: "+emphrs);
}
int totalEmpWage = totalEmphrs * wage_per_hour;
System.out.println("Total Emp Wage: " + totalEmpWage);
}
}
