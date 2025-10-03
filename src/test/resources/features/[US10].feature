

Feature: bir kullanici olarak instructor olarak siteye giris yapabilecegim bir alan olmasini istiyorum

  Scenario: intructor kayit islemi

  Given US10 kullanici urle gider
  When become a instructor yazisina tiklar
  Then occupationsi sdet secer
  When select account type acilir menusune tiklar
  Then 'Stripe' secer
  When account holder'a 'Dan Brown' yazar
  Then account id'ye 123 yazar
  When extra information'a deneme yazar
  Then send request'e tiklar

