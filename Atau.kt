fun main(){
  println("apa elemen naga mu")
  val masuk = readln()
  val elemen_naga = masuk.toString()
  if (elemen_naga == "api"|| elemen_naga == "air"){
    println("itu termasuk dalam kelompok panas dingin")
  }
  else if (elemen_naga == "angin"){
    println("nagamu elemen angin,itu bisa mengacak ngacak kota")
  }
  else{
    println("itu tidak ada dalam program ini")
  }
}