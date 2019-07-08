<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>State</title>
<script>
var StatesBycity = {
    Karnataka: ["Bangalore", "Mysore", "Mandya", "Others"],
    Andhra: ["Vishakapatnam", "Guntur", "Hindupur", "Others"],
    TamilNadu: ["Chennai", "Madurai", "Vellore", "Tiruchirapalli", "Others"]
}

    function changecat(value) {
        if (value.length == 0) document.getElementById("city").innerHTML = "<option></option>";
        else {
            var catOptions = "";
            for (cityId in StatesBycity[value]) {
                catOptions += "<option>" + StatesBycity[value][cityId] + "</option>";
            }
            document.getElementById("city").innerHTML = catOptions;
        }
    }
    
    
    
    
    
    </script>

</head>
</head>
<body>
	<center>
		<h1 style="color: #0066CC"> Please Select The State</h1>
		<br />
		<br />
		
		<form:form action="addSuccess" modelAttribute="ticket">
    <table border="1">
        <tr>
            <td>
                <label>State:</label>
                <select name="State" id="State" onChange="changecat(this.value);">
    <option value="" disabled selected>Select</option>
    <option value="Karnataka">Karnataka</option>
    <option value="Andhra">Andhra</option>
    <option value="TamilNadu">TamilNadu</option>
</select></td>
</tr>
<tr>
<td>
City:<select name="city" id="city">
    <option value="" disabled selected>Select</option>
</select>
            </td>
        </tr>
        
        <tr>
            <td>
                <label>Theatre Name:</label>
                <select class="country">
                    <option>Select</option>
                    <option value="Threatre1">Threatre1</option>
                    <option value="Threatre2">Threatre2</option>
                    <option value="Threatre3">Threatre3</option>
                </select>
            </td>
       </tr>
       <tr>
             <td>
                <label>Movie Name:</label>
                <select class="country">
                    <option>Select</option>
                    <option value="Movie1">Kavaludari</option>
                    <option value="Movie2">Parvatamma</option>
                    <option value="Movie3">PutaniAgent123</option>
                </select>
            </td>
        </tr>
        <tr>
        <td>
        Date:<input type="Date">
        </td>
        </tr>
        <tr>
        <td>
        Time:
        <select class="time">
                    <option>Select</option>
                    <option value="9:00AM">9:00AM</option>
                    <option value="12:00PM">12:00PM</option>
                    <option value="4:00PM">4:00PM</option>
                </select>
        </td></tr>
        
    </table>
   </br> <input type="submit" name="submit" value="add details"/>
</form:form>
	</center>
</body>
</html>