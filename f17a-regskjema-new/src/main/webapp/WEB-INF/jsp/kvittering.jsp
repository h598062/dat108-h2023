<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kvitto</title>
</head>

<body>
	<%-- ${p} i linjen under er et uttrykk som henter attributten 
	     "p" fra modellen (den vi la til med model.addAttribute()) --%>
	<p>Du er nå registrert med følgende info:
		${p.fornavn} ${p.etternavn}, født i ${p.fodselsaar}
	</p>
	
</body>
</html>
