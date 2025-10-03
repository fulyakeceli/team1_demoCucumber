

Feature: : Dashboard'da Purchased Courses baglantisinin gorunurlugu ve aktifligi
  Scenario: : Student dashboardda Sidebarda Purchased Courses baglantisi gorunur ve tiklanabilir olmali
    Given Sitenin anasayfasina gidilir
    Then Student olarak giris yapilir ve Dashboard Sayfasina Gidilir
    And Sidebarda Courses baglantisi gorunur ve aktif olmali
    Then Sidebarda Purchased Courses baglantisi gorunur olmali
    And Purchased Courses baglantisi tiklanabilir olmali







