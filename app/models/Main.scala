package models

object Main{
  val tim = Cliente("12","Nombre")
  val tom = Seller("123456789","Prueba", "Sujeto", "De", "5555")
  
  Cliente.create(tim)
  Seller.create(tom)
}