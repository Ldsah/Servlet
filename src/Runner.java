public class Runner {
    public static void main(String[] args) {
        Server myServer = new Server(8080, "/myapp");
        Request r = new Request();
        r.addParameter("login", "HarryPotter");
        r.addParameter("password", "avadakedabra");
        Response resp = myServer.get(r);
        System.out.println("Client received: " + resp.returnCode);
    }
}
