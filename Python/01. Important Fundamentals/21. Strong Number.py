number = int(input("Enter a number to check Strong:"))
originalValue = number
add = 0
while(number != 0):
    digit = number % 10
    fact = 1

    for i in range(1,digit):
        fact *= i
    add += fact
    number //= 10

if(add == originalValue):
    print(originalValue, "is a Strong Number")
else:
    print(originalValue,"is not a Strong Number")