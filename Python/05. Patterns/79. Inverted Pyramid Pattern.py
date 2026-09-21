num = int(input("Enter A Number:"))

for i in range(num, 0, -1):
    for j in range(0, num-i):
        print(" ",end="")
    for k in range(0, (2*i-1)):
        print("*",end="")
    print()