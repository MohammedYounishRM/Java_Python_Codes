lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

if array:
    sum = 0

    for element in array:
        sum += element
    print("The Sum of element is",sum)

else:
    print("No elements are entered")

# Method 2
# print(sum(array))