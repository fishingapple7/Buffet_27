no = ""
a = 0
add = 0
mult = 0
sub = 0
div = 0

while(no!="yes" or no!="Yes" or no!="y" or no!="Y"):
    add = 0
    mult = 0
    sub = 0
    div = 0
    a = 0
    if(no == "yes" or no == "Yes" or no == "y" or no == "Y"):
        break 
    else:
        n1 = int(input("Please enter a number: "))
        while(a!=1):
            op = input("Please enter an operation: ")
            if(op == "*"):
                mult = 1
                a = 1
            elif(op == "/"):
                div = 1
                a = 1
            elif(op == "+"):
                add = 1
                a = 1
            elif(op == "-"):
                sub = 1
                a = 1
            else:
                print("Enter an operation.")
        n2 = int(input("Please enter a second number: "))
        if add == 1:
            total = n1+n2
        elif sub == 1:
            total = n1-n2
        elif mult == 1:
            total = n1*n2
        elif div == 1:
            total = n1/n2
        print(total)
        no = input("If you would like to quit the calculator enter yes or Yes or y or Y. ")




