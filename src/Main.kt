//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    println("======================1======================")
    val names: Map<Int, String> = mapOf(
       1 to "Иван",
       2 to "Марина",
       3 to "Григорий",
       4 to "Евгения",
       5 to "Дарья",
       6 to "Геннадий",
       7 to "Андрей",
       8 to "Екатерина")
    var filterNames = names.filter { i -> i.key < 5 }
    println(filterNames)
//2
    println("======================2======================")
    filterNames = names.filter { i -> i.value.endsWith('а') }
    println(filterNames)
//3
    println("======================3======================")
    filterNames = names.filter { i -> i.value.startsWith('Г') }
    println(filterNames)
//4
    println("======================4======================")
    val prizeMap: Map<String, Int> = mapOf(
        "id1" to 5,
        "id2" to 3,
        "id3" to 15,
        "id4" to 22,
        "id5" to 21,
        "id10" to 25,
        "id15" to 31,
        "id20" to 23,
        "id25" to 15
    )
    val filterPrizeMap = prizeMap.filter { i ->
        i.key.endsWith('5') && i.value > 20
    }
    println(filterPrizeMap)
}