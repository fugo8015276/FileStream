import java.io.IOException;

public class StandardIOSample{
    public static void main(String[] args){
        try {
            int data;
            while((data = System.in.read()) != -1) {
                System.out.print( (char)data );
            }
        } catch(IOException e) {
            //エラー文をコンソールに出力する場合は、errを用いる。
            System.err.println("エラーが発生しました");
        }
    }
}
