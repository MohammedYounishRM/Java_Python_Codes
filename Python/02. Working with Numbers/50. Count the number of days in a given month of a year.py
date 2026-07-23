month = int(input("Enter the Month in number:"))
year = int(input("Enter the Year:"))
    
if(( month == 2 ) and (( year % 400 == 0 )  or (( year % 100 != 0 ) and ( year % 4 == 0 )))):
    print("Month", month, "of", year, "has 29 days")

elif( month == 2 ):
    print("Month", month, "of", year, "has 28 days")

elif( month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12 ):
    print("Month", month, "of", year, "has 31 days")

else:
    print("Month", month, "of", year, "has 30 days")