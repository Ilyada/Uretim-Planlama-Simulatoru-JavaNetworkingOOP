# Uretim-Planlama-Simulatoru-JavaNetworkingOOP
PRODUCTION PLANNING SIMULATION, Java Networking, Socket Programming, Server-Side / Client-Side Project


<b>Merkezi Sunucu Özellikleri (SERVER):</b>
1. Sunucu sistemde tek bir uygulama olacaktır. Bir veya daha fazla port üzerinden bağlanacak istemcileri
(Planlamacı Uygulamaları , İş Makinaları) kabul edecektir.
2. Sunucu sisteme bağlı iş makinalarının listesini tutma ve Makine durumlarını takip etmeden sorumludur.
3. Sunucu sisteme bağlanacak Planlama uygulamalarında kullanıcı adı şifre kontrolü yapar ve oturumları takip
eder.
4. Sunucu Planlama uygulamasından gelen iş emirlerini alır stoklar ve çizelgeleyerek iş yerlerine boş olmaları
durumunda iletir.
5. Sunucu Planlamacının rapor isteklerine sistemin durumuna göre cevap verir.
➢ Sistemdeki bekleyen iş listesi. Makinaların serbestlik durumu. Makinalarda işlenen iş emirleri gibi.
6. Sunucu makinaların durumunu kontrol eder, boş makinaya bekleyen uygun iş emrini iletir. İşini bitiren
makinadan da sonuç bilgisini ister.

<b>İş Makinalarının Özellikleri (CLIENT TYPE1):</b>
1. Her İş makinası aşağıdaki özellikleri barındırır. Bu bilgiler yeni bir Makine uygulaması açıldığında sisteme
bağlanmadan önce girilir. Makina sisteme (sunucuya) bağlandığında bu bilgiler sunucuya aktarılır.
1. Makinanın Adı, (ÖR: CNC Tezgah1)
2. Makinanın tekil id bilgisi, (ÖR: 11)
3. Makinanın türü (Sistemde birden fazla tip Makine olabilecektir. İş emirlerinde işin tipi örtüşen makineye
aktarılmalıdır. ÖR: CNC, DÖKÜM , KILIF , KAPLAMA gibi.)
4. Makinanın üretim hızı (Dakika cinsinden makinanın birim işi “1Metre veya 1KG” bitirme zamanını tutacak)
5. Makinanın Durumu (Makinanın iş yapar veya serbest olma bilgisidir. ÖR: BUSY , EMPTY)
2. İş Makinası yukarıdaki özellikleri belirterek sunucuya EMPTY statüsünde bağlanır. Bir iş emri geldiğinde işin
boyu ve kendi çalışma hızına bağlı olarak bu kadar süre BUSY durumuna geçer ve iş bittiğinde bitirme bilgisini sunucuya iletip tekrar EMPTY durumuna geri döner. BUSY durumunda iken gelen işleri reddetmeli ve dikkate
almamalıdır.

<b>Planlamacı Uygulaması Özellikleri (CLIENT TYPE2):</b>
1. Kullanıcı Adı Şifre girilerek uygulama açılır. Girilen kullanıcı adı şifre bilgisi sunucu üzerinden test edilir.
Onaylanan kullanıcı programı kullanmaya başlayabilir.
2. Program Arayüzünden Aşağıdaki İşlemler Gerçekleştirilebilmelidir.
1. Sistemdeki Makinaların Türlerine göre bir listesinin sunucudan çekilmesi.
2. Makinanın o anki durumunun ve şu ana kadar yaptığı işlerin sunucudan çekilmesi.
3. Sunucuda bekleyen iş emirlerinin listelenebilmesi.(Türlere göre ayrılmış )
4. Yeni iş emri girilmesi ve bunun sunucuya aktarılması. Her iş emri tekil bir id bilgisine sahip olur ve işin türü
ve uzunluğu bilgilerini içerir. İşin hangi makinada yapılacağı kararını sunucu verecektir.
5. Planlamacı uygulaması klitlenme yaşamaksızın yukarıdaki işlemleri ardışık olarak yapabilmelidir.
6. Birden fazla planlamacı sisteme oturum açtığında çakışma yaşamamalıdır.
7. Bir planlayıcı uygulamasını tek bir kişi aktif kullanabilir. Farklı kullanıcılar farklı uygulama ile sisteme giriş
yapmalıdır.
