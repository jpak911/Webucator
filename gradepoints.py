def main():
    grades = {'English': int(input('English grade: ')), 'Math': int(input('Math grade: ')),
              'Global Studies': int(input('Global Studies Grade: ')), 'Art': int(input('Art grade: ')),
              'Music': int(input('Music Grade: '))}

    gradepoints = grades.values()

    average = sum(gradepoints)/len(gradepoints)

    print('Your average is', average)

main()