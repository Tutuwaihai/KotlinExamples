//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    println("Pow!")
//    var x = 10
//    val comp = "compot"
//    val res = 2 * x
//    println("x было:$x, стало $res")
//    println(comp)
//
//    while (x > 0) {
//        x -= 1
//        println("x равен = $x")
//    }
//
//    for (i in 1..9) {
//        x += 1
//        println("x is now $x")
//    }
//
//    println(if (x==20) "x is 20" else "x is not 20")
//    if (x == 20) {
//        println("x is 20")
//    }else{
//        println("x isn't 20")
//    }
//
//    if (comp.equals("compot")){
//        println("$comp is compot")
//    }else{
//        println("$comp is not compot")
//    }
//
//    var z = 10
//    while (z > 1) {
//        z -= 1
//        print(if (z < 3) "small x" else "zzz")
//    }

    while (true) {
        println("Выберите в какой курс перевести рубли:")
        println("1 - рубль в доллар")
        println("2 - рубль в евро")
        println("Введите 0 для выхода")
        var x = readln().toInt()
        if (x == 1) {
            var value_rub = 0f
            var value_dollar = 88.26f
            println("Введите сумму в рублях")
            value_rub = readln().toFloat()
            value_dollar = value_rub / value_dollar
            println("$value_rub рублей = $value_dollar долларов")
        }
        if (x == 2) {
            var value_rub = 0f
            var value_eu = 91.57f
            println("Введите сумму в рублях")
            value_rub = readln().toFloat()
            value_eu = value_rub / value_eu
            println("$value_rub рублей = $value_eu евро")
        }
        if (x == 0) {
            return
        }
    }


}
