number = int(input("Enter a number to check Harshad:"))
originalNumber = number
sum = 0

while(number != 0):
    digit = number % 10
    sum += digit
    number //=10

print(f"{originalNumber} is a Harshad number" if(sum != 0 and originalNumber % sum == 0) else f"{originalNumber} is not a Harshad number")    