public class month {
    public static void main(String[] args) {
        int n = (int) (Math.random()*12)+1;
        String m;
        switch (n){
            case 1: m = "jan";
                break;
            case 2: m = "feb";
                break;
            case 3: m = "mar";
                break;
            case 4: m = "apr";
                break;
            case 5: m = "may";
                break;
            case 6: m = "jun";
                break;
            case 7: m = "jul";
                break;
            case 8: m = "aug";
                break;
            case 9: m = "sep";
                break;
            case 10: m = "oct";
                break;
            case 11: m = "nov";
                break;
            case 12: m = "Dec";
                break;
            default: m ="Not valid";
        }

        System.out.println(m);
    }
}
