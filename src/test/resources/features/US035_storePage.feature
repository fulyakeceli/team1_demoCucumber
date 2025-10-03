
  Feature: kullanici urun satin alabilmek icin ilgili sayfaya gider ve islemleri yapar

    Scenario: kullanici store linkine tiklar ve 'Products' sayfasina gider

      Given US35 kullanici instulearn sayfasina gider
      When login linkine tiklar
      Then gecerli kullanici adi ve gecerli sifreyi girer
      And log in butonuna basar
      Then dashboard yazisini goruntuler
      When store linkine tiklar
      Then 'Products' yazisini goruntuler


    Scenario: kullanici products sayfasinda search box ve search butonun gorunurlugunu ve aktifligini kontrol eder

      Given kullanici search box'a tiklar
      When kullanici search box'a 'product' yazar
      Then search butonuna tiklar

    Scenario: kullanici urun secmeden once filreleme islemlerini yapar

      Given sayfayi asagi kaydirir
      When TC3 free shipping butonuna basar
      Then '1 Product' yazisini goruntuler
      When free butonuna basar
      Then '0 Products' yazisini goruntuler
      When discount butonuna basar
      Then tekrar '0 Products' yazisini goruntuler

     Scenario: kullanici secilen urunun fiyat , satıcı,urun adı,description bilgilerini gorebilmeli

       Given kullanici tekrar store linkine tiklar
       When free shipping butonuna basar
       And urunu gormek icin sayfayi asagi kaydirir
       Then urunun adini, fiyatini, saticisini ve description bilgilerini goruntuler

     Scenario: kullanici kurs sayfasina yonlendirilir butonlar ile urun detaylarini goruntuler ve yorum yapar

       Given kullanici urun adina tiklar
       When urun sayfasina yonlendirilir
       Then add to card, buy now butonlarinin gorunurlugunu ve aktifligini kontrol eder
       And urun puanlamasini goruntuler
       Then sayfayi asagi kaydirir ve yorum yapar

      Scenario: kullanici urunu satin alabilmeli

        Given kullanici buy now butonuna kadar sayfayi kaydirir
        When buy now butonuna basar
        Then sayfayi kaydirip checkout butonuna basar
        When odeme yontemi olarak stripe secer
        Then start payment butonuna basar
        When odeme bilgilerini girer
        Then ode butonuna basar













