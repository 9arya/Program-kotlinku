import kotlin.math.sqrt

fun pangkat(x: Long): Long{
  return x*x
}
fun akar(pp: Long): Long{
 var mmmm = (pp).toDouble()
  return (sqrt(mmmm)).toLong()
}
fun main(){
  try {
   println("masukin angka buat dipangkatin")
   var angka = readln().toLong()
   val hasil = pangkat(angka)
   println("hasilnya: $hasil")
  } catch (e: java.lang.NumberFormatException){
    println("terjadi kesalahan")
  } finally{
    println(akar(900))
  }
}