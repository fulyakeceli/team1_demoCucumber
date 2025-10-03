Feature: intructor olarak egitim olusturup, student olarak kurs satin almak istiyorum

  Scenario: kullanici instructor olarak kurs olusturup student olarak kurs satin alma islemlerini yapabilmeli

    Given D kullanici anasayfaya gider
    Then D Login yazisini gorur ve tiklar
    When D basarili kullanici adi ve sifre ile login olur



    Scenario: intructor olarak egitim olusturma
    When D sidebar da Courses e tiklar
    Then D New e tiklar
    Then D Information sayfasinda gerekli alanlari doldurur
    And D thumbnail Image icin yukleme modalini acar
    And D modal pencereden thumb.jpg secip tiklar
    Then D confirm e tiklar
    And D cover Image icin yukleme modalini acar
    And D kullanici modal pencereden cover.jpg secip tiklar
    Then D geri kalan stepleri yapar
    Then D Publish butonuna tiklar
    And D My courses sayfasinda yeni kursun gorunup gorunmedigini test eder
    Then D Anasayfaya gider
    Then D Logout olur

      Scenario: egitim satin alma


