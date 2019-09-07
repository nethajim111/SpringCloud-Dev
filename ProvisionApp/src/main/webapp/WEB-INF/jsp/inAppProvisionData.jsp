<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>In App Prov Data Page</title>
</head>
<script type="text/javascript">
	function submitForm() {
		// Get the first form with the name
		// Usually the form name is not repeated
		// but duplicate names are possible in HTML
		// Therefore to work around the issue, enforce the correct index
		var frm = document.getElementsByName('regForm')[0];
		frm.submit(); // Submit the form
		frm.reset(); // Reset all form data
		return false; // Prevent page refresh
	}
</script>
<body>
	<h1>Now You Are In Provision Data page</h1>
	<h3>${provData}</h3>
	<br>

<form action="/provRegistration" method="post" id="regForm" onclick="submitForm()">
		<table style="with: 50%">
			<tr>
				<td>UUID</td>
				<td><input type="text" name="uuid" /></td>
			</tr>
			<tr>
				<td>FPAN</td>
				<td><input type="text" name="fpan" /></td>
			</tr>
			<tr>
				<td>Expiry Date</td>
				<td><input type="text" name="expDate" /></td>
			</tr>

		</table>
		<input type="submit" value="Submit"  />
	</form>

</body>
</html>
