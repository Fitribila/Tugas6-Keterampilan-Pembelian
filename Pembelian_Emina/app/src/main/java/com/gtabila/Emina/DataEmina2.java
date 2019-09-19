package com.gtabila.Emina;

import java.util.ArrayList;

public class DataEmina2 {
    public static String[][] data = new String[][]{
            {"Ceklit", "https://soc-phoenix.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2019/03/21150624/Rekomendasi-produk-Emina.jpg"},
            {"Ceklit Padat", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8fvcVS3AWH6TIe4KSVRZ-4M-X0NE4Le18JZ6b_a1_LcVB0CIx"},
            {"Body Sobet", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRrqi_Q684IAefl2AcOrSkdEJvs9iKk4zzz006BpRYI_kMLPIxLg"},
            {"Stuff", "https:https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqYg2lL6xtC0lYiCSshyJ40VB9E2fhEHmzc2dx20gVcvzx8rdsTg"},
            {"Lipt Cream", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRZ3HPtLHTsRr7DTl75YgY5TrmhvN0JE5DikwySBXGKzXX0qdVpA"},
            {"Lipt Cushion", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSftAu2NM7FY3WCIVf2Gm4sn9RWDk5bFCkrGz5VCMVJ8oHU7KVi_w"},
            {"Liptin", "https://cdn.qupas.id/qupas/image/upload/w_720/discoveries/0179efa16024e78c7c2dee5c66363059_jp02mh"},
            {"sugarrush", "https://3.bp.blogspot.com/-WEqrgwztTZA/WxetxeI0QOI/AAAAAAAABls/Y3W9-Uci7LAk3ezWo-U6YVOyiZT5-z4qwCLcBGAs/s1600/5.%2BSugar%2BRush%2BLip%2BScrub%2BEmina.jpg"},
            {"Facemask", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPEfxIwQ-QUl9cf6HshpfY8y6wOzdlYaKNY9PmdcgZyjrCNQBc"},
            {"Body mist", "https://s4.bukalapak.com/img/4001380763/large/EMINA_BODY_MIST.jpg"},

    };

    public static ArrayList<DataEmina> getListData(){
        ArrayList<DataEmina> list = new ArrayList<>();
        for(String[] aData : data){
            DataEmina dataEmina = new DataEmina();
            dataEmina.setNama(aData[0]);
            dataEmina.setFoto(aData[1]);
            list.add(dataEmina);
        }

        return list;
    }
}
