public enum VertexState {
    NOT_VISITED,VISITED,WAITING;


    public String toString()
    {
        switch (this)
        {
            case NOT_VISITED:
                return "NOT_VISITED";


            case VISITED:
                return "VISITED";

            case WAITING:
                return "WAITING";

            default:
                return "";
        }

    }



}
