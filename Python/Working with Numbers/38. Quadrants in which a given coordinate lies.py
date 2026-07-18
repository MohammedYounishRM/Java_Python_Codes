x = int(input("Enter the value of X-axis :"))
y = int(input("Enter the value of Y-axis :"))

if (x > 0 and y > 0):
    print("point (", x, ",", y, ") lies in the First(I) Quadrant")

elif (x < 0 and y > 0):
    print("point (", x, ",", y, ") lies in the Second(II) Quadrant")

elif (x < 0 and y < 0): 
    print("point (", x, ",", y, ") lies in the Third(III) Quadrant")

elif (x > 0 and y < 0):
    print("point (", x, ",", y, ") lies in the Fourth(IV) Quadrant")

elif (x == 0 and y == 0):
    print("point (", x, ",", y, ") lies at the Origin")

elif (x != 0 and y == 0):
    print("point (", x, ",", y, ") on X-axis")

elif (x == 0 and y != 0):
    print("point (", x, ",", y, ") on at Y-axis")