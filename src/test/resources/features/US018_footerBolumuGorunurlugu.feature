

Feature: Footer bolumunun gorunurlugu ve linklerin calismasi

  Scenario: Footer bolumunun gorunurlugu ve linklerin aktifligi kontrol edilir

    Given US18 kullanici ana sayfaya gider
    Then footer bolumu gorunur olmalidir
    And footer bolumunde asagidaki linkler gorunur ve aktif olmalidir:
      | Hakkimizda           |
      | Iletisim             |
      | Sertifika Dogrulama  |
      | Sartlar & Kurallar   |
    When kullanici ilgili linklere tiklar
    Then igili sayfalar acilmalidir

    Scenario: kullanici footerdan telefon numarasi ve mail adresini kontrol eder

      Given user anasayfaya gider
      And footer bolumunde telefonu goruntuler
      Then footer bolumunde maili goruntuler


    Scenario: kullanici footerdaki subscribe bolumunden bultenlere abone olur

      Given TC3 kullanici anasayfaya gider
      And footer bulten bolumune iner
      When email adresini girer
      And join butonuna basar
     # Then abone olunduguna dair alerti goruntuler

      Scenario: kullanici sosyal medya ikonlarinin gorunurlugunu ve aktifligini kontrol eder
        Given TC4 kullanici anasayfaya gider
        And TC4 footer bolumune iner
        Then sosyal medya ikonlari twitter, whatsapp, instagram, facebook gorunur ve aktif olmalidir


       Scenario: kullanici 'All rights are reserved for learning management system platform' yazisini goruntuler

         Given TC5 kullanici anasayfaya gider
         And TC5 footer bolumune iner
         Then telif yazisini goruntuler


         Scenario: kullanici footer bolumunden anasayfanin en ustune erisim saglayabilmeli

           Given TC6 kullanici anasayfaya gider
           And TC6 footer bolumune iner
           When instulearn logosuna tiklar
           Then anasayfanin basina doner




