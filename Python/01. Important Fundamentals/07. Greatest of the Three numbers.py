firstValue = int(input("Enter the First number:"))
secondValue = int(input("Enter the Second number:"))
thirdValue = int(input("Enter the Third number:"))

if( firstValue > secondValue ):
    if( firstValue > thirdValue ):
        print(firstValue, "is Greater")
elif( secondValue > firstValue ):
    if( secondValue > thirdValue ):
        print(secondValue, "is Greater")
else:
    print(thirdValue, "is Greater")