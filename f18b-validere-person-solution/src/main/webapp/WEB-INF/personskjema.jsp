<html>
<body>
	<h3>Hei. Tast inn informasjon om personen</h3>

	<p style="color:red;">${feilmeldinger}</p>
	
	<form action="sjekkPerson" method="get" id="person">
		Navn <input type="text" name="navn" value="${person.navn}"><br>
		Mobil <input type="text" name="mobil" value="${person.mobil}"><br>
		Høyde i cm <input type="number" name="hoydecm" value="${person.hoydecm}"><br>
		Fødselsdato	<input type="date" name="fdato" value="${person.fdato}"><br>
		<input type="submit" value="Send!"/>
	</form>
	
</body>
</html>