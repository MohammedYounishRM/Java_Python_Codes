import math

students = int(input("Enter the number of Students :"))
seats = int(input("Enter the number of Seats : "))

res = math.factorial(students)/math.factorial(students-seats)

print("Permutation is ",res)

# Method 2
# if (students < 0 or seats < 0):
#     print("Number of people and seats must be non-negative")
# elif seats > students:
#     print("Seats cannot be greater than the number of people. Total ways: 0")
# else:
#     totalWays = 1
#     for i in range(seats):
#         totalWays *= (students - i)
#     print(f"Total possible arrangements: {totalWays}")