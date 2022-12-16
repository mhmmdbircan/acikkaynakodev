
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
 
 /*DOSYA OKUMA*/
try {
File dosya = new File(dosyaYolu);
 
BufferedReader oku = new BufferedReader(
new InputStreamReader(
new FileInputStream(dosya), "UTF8"));
 
String str;
 
while ((str = oku.readLine()) != null) {
System.out.println(str);
}
 
oku.close();
} 
catch (UnsupportedEncodingException e) 
{
System.out.println(e.getMessage());
} 
catch (IOException e) 
{
System.out.println(e.getMessage());
}
catch (Exception e)
{
System.out.println(e.getMessage());
}
 
}
