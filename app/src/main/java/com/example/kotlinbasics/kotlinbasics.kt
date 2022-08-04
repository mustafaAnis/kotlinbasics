package com.example.kotlinbasics

fun main(){
//    func()
//    print(addup(3,4))
//    println(average(3,4,5))
//    var myName = "mustafa"
//    var myfloat:Float =  13.37F
//    var mydouble:Double =  3.14159265358979
//    var myshort:Short = 25
//    var mybyte: Int =  2020
//    var myint: Long = 18881234567
//    var mybool:Boolean = true
//    var mychar:Char = 'a'
//    print(myName)
//    print(myfloat)
//    print(mydouble)
//    print(myshort)
//    print(mybyte)
//    print(myint)
//    print(mybool)
//    print(mychar)
//    var a = 13
//    if(a == 10){
//        print("a = 10")
//    }else if (a==12){
//        print("a = 12")
//    }else{
//        print("none of above")
//    var a: Any = 10
//
//    when(a){
//        is Int -> print("integer")
//        is String -> print("string")
//        else -> print("none of above")
//
//    }
//    var num: Any
//    for (num in 0..10000){
//        if (num == 9001) {
//
//            print("IT'S OVER 9000!!!")
//            break
//        }
//    }
//
//    var humidiyLevel = 80
//    var humidity = "humid"
//    while (humidity == "humid"){
//        println("humidity decreased")
//        humidiyLevel -= 5
//        if(humidiyLevel <= 60){
//            humidity = "comfy"
//            println("it's comfy now")
////            break
//        }
//
//
//    }
//    var name: String = "MUSTAFA"
//    var nullableName2: String? = "MUHAMMAD"
//   nullableName2 = null

//    val len1 = name.length
//    println("name length " + name.length)
//    println("lower case " + name.lowercase())

//    println(nullableName?.length)
//    val lower2 = nullableName2?.lowercase()

//    if (nullableName != null){
//        println("not null")
//
//    }else {
//        println("null")
//    val nullableName3: String? = null
//    val len1 = nullableName3?.lowercase()
//    val len2 = nullableName3?.lowercase()
//    println(nullableName3?.lowercase()) // prints null
//    println(nullableName3?.length) // prints null

    val nullableName4: String? = "MU"
    nullableName4?.let { println(it.lowercase()) }
    nullableName4?.let { println(it.length) }






    }

//fun func(){
//    print("called function")
//
//}
//fun addup(a:Int,b:Int):Int{
//    return a+b
//}
//fun average(a:Int,b:Int,c:Int):Double{
//    return ((a+b+c)/3).toDouble()
//}