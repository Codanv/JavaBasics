

try:
    if 9/0:
        print('Math', end='')
    else:
        print('Fail', end='')
except:
    print('Error', end='')
finally:
    print('.')
