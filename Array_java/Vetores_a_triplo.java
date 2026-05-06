void main(){
    var a = new int[8];
    var b = new int[8];
    
    IO.println("Vetor A: ");
    for (int i=0;i<8;i++){
        a[i] = Integer.parseInt(IO.readln("A[" + i + "]: "));
        b[i] = a[i] * 3;
    }
    IO.println("Vetor B: ");
    for (int i=0;i<8;i++)
        IO.println("B[" + (i) + "]: " + b[i]);
}