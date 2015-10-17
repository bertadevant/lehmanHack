
<%
    String threadid = request.getParameter("threadid");
    String username = request.getParameter("username");
    String type = request.getParameter("type");
    String torc = request.getParameter("torc");

    lh.LehmanHack_Service service = new lh.LehmanHack_Service();
    lh.LehmanHack port = service.getLehmanHackPort();
    java.lang.String result = port.updownvote(threadid, username, type, torc);

    out.println(result);


%>