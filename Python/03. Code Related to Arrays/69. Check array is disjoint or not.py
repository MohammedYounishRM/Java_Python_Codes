size1 = int(input("Enter the length of an Array 1:"))
array1 = []
for i in range(size1):
    element = int(input(f"Enter {i+1} element :"))
    array1.append(element)

size2 = int(input("Enter the length of an Array 2:"))
array2 = []
for j in range(size2):
    element = int(input(f"Enter {j+1} element :"))
    array2.append(element)

disjoint = set(array1).isdisjoint(set(array2))

if ( disjoint ):
    print("The entered Arrays are Disjoint")
else:
    print("The entered Arrays are not disjoint")

# Method 2 

# for i in range(0,size1):
#         for j in range(0,size2):
#             if( array1[i] == array2[j] ):
#                 flag = False
#         flag = True
# if (flag):
#     print("The Arrays are disjoint")
# else:
#     print("The arrays are not disjoint")