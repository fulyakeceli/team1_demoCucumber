Feature: kullanici My Coursesi goruntuler

  Scenario: kullanici My Coursestan satin aldigi kursu goruntuler

    Given US41 kullanici urle gider
    When US41 ust menuden kullanici profiline tiklar
    Then US41 acilir menuden 'My Courses'a tiklar
    When US41 satin alinan kursu goruntuler
    Then US41 sayfayi kapatir