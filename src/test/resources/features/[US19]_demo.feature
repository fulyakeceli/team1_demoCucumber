Feature: Kayitli bir kullanici kendine ait olan Dashboard sayfasini test eder

  Scenario: TC_003 Dashboard sayfasi elementleri goruntulenmeli

    Given kullanici "url" anasayfasina gider
    Then Login yazisini gorur ve tiklar
    Then Email ve Password kutusunu doldurur
    And Login butonunu gorur ve tiklar
    When cevrimdisi butonu gorunur ve aktifleştirilir
    Then cevrimdisi butonu pasif duruma getirilir
    When sidebardaki sekmeler gorunur
    Then sayfanin body bolumundeki bolumler gorunur
    And sidebar alt kisimdaki sekmeler gorunur