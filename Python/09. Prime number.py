number = int(input("Enter a number:"))
result = True

if( number < 2 ):
    result = False
for i in range(2,number):
    if( number % i == 0 ):
        result = False

if(result==True):
    print(number, "is a Prime Number")
else:
    print(number,"is not a Prime Number")