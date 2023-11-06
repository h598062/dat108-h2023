Gammelt eksempel med valutaveksling virker ikke lengre!
F.eks krever nå https://currency-api.appspot.com/ en API-nøkkel.
Måtte da sjekke ut noen alternativer til bruk i eksemplet i stedet.

På https://mixedanalytics.com/blog/list-actually-free-open-no-auth-needed-apis/
finnes en oversikt over en del.

Krypto er kanskje det aller greieste, f.eks.:

	API-eksempel:
	- https://api.kucoin.com/api/v1/prices?base=NOK&currencies=BTC
		som gir {"code":"200000","data":{"BTC":"387192.5100179590595214"}}
	
	Det er laget et Java-bibliotek på toppen, se:
	- https://github.com/Kucoin/KuCoin-Java-SDK
	
	Via en enkel Maven dependency er dette tilgjengelig i et Java-program, slik:
		kucoinRestClient.currencyAPI().getFiatPrice("NOK", "BTC");
	
Eksemelet er nå basert på dette.

