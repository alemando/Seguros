package models

object Main{
  val adminPrueba = new Admin("12315456", "Juanes", "Cendales", "Sora", "112002")
  val aseguradoraPrueba = Aseguradora("12318","SURA", "31648874")
  val bienPrueba = Bien("1", "12345811", "Vehiculo", "Bonito, Azul", "N/A")
  val categoriaPrueba = Categoria("Vehiculo")
  val clientePrueba = Cliente("12345811", "Alejandro", "Jimenez", "Franco", "Calle 11", "Nose", "Nose", "10/28/1999", 140000,10000)
  val credencialPrueba = Credencial("123456789", "jcendales", "12345")
  val vendedorPrueba = Vendedor("123456789","Prueba", "Sujeto", "De", "5555")
  
  Admin.create(adminPrueba)
  Aseguradora.create(aseguradoraPrueba)
  Bien.create(bienPrueba)
  Categoria.create(categoriaPrueba)
  Cliente.create(clientePrueba)
  Credencial.create(credencialPrueba)
  Vendedor.create(vendedorPrueba)
}