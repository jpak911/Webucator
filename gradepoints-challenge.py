def avg(gradepoints):
    average = sum(gradepoints)/len(gradepoints)
    return average


def main():
    grades = {}
    grades['English'] = int(input('English grade: '))
    grades['Math'] = int(input('Math grade: '))
    grades['Global Studies'] = int(input('Global Studies grade: '))
    grades['Art'] = int(input('Art grade: '))
    grades['Music'] = int(input('Music Grade: '))

    gradepoints = grades.values()

    average = avg(gradepoints)

    print('Your average is', average)

    subject = input('Choose a subject to change your grade: ')
    newgrade = input('What is your new ' + subject ' grade? ')
    grades[subject] = int(newgrade)
    average = avg(gradepoints)
    average = avg(gradepoints)

    print('Your new average is', average)

main()