
# li = [8, 6, 2]
# take_odd = list(filter(lambda x: x % 2 == 1, li))
# is_odd_exist = bool(take_odd)
# num = 0
# while not is_odd_exist:
#     num += 1
#     li = list(map(lambda x: x / 2, li))
#     take_odd = list(filter(lambda x: x % 2 == 1, li))
#     is_odd_exist = bool(take_odd)
# print(num)

# for i in range(20):


# def add_num(num):
#     decimal10 = num // 10
#     decimal1 = num % 10
#     return decimal10 + decimal1


# a, b = 2, 5
# li = list(map(add_num, range(1, 21)))
# lis = list(filter(lambda x: a <= x <= b, li))
# print(lis)

li = list(map(int, input().split()))
des_li = sorted(li, reverse=True)
print(sum(des_li[::2]) - sum(des_li[1::2]))
