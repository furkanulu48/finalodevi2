package gettersetter4;


public class main /* main sınıfımız oluşturuldu */{

public static void main(String[]args) /* Parametre oluşturuldu */
{
Ogrenci o1= new Ogrenci();

/*Öğrenci 1'in No'suna ulaşmaya çalışalım şimdi
" System.out.println(o1.No); "
/* Görüldüğü üzere ulaşamıyoruz. Sebebi ise Ogrenci classındaki erişim belirleyicilerinin private oluşu.
Biz herkesin dışarıdan ulaşmamasını istediğimizi farz edelim. Bu sebeple getter ve setter metotlarını
kullanacağız.*/ 
o1.setisim("Furkan"); /* Setter metodu ile önceden erişemediğimiz isim değişkenine eriştik ve değerimizi girdik */
o1.setsoyisim("Ulutanrıverdi"); /* Setter metodu ile önceden erişemediğimiz isim değişkenine eriştik ve değerimizi girdik */
o1.setNo(017); /* Setter metodu ile önceden erişemediğimiz isim değişkenine eriştik ve değerimizi girdik */
System.out.println(o1.getisim()+" "+o1.getsoyisim()+" "+o1.getNo()); }}
