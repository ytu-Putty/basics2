//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    println("Введите строку: ")
    var name = readln()
    val symbols = name.toCharArray()
    var count = 1
    symbols.sort()
    for (i in 1  ..  symbols.size-1)
    {
        if (symbols[i] == symbols[i - 1])
        {
            count++
        }
        else
        {
            println(symbols[i - 1] + " - " + count)
            count = 1
        }
    }
}