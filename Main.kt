fun main()
{
    println("Информация о фильме:")
    var Film = Cinema ("Гарри поттер", "В 20.00", "300 рублей", "3, dolby atmos", "300 зрителей")
    Film.Filmname()
    Film.Seans()
    Film.Ticket()
    Film.Hall()
    Film.Spectaters()

    println("Информация о студенте:")
    var Student = Students ("Настя", "Александровна","Черепанова", "Женский","Пр-24", "28.11.2003", "158", "49", "Фитнес")
    Student.Name()
    Student.Patronymic()
    Student.Surname()
    Student.Gender()
    Student.Group()
    Student.Date()
    Student.Heigh()
    Student.Weigh()
    Student.Sports()

}