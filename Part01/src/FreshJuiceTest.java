/**
 * Created by 100068 on 2015/3/2.
 */
public class FreshJuiceTest {

    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice.size);
    }
}

class FreshJuice{
    enum FreshJuiceSize{ SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}
