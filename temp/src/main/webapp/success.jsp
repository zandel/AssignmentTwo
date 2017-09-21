<%@ page import="java.util.ArrayList, java.util.Iterator, dbAccess.parkingSpot" %>
<style>

#myForm{
margin: 0 auto;
}

#myForm{
margin-right: 50%;
text-align:right;
font-weight: bold;
}

#myForm {
text-align:-moz-right;
margin-right: 40%;
}

</style>

<body>

<ul>

<li><a href="./startHere.jsp">Home</a></li>



<li><a href="./startHere.jsp">Home</a></li>

<ul>	

<li><a href="./startHere.jsp">zzzzzzzzzz</a></li>

</ul>



</li>

</ul>


<%
int x = 3;
ArrayList<parkingSpot> xx;
xx = ( ArrayList<parkingSpot> ) request.getAttribute("myAttribute");

for ( parkingSpot  zz  : xx ) {
    System.out.println (zz.getstreetName());
%>


<div style="display: block">
<form id="myForm" method="post"  style="display: block" action="processGetSpot">

<%= zz.getstreetName() %>
<input type="hidden" name="street" value="<%= zz.getstreetName() %>"      >
&nbspspot #<%= zz.getspotNo() %>
<input type="hidden" name="spotNo" value="<%= zz.getspotNo()%>"      >
<%= zz.getstatus() %>

<%

String stts = zz.getstatus();

System.out.println ( "[" + stts + "]" );

if  ( stts.equals("BUSY")){
	System.out.println ("fOUND BUSY");

%>
<input type="submit" value="occupy" style="background-color=red;"> </input>
<% 	
}
else{
	System.out.println ("fOUND NOT BUSY");
%>
<input type="submit" value="occupy" style="background-color=#4CAF50;"> </input>
</br></br>
</form>
</div>
<% 	
}
%>

<% 
}
%>

</body>
