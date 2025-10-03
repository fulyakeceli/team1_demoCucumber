Feature: Yeni kurs olusturma
  Scenario: Kullanici yeni bir kurs olusturabilmeli
    Given instructor, anasayfaya gider
    When basarili kullanici adi ve sifre ile login olur
    When sidebar da Courses e tiklar
    Then New e tiklar
    Then Information sayfasinda gerekli alanlari doldurur
    And thumbnail Image icin yukleme modalini acar
    And kullanici modal pencereden thumb.jpg secip tiklar
    Then confirm e tiklar
    And cover Image icin yukleme modalini acar
    And kullanici modal pencereden cover.jpg secip tiklar
    Then geri kalan stepleri yapar
    Then Publish butonuna tiklar
    And My courses sayfasinda yeni kursun gorunup gorunmedigini test eder
    Then Anasayfaya gider
    Then Logout olur
