package dataStructureSudy.base01;

public class ArrayPractice {

    public static void main(String[] args) {

        /**
         * 아래 1차원 배열에서, 문자 M을 가지고 잇는 아이템의 수를 출력하기
         */

        String dataSet[] = {
                "Braund, Mr.Owen Harris",
                "Cumings,Mrs.John Bradley(Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs.Jacques Heath(Lily May Peel)",
                "Allen, Mr.William Henry",
                "Moran, Mr.James",
                "McArthy, Mr. Timothy J",
                "Palsson,Master. Gosta Leonard",
                "Enir, Mr.Farred Chehab",
                "Fortune, Mr.Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr.Lalio"
        };

        Integer count = 0;

        for(Integer i = 0; i<dataSet.length; i++) {

            if(dataSet[i].indexOf('M') > 0) {
                System.out.println(dataSet[i]);
                count++;
            }
        }

        System.out.println(count);
    }

}
