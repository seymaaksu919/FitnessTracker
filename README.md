# Fitness Tracker 

Bu proje, kullanıcıların **adım sayısı, uyku süresi ve su tüketimi** gibi günlük verilerini takip eden bir Java uygulamasıdır. Ayrıca haftalık su tüketimi ortalaması hesaplar ve adım/uyku hedeflerini değerlendirir.

---

## 1. Proje Özellikleri

- Günlük adım sayısı ve uyku saati girişi (konsol üzerinden)
- Haftalık su miktarı girişi (7 gün)
- Hedef kontrolü:
  - Adım: Günlük ≥ 8000 adım
  - Uyku: 7–9 saat arasında dengeli
- Haftalık ortalama su tüketimi hesaplama
- Kullanıcı dostu çıktılar konsolda görüntülenir

---

**Metodlar:**

1. `adimKontrolu()` → Günlük hedef adım sayısını kontrol eder.
2. `uykuKontrolu()` → Uyku süresini değerlendirir (7–9 saat dengeli kabul edilir).
3. `ortalamaSu(double[] haftalikSu)` → Haftalık su dizisini alır, toplamını 7’ye bölerek ortalama hesaplar.
4. `bilgileriYazdirma(double[] haftalikSu)` → Nesne bilgilerini ve haftalık su ortalamasını ekrana yazdırır.

---

### 2.2 `main.java`

* Kullanıcıdan **adım sayısı**, **uyku süresi**, **7 günlük su miktarı** girişlerini alır.
* `FitnessTracker` nesnesi oluşturur ve metodları çağırır.
* Haftalık su dizisi Scanner ile doldurulur ve `bilgileriYazdirma` metoduna gönderilir.

**Önemli Noktalar:**

* Kullanıcı girdileri doğru veri tipine uygun alınmalıdır:

  * adım sayısı → int
  * uyku saati → float
  * su miktarı → double
* Haftalık su miktarı dizisi null olmamalıdır, aksi takdirde `NullPointerException` oluşur.

---

## 3. Algoritma Mantığı

1. Kullanıcıdan adım sayısı ve uyku saati al.
2. Kullanıcıdan 7 gün için su miktarını al ve diziye kaydet.
3. `FitnessTracker` nesnesini oluştur ve adım/uyku hedeflerini kontrol et.
4. `ortalamaSu` metodunu çağırarak haftalık su ortalamasını hesapla.
5. `bilgileriYazdirma` metodunu çağırarak tüm bilgileri ekrana yazdır.

---

## 4. Örnek Kullanım

```
Günlük Adım sayınızı giriniz: 9000
Günlük Uyku saatinizi giriniz: 8
1. Günlük Su miktarını giriniz (litre): 2
2. Günlük Su miktarını giriniz (litre): 1.5
...
Haftalık Ortalama Su Kullanımı: 2.31 litre
Hedef adım sayısı başarılı!
Uyku Saati Dengeli
```

---

## 5. Gereksinimler

* Java JDK 8 veya üstü
* Eclipse/IntelliJ veya herhangi bir Java IDE (opsiyonel)
* Konsol girişi için Scanner sınıfı
---

