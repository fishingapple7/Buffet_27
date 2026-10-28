
a = 0
check = 0
while(a!=1):
    check = 0
    while(check!=1):
        hi = int(input("What year was the war of 1812 fought in? "))
        if hi==1812:
            print("Nice job! That could be answered by my little sister as well!")
            a = 1
            break
        else:
            print("How did you get that wrong? Try again.")
            check = 1