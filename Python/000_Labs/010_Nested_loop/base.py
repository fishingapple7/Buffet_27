print("Had to cut the while statement because I didn't want to fix all this :( ")
print("")
print("")

symbol = input("What symbol would you like to use? ")

width = 0
height = 0

width = int(input("What would you like the width to be? "))
height = int(input("What would you like the height to be? "))

for x in range(0,height):
    for x in range(0,width):
        print(symbol,end="")
    print("")