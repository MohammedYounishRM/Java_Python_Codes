number = int(input("Enter a number to check Armstrong:"))
originalNumber = number
length = len(str(number))
add = 0

while(number != 0):
    digit = number % 10
    number //= 10
    add += pow(digit,length)

print(f"{originalNumber} is Armstrong" if( add == originalNumber ) else f"{originalNumber} is not Armstrong")