lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

if array:
    for element in array:
        reversed_arr = array[::-1]
    print("The Reverse of array is",reversed_arr)

else:
    print("No elements are entered")