class Application {

    void run(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i > args.length - 1) {
                break;
            } else {
                System.out.println(args[i]);
            }
        }
    }
}