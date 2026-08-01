size = int(input("Enter the length of an Array:"))
array = []
for i in range(size):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

total = sum(array)
leftSideAdd = 0
found = False

for i,number in enumerate(array):
    rightSideAdd = total - leftSideAdd - number

    if( leftSideAdd == rightSideAdd ):
        print("The index", i, "is the Equilibrium Index")
        break

    leftSideAdd += number
else:
    print("no equilibrium found")