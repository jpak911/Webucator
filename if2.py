def main():
    age = int(input('How old are you? '))

    if input('Are you a citizen? Y or N ').lower() == 'y':
        is_citizen = True
    else:
        is_citizen = False

    if age >= 21 and is_citizen:
        print('You can vote and drink.')
    elif age >= 21:
        print('You can vote and drink.')
    elif age >= 18 and is_citizen:
        print('You can vote, but can\'t vote.')
    else:
        print('You cannot vote or drink.')

main()