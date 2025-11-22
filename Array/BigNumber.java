
public class BigNumber {

    private byte[] data;

    public BigNumber(String number) throws Exception {
        this.data = new byte[number.length()];

        for (int i = 0; i < number.length(); i++) {

            char temp = number.charAt(i);

            if (!Character.isDigit(temp)) {

                this.data = null;

                throw new Exception("Invalid number entered!");
            }

            this.data[i] = (byte) (Integer.parseInt(temp + ""));
        }

    }

    public BigNumber(byte[] data) {

        this.data = data.clone();

    }

    public BigNumber(int number){
        int copy = number;
        int n = (copy + "").length();

        for(int i = (n - 1); i > -1; i--){

            byte temp = (byte) (copy % 10);
            
            this.data[i] = temp;

            copy = (copy - temp) / 10;
            
        }

        this.data = new byte[n];
    }

    public String toString() {
        String out = "";

        for (byte digit : this.data) {
            out = out + digit;
        }

        return out;
    }

}
