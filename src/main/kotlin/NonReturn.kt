/*Non-return type function Its use the keyword void to declaration and perform a task
,but it doesn't return a value It's also used for set conditions or print other functions.
 Example:In programming we have to make our code  clear and clean ,so every function  do at
 least one task.
  The following function is  return type */

fun getInfo(StudentName: String, ID: Int): String {
    return "$StudentName $ID "
}
// non-Return type function print return type function
fun printInfo(StudentName:String , ID:Int) {
    println(getInfo(StudentName, ID))
}
fun main() {
    printInfo("khulud ,", 1109563587) }