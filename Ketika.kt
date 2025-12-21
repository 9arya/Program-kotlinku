fun main(){
  var koin_emas = 5
  var status = when (koin_emas) {
    0 -> "miskin"
    1 -> "kekurangan"
    2 -> "berkecukupan"
    3 -> "lebih"
    4 -> "kaya"
    5 -> "sangat kaya"
    else -> "diluar batas normal"
  }
  println(status)
}