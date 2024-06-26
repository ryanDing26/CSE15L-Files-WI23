import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    String[] words = new String[];

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Search Engine: A list of %d items currently!", words.length);
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("word")) {
                    for(int i = 0; i < words.length; i++) {
                        if (words[i] == null) {
                            words[i] = parameters[1];
                            break;
                        }
                    }
                    return String.format("%s added to the word bank! There are now %d word(s)", parameters[1], size);
                }
            } else {
                if (url.getPath().contains("/search")) {
                    //TODO
                }
            }
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
