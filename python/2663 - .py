def insertNcompare():
    numbers = raw_input()
    numbers = numbers.split()
    count = 0
    for i in range(int(numbers[0]), int(numbers[1]) + 1):
        growing = str(i)
        first = growing[0]
        last = growing[len(growing) - 1]
        grow_ing = list(growing)
        grow_ing.sort()

        grow = ""
        grow = grow.join(grow_ing)
        if growing == grow and first != last:
            count = count + 1
        if len(growing) == 1:
            count = count + 1
    print(count)


loops = int(raw_input())
for i in range(loops):
    insertNcompare()
