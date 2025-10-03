Feature: kullanici kurs satin alma
  Scenario:kullanici kurs satin alabilmeli

    Given US33 kullanici instulearn ana syfasina gider
    Then US33 login butona tiklar
    And  US33 sayfada email kutusuna mail ve password yazar ve login tiklar
    And US33 Courses basligina tiklar
    And US33 Filtrele bölümünden sekme secerek filtreleme yapar
    Then US33 Filter items e tiklar
    And US33 java icerikli bir kurs secilir
    Then US33 buy now a tıklanır
    Then US33 pay with sprite tıklanır
    Then US33 start payment butonuna tıklanır
    And US33 email kutusuna mail yazılıt
    Then US33 card information bilgileri girilir
    And US33 gun ve yil girilir
    Then US33 Cardholder name girilir
    Then US33 pay butonuna basılır
