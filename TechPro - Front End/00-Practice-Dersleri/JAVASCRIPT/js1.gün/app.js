
/* /*GENEL TEKRAR
1. İsimler camelCase olmalı, yani isim birden fazla kelimeden oluşursa sonraki kelimelerin 
ilk harfi büyük olur.
2.İsimleri kodla alakalı seçmek okunabilirlik açısından önemli.
3.İsimlerde  harf, sayi, $, _ kullanılabilir.
4.Sayı kelimenin başında yazılmaz.
5. + işaretinin iki tarafı da sayı ise toplama yapar, ama bir tarafı bile string
olursa concatination olur.
6.Eğer matematiksel bir işlem yaparsak parantez içerisinde yazmak emin olmak için iyi olur.
7.prompt() fonksiyonu kullanıcıdan bir veri almak için kullanılır.
8.Data Tipleri:
1.String
2.Boolean
3.Number
4.null
5.undefined
6.Symbol
7.Object
*/

// Örnek 1

// console.log("merhaba");
// console.warn("bu bir uyarı dır");
// console.error("bu ibr hatatır");


// Örnek 2;

// var name=prompt("isminizi yazın:")
// console.log("merhaba " + name + " nasılsın?");



// Örnek 3;
// var kenar=prompt("karinin bir kenarını giriniz");
// var kareninAlani = kenar*kenar;
// console.log(kareninAlani);


// Örnek 4;
// var isim = prompt("isminiz");
// var soyIsim = prompt(" soy isim");
// var yas= prompt("yas");
// alert("isminiz " + isim + " soyisminiz " + soyIsim + " ve yaşınız: "+ yas);


// Örnek 5;
// var pi=3.14;
// console.log(pi);
// console.log(typeof(pi));
// pi=true;
// console.log(pi);
// console.log(typeof pi); bu şekilde de  typeof çalışıyor


// Örnek 6;
// let fiyat;
// console.log(fiyat);
// fiyat = 5.5;
// console.log(fiyat);
// console.log(typeof fiyat);


// Örnek 7;
// const kelime = null;
// console.log(kelime);
// console.log(typeof kelime);

// Örnek 8;
// const kutu = 6;
// const koli = 34;
// const sise = 76;

// let toplamMalzeme=kutu + koli + sise;
// console.log(toplamMalzeme); // 116
// toplamMalzeme++;
// console.log(toplamMalzeme); // 117
// toplamMalzeme+=3;
// console.log(toplamMalzeme); // 120

// console.log("Toplam",toplamMalzeme,"adet malzeme var"); // 'Toplam 120 adet malzeme var' , ile yazılınca + nın aksine aradaki boşlukları kendi ayarlıyor
// console.log("Toplam "+toplamMalzeme+" adet malzeme var");
// console.log(`Toplam ${toplamMalzeme} adet malzeme var`);


// Örnek 9;
// const isim = "Kürşat";
// const yas = 35;
// console.log("Benim adım " + isim + " yasim : "+ yas + " tir.");
// console.log(`Benim adım ${isim} yasim  ${yas} tir`);
// console.log(`sepet sepet yumurta 
// sakın beni unutma 
// uturursan küserim 
// mektubumu keserim`); 
//NOT : // backtick` olduğu gibi yansıtıyor consola alt satır için enter yeterli \n yapmamıza gerek yok.

// Örnek 10;
// const yil=2022;
// const dogumTarihi=1968;
// const yas = yil - dogumTarihi;
// console.log("yaş : "+ yas);

// console.log("yaş: "+ yil-dogumTarihi); //NaN
// console.log("Yaş: "+(yil - dogumTarihi)); // Yaş: 54
// console.log(`Yaş: ${yil} - ${dogumTarihi}`);
// console.log(`Yaş ${yil - dogumTarihi}`); // 54

// Örnek 12;
// const taban=4;
// const us=8;
// const sonuc=4**8;
// console.log(sonuc);


// Örnek 13;
// const sayi=123;
// const birler=sayi%10;
// console.log(birler);

// // const onlar=((sayi/10)%10);
// // console.log(onlar); //2.333333333

// const onlar = Math.floor(sayi/10) %10;
// console.log(onlar);//2

// const yüzler = sayi/100; //1.33333
// console.log(Math.floor(yüzler)); // 1


// Örnek 14;
const language = "JavaScript";
console.log(Number(language));
console.log(Number("123abcd"));

// NOT: 0, null, undefined, NaN, "", --> boolean'a çevirirken false döndürür diger değerlerde de true döndürür.


// Örnek 15;
// const sayi1=5;
// const sayi2=7;
// const isim = "John";
// console.log(Boolean(sayi1));
// console.log(Boolean(sayi2));
// console.log(Boolean(isim));
// const sifir=0;
// const hic = null;
// const bos="";
// const tanimsiz=undefined;
// const sayiDegil=NaN;
// console.log(Boolean(sifir), Boolean(hic));
// console.log(Boolean(tanimsiz), Boolean(bos), Boolean(sayiDegil));


// Örnek 16;
// const sayi="1000";
// console.log(sayi + 15);
// console.log(Number(sayi) + 15);

// Örnek 17;
// const sayi=13;
// console.log(String(sayi) + sayi); //1313
// console.log(typeof(String(sayi)+13)); //String

