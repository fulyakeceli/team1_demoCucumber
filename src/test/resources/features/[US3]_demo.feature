

Feature: Kullanici InstuLearn sayfasinin body bolumunde kendine uygun egitimleri aratir

  Scenario: TC_001 Kullanici anasayfada body bolumunde basligi goruntuleyebilmeli
    Given Kullanici Instulearn anasayfaya gider
    Then Kullanici "Transform Your Future with InstuLearn..." basligini goruntuler



  Scenario: TC_002 Kullanici anasayfa body bolumunde arama cubugunda egitimleri aratir
    Given TC2 Kullanici anasayfaya gider
    Then TC2 arama kutusu gorunur ve aktif olmali
    Then TC2 search butonu gorunur ve aktif olmali
    When TC2 kullanici arama kutusuna tiklar
    When TC2 arama kutusuna "Java" yazar
    When TC2 kullanici search butonuna tiklar
    Then TC2 "1 Results found for \"Java\"" sonuc mesajini goruntuler








