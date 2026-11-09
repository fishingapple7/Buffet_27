


bro = 0


while(bro==0):
    if(bro==1):
        break
    x = int(input("Please enter a year you would like to check! "))
    y = (x)%100
    if y <= 0:
        y = (x+400)%400
    else:
        y = x%4
    if y == 4:
        print(str(x) + " was a leap year!")
    elif y == 0:
        print(str(x) + " was a leap year!")
    elif y == 8:
        print(str(x) + " was a leap year!")
    else:
        print(str(x) + " was not a leap year.")
    print("")
    yo = input("Would you like to stop checking years? (y, Y, yes, Yes) ")
    if(yo == "y" or yo == "Y" or yo == "yes" or yo == "Yes"):
        bro = 1
print("")
print("bye") 