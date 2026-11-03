import random

a = int(input("How many numbers would you like to create? "))
alist = []
if(a>1):
    for i in range(0, a-1):
        hi = random.randrange(1,10)
        alist.append(hi)
        print(str(alist[i]) + ", ",end="")
    hi = random.randrange(1,10)
    alist.append(hi)
    print(str(alist[i+1]),end="")
    print("")
else:
    hi = random.randrange(1,10)
    alist.append(hi)
    print(str(alist[a-1]),end="")
    print("")



