lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

even = 0
odd = 0
for i in range(0, lengthOfArray):
    if (array[i] % 2 == 0):
        even += 1
    else:
        odd += 1

print("Even Elements count :", even, " andOdd Elements count :", odd)