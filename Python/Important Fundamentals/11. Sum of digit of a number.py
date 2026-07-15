digit = int(input("Enter the Number to sum:"))
sum = 0
while(digit != 0):
    sum += digit % 10
    digit = digit // 10
print("the Sum of the digit is :", sum)