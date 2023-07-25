package Callculator;

public class Operation {
    private double material;
    private double imaginary;

    /**
     *
     * @param material      Вещественное число 
     * @param imaginary     Мнимое число
     */
    public Operation(double material, double imaginary) {
        this.material = material;
        this.imaginary = imaginary;
    }
    
    public Operation add(Operation other) {
        double sumMaterial = this.material + other.material;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Operation(sumMaterial, sumImaginary);
    }

    public Operation multiplication(Operation other) {
        double productMaterial = this.material * other.material - this.imaginary * other.imaginary;
        double productImaginary = this.material * other.imaginary + this.imaginary * other.material;
        return new Operation(productMaterial, productImaginary);
    }


    public Operation divide(Operation other) {
        double divisor = other.material * other.material + other.imaginary * other.imaginary;
        double qMaterial = (this.material * other.material + this.imaginary * other.imaginary) / divisor;
        double qImaginary = (this.imaginary * other.material - this.material * other.imaginary) / divisor;
        return new Operation(qMaterial, qImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return material + " + " + imaginary + "i";
        } else {
            return material + " - " + Math.abs(imaginary) + "i";
        }
    }
}
