fun main(){
  val hasil = mutableListOf<Int>()
  for (i in 1..100000000){
    var koin = (0..1).random()
    if (koin == 1){
      hasil += 1
    }
    else if (koin == 0){
      hasil += 0
    }
  }
  var bb = hasil.count{it == 0}
  var cb = hasil.count{it == 1}
  println("ini jumlah angka muncul: $bb")
  println("ini jumlah gambar muncul: $cb")
}