public class Server {
    private final String PERMITTED_NAME = "HarryPotter";
    private final String PERMITTED_NAME_PASSWORD = "avadakedabra";
    public Server(int port, String path){
        System.out.println("Server initialized on " + port + "/" + path);
    }
    public Response get(Request request){
        String name = request.getParameter("login");
        String pswd = request.getParameter("password");
        if(name.equals(PERMITTED_NAME) && pswd.equals(PERMITTED_NAME_PASSWORD)){
            return new Response(200);
        }else{
            return new Response(302);
        }

    }
}
