import requests
#joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()

yo = int(input("Please enter if you want a 1 part joke or 2. "))

# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself
if yo == 1:
    hi = int(input("Please enter the amount of jokes you want. "))
    for i in range(1,hi+1):
        print("")
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        print(joke["joke"])

# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

if yo == 2:
    a = int(input("Please enter the amount of jokes you want. "))
    for i in range(1,a+1):
        print("")
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print(joke["setup"])
        print("")
        x = input("(Answer) ")
        print("")
        print(joke["delivery"])





