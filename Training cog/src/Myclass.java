public class Myclass {

    public static void main(String[] args) {


    }

}

class Product {
    int count = 5;

    public void buyProduct() throws productNotAvailableException {
        if (this.count > 0) {
            this.count -= 1;
        } else {
            throw new productNotAvailableException("No Stock");
        }
    }
}

class productNotAvailableException extends Exception {
    public productNotAvailableException(String message) {
        super(message);
    }
}