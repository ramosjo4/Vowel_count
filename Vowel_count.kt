
/*will run a string through loop and count number of vowels.
Will then print the sum of the number of vowels in a string. */

fun main(args: Array<String>){

        var test1 = "aeiou"
        var test2 = "This is a test"
        var test3 = "hello world"
        var test4 = "nnnnnnnnn"

        var sum1 = 0
        var sum2 = 0
        var sum3 = 0
        var sum4 = 0

    for(i in test1.indices){
        if (test1[i] == 'a' || test1[i] == 'e' ||test1[i] == 'i' || test1[i] == 'o' || test1[i] == 'u'){
            sum1++
        }
    }

    for(i in test2.indices){
        if (test2[i] == 'a' || test2[i] == 'e' ||test2[i] == 'i' || test2[i] == 'o' || test2[i] == 'u'){
            sum2++
        }
    }

    for(i in test3.indices){
        if (test3[i] == 'a' || test3[i] == 'e' ||test3[i] == 'i' || test3[i] == 'o' || test3[i] == 'u'){
            sum3++
        }
    }

    for(i in test4.indices){
        if (test4[i] == 'a' || test4[i] == 'e' ||test4[i] == 'i' || test4[i] == 'o' || test4[i] == 'u'){
            sum4++
        }
    }

    println(sum1)
    println(sum2)
    println(sum3)
    println(sum4)
}
