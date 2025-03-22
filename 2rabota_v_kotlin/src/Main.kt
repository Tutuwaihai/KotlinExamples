//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Создаётся переменная Int с именем test и объект Int со значением 5. В x сохраняется ссылка на объект Int со
    //значением 5
//    var test = 5
//    var x: Long = 50000
//    var y = x
//    var z: Short = x.toShort()
//    println("x is $x")
//    println("y is $y")
//    println("z is $z")

    var p: Int = 50
    var k = p.toDouble()
    var b: Byte = 2
    println(k)

    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)


}