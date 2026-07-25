lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

res = sorted(array, key = array.count, reverse = True)
print(str(res))

# Method 2

# resArray = []
# map={}
# for i in range(len(array)):
#     if array[i] in map.keys():
#         map[array[i]]+=1
#     else:
#         map[array[i]]=1
# for j in map:
#     for k in range(map[j]):
#         resArray.append(j)
# print(resArray)