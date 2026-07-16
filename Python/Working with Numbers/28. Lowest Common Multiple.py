firstNumber = int(input("Enter the First Number:"))
secondNumber = int(input("Enter the Second Number:"))
number1 = firstNumber
number2 = secondNumber
hcf = 1

for i in range(1, min(firstNumber,secondNumber)+1):
    if((firstNumber % i == 0) and (secondNumber % i == 0)):
        hcf = i

lcm = (number1 * number2)/hcf

print(f"HCF of {firstNumber} and {secondNumber} is {lcm}")