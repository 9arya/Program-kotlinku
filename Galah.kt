fun absen(No){
  daftar = listOf("agus","bagus","ilham","windah")
  var nomor = No - 1
  return daftar[1]
}
fun main(){
  var a = absen(3)
  println(a)
}