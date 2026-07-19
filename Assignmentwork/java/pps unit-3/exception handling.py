a=int(input("enter a value"))
b=int(input("enter b value"))
try:
    r=a/b
except:
        print("Error: Denominatoor cannot be 0.")
else:
    print(r)
finally:
    print("Welcome to mru")
