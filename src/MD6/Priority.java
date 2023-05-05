package MD6;

public enum Priority {
   HIGH,
    MEDIUM,
    LOW,
    EMPTY;

    public static Priority getPriority(String priority) {
        switch(priority.toUpperCase()){
            case "HIGH":
               return  HIGH;
            case "MEDIUM":
                return MEDIUM;
            case "LOW":
                return LOW;


        }
        return EMPTY;
    }

}
