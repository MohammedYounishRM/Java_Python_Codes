lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = input(f"Enter {i+1} element :")
    array.append(element)
l = 0
for i in array:
    s=str(i)
    if s==s[::-1]:
        if len(s)>len(str(l)):
            l=i
print(l)