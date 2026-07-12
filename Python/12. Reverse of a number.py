digit = int(input("Enter the Number to Reverse:"))
originalDigit = digit #this line is used for providing the same digit value to the num to str convertion(because the digit is modified each time by while loop)
reverse = 0
remaining = 0

while ( digit != 0 ):
    remaining = digit % 10
    reverse = reverse * 10 + remaining
    digit //= 10

print("The Reverse of the Number is", reverse)

# Simple int -> str convert method
print(str(originalDigit)[::-1])