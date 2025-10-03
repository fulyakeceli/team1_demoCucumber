Feature: Kullanici siteden Log out olur

  Scenario: TC_002 kullanici Log out olabilmeli

    Given US38 kullanici "url" anasayfasina gider
    Then US38 Login yazisini gorur ve tiklar
    Then US38 Email ve Password kutusunu doldurur
    And US38 Login butonunu gorur ve tiklar
    Then US38 Dashboard sayfasinin acildigini gorur
    Then US38 Log out butonunu gorur ve tiklar
    Then US38 cikis yapilabildigini gorur



