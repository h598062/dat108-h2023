<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
    <h1>BMI-kalkulator</h1>
    <p><b><font color="red">${feilmelding}</font></b></p>
    <c:if test="${not empty bmi}">
        <p><b>Din BMI er ${bmi}</b> (${param.hoyde} cm, ${param.vekt} kg)</p>
        <p> Dette regnes av WHO som <b>${vektklasse.toString()}.</b></p>
    </c:if>
    <form action="bmi4"><fieldset>
        <table>
            <tr><td>Høyde</td>
                <td><input type="text" name="hoyde" /></td><td>cm</td></tr>
            <tr><td>Vekt</td>
                <td><input type="text" name="vekt" /></td><td>kg</td></tr>
        </table>
        <p><input type="submit" value="Beregn" /></p>
    </fieldset></form>
</body>
</html>