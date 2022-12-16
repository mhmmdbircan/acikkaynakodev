
public static void main(String[] args) {
 
//dosya yolu
String dosyaYolu = "C://YazilimBilisim//test2.txt";
 
/*DOSYA OLUŞTURMA VE YAZMA*/
try
{
FileOutputStream fos = new FileOutputStream(dosyaYolu);
 
OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
 
osw.write("yazılım bilişim programlama 2");
osw.close();
}
catch (UnsupportedEncodingException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
catch(FileNotFoundException ex)
{
System.out.println("Hata : " + ex);
} 
catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
