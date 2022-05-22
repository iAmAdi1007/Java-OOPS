class Complex{
    //data members
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //Getter Methods
    public int getReal(){
        return this.real;
    }
    public int getImaginary(){
        return this.imaginary;
    }

    //Setter Methods
    public void setReal(int real){
        this.real = real;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    public void add(Complex n){
        this.real += n.real;
        this.imaginary += n.imaginary;
    }

    public void multiply(Complex n){
        //System.out.println("Multiplying " + this.print() + " & " + n.print());
        int real = ((this.real * n.real) - (this.imaginary * n.imaginary));
        int imaginary = ((this.real * n.imaginary) + (this.imaginary * n.real));
        this.real = real;
        this.imaginary = imaginary;
    }

    public String print(){
        return (this.real + " + " + this.imaginary + "i");
    }
}