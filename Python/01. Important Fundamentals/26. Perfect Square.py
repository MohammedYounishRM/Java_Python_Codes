number = int(input("Enter a number to check Perfect Square: "))
root = int(number ** 0.5)

print(f"{number} is Perfect Square" if(root * root == number) else f"{number} is Not Perfect Square")