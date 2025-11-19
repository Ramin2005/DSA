
public class BigNumber {

    private byte[] data;

    public BigNumber(String number) throws Exception {
        data = new byte[number.length()];

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

    public String toString() {
        String out = "";

        for (byte digit : this.data) {
            out = out + digit;
        }

        return out;
    }

}
