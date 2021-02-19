public class Menu {
    private String name;
    private String description;
     private static final Menu[] menus={
             new Menu("breatfast "," 2 roti \n 1 glass milk \n aachar \n any one fruit"),
             new Menu("lunch "," 2 roti \n 1 glass milk \n aachar \n any one fruit"),
             new Menu("dinner  "," 2 roti \n 1 glass milk \n aachar \n any one fruit")
     };
     private  Menu(String name ,String description)
     {
         this.name=name;
         this.description=description;

     }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

        public String toString() {
        return this.name;

    }
}

