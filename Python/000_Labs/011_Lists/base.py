import random

hi = 0
n = 0
i = 0
k = 0
m = ""
m2 = 0
a = ""
n2 = 0
jokelist = ["why did the chicken cross the road... To get to the other side 😂", "Knock knock?, who's there? cow co- MOOOOOOOOOO 😂", "What did the cat say when it stubbed its toe?.... MEOOWWWW 😂","What does ketchup say during a race?.... KETCHUPP 😂", "Why was 6 afraid of 7?.... Because 7, 8 ,9 😂"]
while(n==0):  
    if(n==1):
        break
    n = 0
    hi = (random.randrange(0,5))
    while(n==0):
        i = input("Would you like the joke machine to tell you a joke? (Yes, yes, y, or Y; No, no, N, or n) ")
        if(i=="yes" or i=="Yes" or i=="y" or i=="Y"):
            n = 2
        elif(i=="No" or i=="no" or i=="n" or i=="N"):
            n = 1
        else:
            print("Please input one of the inputs above.")
    if(n==2):
        print(jokelist[hi])
        n = 0
print("Thank you for using the joke machine.")

    

