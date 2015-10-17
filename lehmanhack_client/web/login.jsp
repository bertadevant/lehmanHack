<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    lh.LehmanHack_Service service = new lh.LehmanHack_Service();
    lh.LehmanHack port = service.getLehmanHackPort();

    java.lang.String result = port.login(username, password);
    if (result.equals("true")) {
        session.setAttribute("username", username);
    } else session.setAttribute("username", "");
    out.println(result);


%>