Feature: kullanici sifresini unuttugunda sifresini yenileyebilecegi bir sayfa olmali

  Scenario: kullanici forget your password bolumunden sifre yenilemek icin eposta gonderir

  Given US17 kullanici instulearn anasayfaya gider
  When US17 log in linkine tiklar
  Then forget your password linkine tiklar
  When password recovery kismina emailini girer
  And reset password butonuna tiklar
  When request done successfully alertini goruntuler
  Then log in sayfasina gecis yapar
