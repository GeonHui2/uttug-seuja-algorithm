T = int(input())
for test_case in range(1, T + 1):
    word = input()
    if word == word[::-1]:
        result = 1
    else:
        result = 0
    print(f"#{test_case} {result}")
