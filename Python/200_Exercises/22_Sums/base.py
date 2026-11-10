



yo = int(input("Please enter a number. "))
list = []
hi = 0
a = 0

for i in range(0,yo+1):
    list.append(i)
    hi = hi + list[i]
for y in range(0,yo-1):
    a = a + 1
    print(str(a) + " + ", end="")
a = a + 1
print(str(a))
print("The sum from 1 to " + str(yo) + " is: " + str(hi))
    







