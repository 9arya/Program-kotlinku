fun setengah(a: Int): Int{
  var hasiil = a/2 
  return hasiil
}
fun gabung(c: Int,v: Int): Int{
  val hasil = c*v 
  return hasil
}
fun main(){
  var uang_bulanan = setengah(2000000)
  var gaji = gabung(300,10000)
  var jika = gaji == uang_bulanan
  var jika2 = gaji > uang_bulanan
  var jika3 = gaji < uang_bulanan
  if (jika == true){
    println("pas pasan banget")
  }
  else if (jika2 == true){
    println(" ada sisa nih")
  }
  else if (jika3 == true){
    println("terpaksa uang bulanannya harus dikurangi")
  }
  else {
    println("\n")
  }
}