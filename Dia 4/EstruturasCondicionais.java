public class EstruturasCondicionais {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;

        if (a < b){
            a = 5;

        } else if (a == b){ 
            a = -b;
        
        } else {
            a = 0;
        }

        switch (a) {
            case 1:
                a = 1;
                break;
            case 5:
                a = 0;
                break;
            default:
                a = 2;
                break;
        }

    }
}
