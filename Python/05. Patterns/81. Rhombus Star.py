r = int(input("Enter the no of row:"))
c = int(input("Enter the no of column:"))

for i in range(r):
    for j in range(i):
        print(" ", end="")
    for k in range(c):
        print("*", end="")
    print()