
public class BigNumber {

    private byte[] data;

    public BigNumber(String number) throws Exception {

        for (int i = 0; i < number.length(); i++) {

            char temp = number.charAt(i);

            if (!Character.isDigit(temp)) {
                throw new Exception("Invalid number entered!");
            }

            this.data[i] = (byte) (temp);
        }

    }

    public BigNumber(byte[] data) {

        this.data = data.clone();

    }

}
