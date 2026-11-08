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
1.
2.
3.
```

## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 6. Başarı Durumu Koşulları
<!-- Koşulları hangi sırayla ve hangi operatörlerle yazdığınızı, nedenini açıklayın. -->


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
