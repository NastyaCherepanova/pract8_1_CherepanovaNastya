class Students (var _name: String, var _patronymic: String, var _surname: String, var _gender: String, var _group: String, var _date: String, var _heigt: String, var _weight: String, var _sports: String)
{
        var name: String = _name
        var patronymic: String = _patronymic
        var surname: String= _surname
        var gender:String = _gender
        var group: String = _group
        var date: String = _date
        var heigt: String = _heigt
        var weight: String = _weight
        var sports:String =_sports

        fun Name()
        {
            println("имя студента: $name")
        }
    fun Patronymic()
    {
        println("отчество студента: $patronymic")
    }
    fun Surname()
    {
        println(" фамилия студента: $surname")
    }
    fun Gender()
    {
        println("пол студента: $gender")
    }
    fun Group()
    {
        println("группа студента: $group")
    }
        fun Date()
    {
        println("дат рождения студента: $date")
    }
        fun Heigh()
    {
        println("рост студента: $heigt")
    }
        fun Weigh()
    {
        println("вес студента: $weight")
    }
        fun Sports()
    {
        println("вид спорта студента: $sports")
    }
}


















