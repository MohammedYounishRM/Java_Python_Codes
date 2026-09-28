n = int(input("Enter a number :"))
count = ((n + 1) * n) // 2

for i in range(n, 0, -1):
    for j in range(1, i + 1):
        print(count, end="")
        count -= 1
    print()