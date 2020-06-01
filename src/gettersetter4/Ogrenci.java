 package gettersetter4;


public class Ogrenci  /* Ogrenci adında public bir sınıf oluşturuldu. */ {
    
    private String isim, soyisim; /* isim soyisim değişkenleriyle özel string bir ifade oluşturuldu */
    private int No; /* No değişkeniyle özel int bir ifade oluşturuldu.  */
   public void setisim(String isim) /* String değer alması için setter parametresi girildi.  Bu metoda dışarıdan herkes ulaşabiliyor */
   {    
       this.isim=isim; /* Yeni bir değişken atadık Bu değişkene kimse ulaşamıyor. */
    }
   public void setsoyisim(String soyisim) /* String değer alması için setter parametresi girildi.  Bu metoda dışarıdan herkes ulaşabiliyor */
   {    
       this.soyisim=soyisim; /* Yeni bir değişken atadık Bu değişkene kimse ulaşamıyor. */
    }
   	 /* String değer alması için setter parametresi girildi.  Bu metoda dışarıdan herkes ulaşabiliyor */
   {    
       this.No=No; /* Yeni bir değişken atadık Bu değişkene kimse ulaşamıyor. */
    }
    public String getisim() { /* getter metoduyla isim değişkenini aldık */
        return this.isim; /* return metoduyla isim değişkenine döndük */
    }
    public String getsoyisim(){ /* getter metoduyla soyisim değişkenini aldık */

        return this.soyisim; /* return metoduyla soyisim değişkenine döndük */
    }
    public int getNo(){ /* getter metoduyla no değişkenini aldık */

return this.No; /* return metoduyla no değişkenine döndük */
}
}
