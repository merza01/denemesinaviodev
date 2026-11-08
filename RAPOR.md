# Rapor

**Ad Soyad:** Merza Züleyha Kulus
**Numara:** 690

## 1. Problem Analizi
Kullanicinin denemeden yaptıgı dogru ve  yanlislari aldiktan sonra netini hesaplamak ve netine gore basarı durumunu olcmektir.
Eger kullanıcının girdigi degerler hataliysa "gecersiz giris" cıktısını vermektir.


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
dogru , yanlis       

**İşlemler:**
bos=20-(dogru+yanlis) -> bosu hesaplamak icin
net =dogru-(yanlis/4) -> neti hesaplamak icin 
**Çıktılar:**
basari durumu  mesajı / gecersiz giris mesajı

## 3. Matematiksel Formüller

bos=20-(dogru+yanlis)
net =dogru-(yanlis/4)

## 4. Sözde Kod (Pseudocode)

```
1. Başla
2. Öğrencinin doğru ve yanlış sayısını al
3. Boşları ve Neti hesapla
4. Eğer Doğru veya boş sayısı 0 dan küçükse "geçersiz giriş" yaz.
5. Değilse Eğer Doğru ve yanlışın toplamı 20den büyükse "geçersiz giriş" yaz.
6. Değilse Eğer Net sayısı 20ye eşit veya kücük ve 15ten büyük ise "Çok iyi" yaz.
7. Degilse Eger Net sayısı 15e eşit veya kücük ve  8den büyük ise "İyi" yaz
8. Değilse Eğer Net sayısı 8e eşit veya kücük ve 5den büyük ise "Orta" Yaz.
9. Değilse Eğer Net sayısı 5e eşit veya küçük ve -5e eşit veya büyük ise "Geliştirilmeli" yaz
10.Bitir
```

## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 6. Başarı Durumu Koşulları
İlk başta dogru ve yanlısın 0 dan kücük girilmedigine emin olmak icin "if" kullandım.
Eger ikisinden biri 0dan kücük degilse ama ikisinin toplamının 20yi asıp asmadıgını kontrol etmek icin "else if" kullandım.
Eger hic bi giris hatalı degilse netin basarı durumunu kontrol etmek icin 4 kere daha "else if" kullandım.


## 7. Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 20 | 0 | Net 20, Çok iyi |Net sayiniz:20.0 Basari durumunuz: Cok Iyi |evet |
| 15 | 4 | Net 14, İyi |Net sayiniz:14.0 Basari durumunuz: Iyi |evet |
| 10 | 8 | Net 8, Orta |Net sayiniz:8.0 Basari durumunuz:  Orta |evet |
| 5 | 0 | Net 5, Geliştirilmeli |Net sayiniz:5.0 Basari durumunuz: Gelistirilmeli |evet |
| 0 | 20 | Net -5, Geliştirilmeli |Net sayiniz:-5.0 Basari durumunuz: Gelistirilmeli |evet |
| 10 | 10 | Net 7,5, Orta |Net sayiniz:7.5 Basari durumunuz:  Orta |evet |
| 15 | 10 | Geçersiz giriş |Gecersiz giris |evet |
| 12 | 9 | Geçersiz giriş |Gecersiz giris |evet |
| -1 | 5 | Geçersiz giriş |Gecersiz giris |evet |
