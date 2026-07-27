lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = input(f"Enter {i+1} element :")
    array.append(element)

res = []
for j in array:
    if j not in res:
        res.append(j)

print("The Count of Distinct elements are",len(res))