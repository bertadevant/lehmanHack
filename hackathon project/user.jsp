
<%
    String username = request.getParameter("user");
    String password = request.getParameter("pass");
    String card = request.getParameter("card");

    lh.LehmanHack_Service service = new lh.LehmanHack_Service();
    lh.LehmanHack port = service.getLehmanHackPort();

    java.lang.String result = port.createUser(username, password, card);
    session.setAttribute("username", username);
    out.println(result);

%>
