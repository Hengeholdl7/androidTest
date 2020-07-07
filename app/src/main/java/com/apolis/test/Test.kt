package com.apolis.test

public fun main(){
    println(isPrime(10))
    println(isPrime(7))
    println(isPalindrome("1001"))
    println(isPalindrome("10101"))
    println(isPalindrome("10111"))

}

public fun isPrime(num: Int): Boolean{
    var num2 = num - 1
    for(x in num2 downTo 2){
        if(num % x == 0){
            return false
        }
    }
    return true
}

public fun isPalindrome(s: String): Boolean{
    var half = s.length/2
    var last = s.length - 1
    for(x in 0 .. half) {
        if(s.elementAt(x) != s.elementAt(last)){
            return false
        }
        else{
            last--
        }
    }
    return true
}