

Feature: Student dashboard erisimi ve gorunumu
  Scenario: Student dashboard sayfasi goruntulenmeli
    Given Sitenin anasayfasina gidilir
    Then Student olarak giris yapilir ve Dashboard Sayfasina Gidilir
    And Sidebarda Courses baglantisi gorunur ve aktif olmali