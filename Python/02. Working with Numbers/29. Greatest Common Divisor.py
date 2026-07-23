firstNumber = int(input("Enter the First Number:"))
secondNumber = int(input("Enter the Second Number:"))
number1 = firstNumber
number2 = secondNumber

while (firstNumber != secondNumber):
    if (firstNumber > secondNumber):
        firstNumber -= secondNumber
    else:
        secondNumber -= firstNumber

print("GCD of", number1, "and", number2, "is", firstNumber)