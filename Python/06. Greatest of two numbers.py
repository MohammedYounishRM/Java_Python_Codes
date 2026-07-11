firstValue = int(input("Enter the First number:"))
secondValue = int(input("Enter the Second number:"))

if( firstValue < secondValue ):
    print(secondValue, "is Greater")
elif( firstValue > secondValue ):
    print(firstValue, "is Greater")
else:
    print("Both are Equal values")

# Build-in max function
print(max(firstValue, secondValue))