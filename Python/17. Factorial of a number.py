factValue = int(input("Enter the value for Factorial:"))
res = 1
for i in range(1,factValue+1):
    res *= i

print("The factorial of", factValue, "is",res) 