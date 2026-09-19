num = int(input("Enter a number :"))

for i in range(0, num):
    for j in range(0, num-i-1):
        print(" ", end="")
    for j in range(0, i+1):
        print("* ",end="")
    print()

# for i in range(1, num+1):
#     print(" " * (num-i)+ "* "*i)