dishes = (["Борщ", "Вареники", "Картопляне пюре", "Деруни", "Котлета",
           "Сало з часником", "Холодець", "Голубці", "Галушки"])
prices = [50, 45, 37, 28, 15, 22, 63, 54, 31]
menu = {d: p for (d, p) in zip(dishes, prices)}
print("Меню за назвами страв:\n")
for key in sorted(menu.keys()):
    print("{0!s} - {1!s} грн".format(key, menu[key]), end="\n")
print("-" * 24, "\nМеню за цінами:\n")
for value in sorted(menu.values()):
    for key in menu.keys():
        if menu[key] == value:
            print("{0!s} - {1!s} грн".format(key, value), end="\n")
