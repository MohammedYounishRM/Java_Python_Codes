print("Enter coefficients for ax^2 + bx + c = 0")
a = int(input("Enter the value of A :"))
b = int(input("Enter the value of B :"))
c = int(input("Enter the value of C :"))

d = ( -b + ((b ** 2) - 4 * a * c ) ** 0.5 ) / (2 * a)
e = ( -b - ((b ** 2) - 4 * a * c ) ** 0.5 ) / (2 * a)
f = (b ** 2) - 4 * a * c

if (f > 0):
    print("The roots are Real and Different")
    print("The roots are:", "Root 1:",d,"Root 2:", e)
elif (f == 0):
    print("The roots are Real and Equal")
    print("The roots are:", e)
else:
    print("The roots are Imaginary and Complex")