class Funksion{
public static int chopa(int a){
int b=1;
for(int i=a;i>0;i--){
    b*=i;
}
System.out.println(b);
return b;
    }
    public static void main(String[] args) {
        int d=5;
        chopa(d);
    }
}

