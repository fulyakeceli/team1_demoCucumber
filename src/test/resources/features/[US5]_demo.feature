Feature: login linki islemsleri

Scenario: kullanici login linkine tiklar

Given US5 kullanici instulearn sayfasina gider
When US5 login linkine tiklar
Then US5 gecerli kullanici adi ve gecerli sifreyi girer
And US5 log in butonuna basar