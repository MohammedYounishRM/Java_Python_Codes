userInput = int(input("Enter the Length of digits to Add:"))
total = 0
for i in range(1, userInput+1):
    total +=i
print(total)

#Formula Method
print(int(userInput*(userInput+1)/2))