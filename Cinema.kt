import sun.security.krb5.internal.Ticket

class Cinema (var _filmname: String, var _seans: String, var _ticket: String, var _hall: String, var _spectaters: String)
{
    var filmname: String = _filmname
    var seans : String  = _seans
    var ticket: String = _ticket
    var hall: String = _hall
    var spectaters: String = _spectaters

    fun Filmname()
    {
        println("название фильма: $filmname")
    }
    fun Seans()
    {
        println("название фильма: $seans")
    }
    fun Ticket()
    {
        println("название фильма: $ticket")
    }
    fun Hall()
    {
        println("название фильма: $hall")
    }
    fun Spectaters()
    {
        println("название фильма: $spectaters")
    }

}
