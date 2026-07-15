year = int(input("Enter the year:"))

if(( year % 400 == 0 ) | (( year % 4 == 0 ) and ( year % 100 != 0 ))):
    print(year, "is Leap Year")
else:
    print(year, "is not a Leap year")

# Using Calendar Method
import calendar

year = int(input("Enter the year:"))

if calendar.isleap(year):
    print(year, "is Leap year")
else:
    print(year, "is not Leap year")