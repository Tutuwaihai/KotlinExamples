class Wolf{
    var hunger = 10
    val food = "meat"

    fun eat () {
        println("The Wolf is eating $food")
    }
}

class MyWolf{
    var wolf:Wolf? = Wolf()

    fun myFinction(){
        wolf?.eat()
    }
}

fun getAplhaWolf():Wolf?{
    return Wolf()
}

fun main(args:Array<String>){
    var w:Wolf? = Wolf()
    if(w!=null){
        w.eat()
    }

    var x=w?.hunger
    println("The value of x is $x")

    var y = w?.hunger?: -1
    println("The value of y is $y")

    var myWolf=MyWolf()
    myWolf?.wolf?.hunger=8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let{println(it)}
    }

    getAplhaWolf()?.let {it.eat()}
    w = null
//    try {
//        var z = w!!.hunger
//    } catch(e:Exception){
//        e.printStackTrace()
//    }
    
}