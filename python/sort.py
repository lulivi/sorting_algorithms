def sort(arr):
    length = len(arr)
    for i in range(length - 1, -1, -1):
        for j in range(i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr

if __name__ == '__main__':
    import sys
    if sys.version_info.major < 3:
        input_func = raw_input
    else:
        input_func = input

    user_input = input_func('Enter numbers separated by a comma:\n')
    unsorted = [int(item) for item in user_input.split(',')]
    print(sort(unsorted))
