firstNumber = int(input("Enter the First Number:"))
secondNumber = int(input("Enter the Second Number:"))
hcf = 1

for i in range(1, min(firstNumber,secondNumber)+1):
    if((firstNumber % i == 0) and (secondNumber % i == 0)):
        hcf = i

print(f"HCF of {firstNumber} and {secondNumber} is {hcf}")