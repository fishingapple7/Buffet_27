length = int(input("Please enter the length of your line: "))

hov = ""
hori = 0
vert = 0

while(hov!="horizontal" or hov!="Horizontal" or hov!="vertical" or hov!="Vertical"):
    if(hov=="horizontal" or hov=="Horizontal"):
        hori = 1
        break
    elif(hov=="vertical" or hov=="Vertical"):
        vert = 1
        break
    hov = input("Please enter if you want the line to be horizontal or vertical: ")

if(hori==1):
    for x in range(0,length):
        print("*",end="")
elif(vert==1):
    for x in range(0,length):
        print("*")



