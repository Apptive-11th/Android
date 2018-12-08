package com.example.owner.week3_youwan;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;


public class Friend extends Fragment {

    public static Friend newInstance() {
        return new Friend();
    }

    ListView listview;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_friend,null);
        final View header = getLayoutInflater().inflate(R.layout.listview_layout_header, null, false) ;
        listview = (ListView) view.findViewById(R.id.list_view);
        ImageView profile_img = header.findViewById(R.id.my_profile_img);
        ImageView plus_friend =header.findViewById(R.id.puls_friend_img);
        TextView friends_num = header.findViewById(R.id.friend_num);
        ImageView recomd_friends = header.findViewById(R.id.recom_friend);

        // listView에 header, footer 추가.


        RequestOptions requestOptions = new RequestOptions();

        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(25)).override(60,60);
        Glide.with(this)
                .load("https://lh3.googleusercontent.com/i0Rsr1uIJbzvMY09Sj-BI_GuiAMtKQIiDKe4g8F9edxXToHJxS_NHwj-9TDlUVJSTjmz2ePMtX28nAXJoWORM0ioRdErJXPL_AyN0T841qTf3Pkah1WFW7ZDl2GIgFqBv5WuWGcSleYvSqlcfPT4WS88MSnsEwhuYju4lH2QBtfenn78l994D7IbzurPANhMMh0uB02vJGRCNV2JNFBiHkt_0EmFiyqfPj9o0J9xLBRsBRxuTMReXmDNDrKovQlXNmx5nxd0RdZh-N3jP0QmgyTSrE49TiaDtPxAhzQ70QyVR-17UNnmULZdeNs3xq5SXgPByXyKfpXGHui2WLFs1K4OWZidanlaKvk5Y3QxMsNgboYUrCv4kPBcHefB_XLYad-XXiV0cVIlWbYlZ7e0Jcf6O9-ELbfDo6yuzMmRwgrMxlXft5ouLolM0IrlkeWTur97-qTTMtCahUAXUyRsrIGbpJYh6cY-EhOFZ_vzJOLQwlacjMGkL9NQ7vAHKvgNm-8HIZjfdIWXQGitXWtO5TFKarQjRzxDYy_7fbLYig_OkAydWYwlDffGLAUWvdK7mtXDEH3Qx45KKdZi4s3y_x96Y5Z9P0whxqsAKWpp0J0N5bBnrnoBIcjTh-9oG5Owl_Uf657aAi7qDWGyt7_SYam1beEVutFNaAXWGt8W7lTF31zblzoQuDdTH2FYtPJ5Xj38erxBI2jMhuS39w=w960-h720-no")
                .apply(requestOptions)
                .into(profile_img);


        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(18)).override(45,45);
        Glide.with(this)
                .load("https://is4-ssl.mzstatic.com/image/thumb/Purple115/v4/e7/42/92/e74292cd-26c1-bae5-a316-a2d72fe1345e/AppIcon-1x_U007emarketing-85-220-0-9.png/246x0w.jpg")
                .apply(requestOptions)
                .into(plus_friend);

        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(18)).override(45,45);
        Glide.with(this)
                .load("https://item.kakaocdn.net/dn/11KdC/btqfcsotkFt/9xoVsNDZLRcq0VnBUHPBGK/img.png")
                .apply(requestOptions)
                .into(recomd_friends);


        listview.addHeaderView(header) ;
        user_adapter adapter = new user_adapter();//adapter 생성


        int i;

        int sum = 20;


        adapter.addItem("https://lh3.googleusercontent.com/WS9v7E1dSzjy5y4oAH8QP7e8ZyiHqXrhp9qgRe5xVxRcHqdlKuUqoYczfIFvx55zVVYxzxOsQ8krFVQsmEmoPLvGx8w5jRR9g4zli1DFaGN-VhkneCCOrpGzIL_o45PkezzGck34rWyE19RWPuHpKtxf863f9cBiuqSw76ZgQtgISvX1QJjA-4JMMcSIFOOM2XnsUmZts7OXu8rEngNUMHOpCFJry3txldKCoUbu-xPJ0OKl3KlIL297wMEWmg2sWMl6W99ooG_YOrDkaPFCggATQR8VX42GE3_Na70uN5VrQn36goOS3sr6dAQxWh0Q9xBHwryyg2ZRiekUrFzv2kIgQgiabY11kkDyd3c--aQ6UALkwrkooNG0ZVnvhf6wGiwOwdRrBRYhp53t1yUS545_iG-CbGMGA_N1Aj_k5UUAGn-GKMxDcOckova64gLOuy9MaT6NYeX5OrFEcn9ovETCIQiytUM0b_J45DfPBYhlJ8shfnh3Vi2W9I3B2aP8VGFUQGNrTDxMeWZiC7Yl6Als5h6PtG5T_HX0EOzAjFX1umAkzK2TAR3sFEM7Ry3xmtKqKbW-9Afo2LWIUesZbZCxWHtt7CatImbgZ2SrWA-ZZpCnzyKLumbq3SgA9HoiJdx7ZM6uMqGLsqaABYqePVjN=w674-h898-no","토르","우리집미친개");
        adapter.addItem("https://lh3.googleusercontent.com/GPnf9oxbZLB6wOysdEESlSRSCf7htl7Q_LvPcR5o8FLXp9k7ZsNiY6fgIwNoKdCgNecN9CuffdizUgwL6LhUq4Mwh4874cIeUxXyHBRJQm-_pBAEIHy75zApfJeg5Cz7kZAb0GZYmmkJBfdnKx8zwA9rIsYyAO3aiyqh4NI-77Y4MVfkrIbTbcgtlVxkgnTUg7GYfN89R8AzyGkuR003g5OGla9Q-rXsMzaDeMZrRdkF-0wKCqYApIV1_M-NmmppbhX728wUsx9XIxL_AiH08s5URrZ5S_jQPRKtxUw0RjLnxuAZvCGpVK9t-0IjO4aBE9RVKu31Rqv_rpV3jIF-05OUdIv3F0SQGSoqkuxfdQ9hXkHnzoIVv715cBTJAZnNXyNTFq3TpWhQDuSX9wnJS9QsQ0BM-p__iCRRlylYtVKItDQ1KTVVKbgUPW0M-LMQ9UgDEZ-a-5HBfrN5ev7lGqqWn_MVITGtqeidA6DyI9Huqd_NZNApHaqfKKRqHlZt-a7A-pdqHSfJJBx7-XhgpruH2HR5ideGOS-vVXyN4bV0GLkcZOYlwgjjQqj66NrGDaWQh6zxzAFgIH9e1ZWJ5NKOZnktN-sGhO3Ejb1fAIE8nIAW5arysLDNvqzHotj4Hnw4Acv_nm6l9LHTbc_NNFeE=s898-no","냥냥이","냥냥");
        adapter.addItem("https://lh3.googleusercontent.com/UIyllaSOMoejENBL77RTEOfa1s-ArwbOtYvf1h7NWaHxvWlZJiihmXbhJOrol4xPj9SlnBfkYtPRmWLP7Zqg0fzjPM93N2MZo9G6hQsf_NEgGPKrIX7LDS3VBP6BouLxsmeqyDot4RNgVNmV5MVmTcLOhKAZ7Rr4tXtXvnDJrdzTEO99ZIWL8ne0NXM4IY6rqJLqyQTG1-boxmmCPOKeTKU25PKWBvP05veZ2lSFJ7KZT25mJA7-l8IV5c8wGAp-U5Vjxll98jSjbPHRtLYMFuj8hv8xQMalwvIuK10HQksG3uMclzI2S2Ihq8r3hX4F3-14WrIUkcfJbZZlrMHXfVklP248_j43xqoH5htVk3EWL3KdhkbGLlc39LDsQ7DKAUH9TJ2tSnyxhOeMsEqLbZaLjqqpRyhHCNeKOGaPCTC_XYLy_PsrD6EsC6kWO1MRsLHOyUmBSpyww5SBzj94D7eY9bU942T8OluTZJzysRu6fk3bAPmdxw8amc1kbLNHkvFUx7PTkIt2itFBVN65xE8ybyfubeNBRBi4YEL2MHIldcu0u3mL3ToVswB6Tudp3qZApPKOtL8T_QqsooOBVj-80mLg7-FYYki05JCF6-XXt5kuIS6Bi5ZHOgGUxWY3gyWvzDQry8rYx2TyWnXrhsrA=w385-h425-no","sister","흥해라 흥흥!!");
        adapter.addItem("https://lh3.googleusercontent.com/QgrXPc5gGyIsztKmrOU6m9pDZYM807TTjzxrSBUWoNfGfT82nGNacwMZ5DSykr8c-n21NFA3nXTzEhMewsP7Bv7OGkx2Fe8ypnkDD3uQ4goYc8W80Cxegx2hLyDuj7iabfvjhvmgleFSsq8igIzHFVj0gelhdaE2h95dqtmWCa6g7FX4gWCDVe8f008vJn-HFbCAeq4MIN_0AMWTroJHGxcu7K5f1xrPfH4-D94DerNJeCsF-7miN_ZaUvhL90Hkp6N5OgUYNvIehvwI5Q6AWwjvv9BNc9o8nYgm0QGXW4GdnT-kIi4C2BT7fNAK7lzqNGxx3XkOstnGp2XaimHuj-L_Iory7LwPhBiHD58uG78X4CmnMZathWTz0GU2m07RNjc87L6Ha2oCoU6xRCO-6O4iQ0Z6mIU_hyzw6Nnl57JyrQGZSD57_o6l4md7G22Sh9tMFiCy_dIhmCxEKTR2_JnaDzYxh91xyCqCcZWi7e8JfCkv5bWABybUC1l09Qrz6X5HQRdwYxicX_Re3cn6xxlwhPJvZEg5ZjlwIEQiqeCIkPLl8iuwUvx-IlF8I4QsEy7gUSTyIQpk5f-9i3AYB5K8NB1rSHfWkWnKuM93F1p7wMKg-_9p94FfEkKkBfvuUaM7eWQrlfbkOiOQ_6cpFOwA=w1334-h750-no","Dance To This","노래개좋아");
        adapter.addItem("https://lh3.googleusercontent.com/GGO3elPM-b7x2QY58-jhl3_UPpwm2wdQ9OC9ghaMjCgzYqLJi-qqAP__-7_9f3Tlqjlprdr_vCpM0OrjnSKiAARItJupF4PuUinOomejPBtms0UfB2K6Kits0kJhcIQrIM0_lMYS8RQa5QR5bDy2fKF2GamuXkJWHWE2eta4-s1c8sapn5lKc_ZphuKqPEvfEFIab4TvVYSSH0IRqe-bIBNwMiJpKOVCqVc_f7nKy4Ckb039lZ_begnNiJGKMZJh9Qm_NXTfGSQcNvahoZaxdFcsNl2AWWl6MWlTGo8BWKh0vEhZ3MnbaZFYX34KsVJ7dnnY8RWXp6rN_BZCKSpK9kaNLdI9kex7irU_d5iyssir5l7-HOGt9Ty1ZO7UykROY9QGO-8XPVT9Jg_o_mKFcmH6rntEAJ3la4FJJ6pR6Ytd9D53hQo3pqSAGgrh9RYmh7Iq9IGmFgqMKAZjz-wun8EdHb0-_7IW05l2LzTMNMWJzcjauE6QjgU9CxwU3YJv5duG9Y7W7RdXTU4Tj77nUwAcF56A2mFIT15yl6OwfRKBRnf6znss6TAnohwbYA3lgqLdEPQzy5-7kHS4PfYhFaGWyIJ7dtg74oRfm-uZg9REZcpZXEbMoX8Uzpmm70jkgFGUD9dRjNTmb3c3J3xtLvvh=w131-h232-no","나이키","개사고싶음");


        for(i=0;i<sum;++i)
            adapter.addItem("https://lh3.googleusercontent.com/HzImQsl6i-LdgC_Gk0bDP7hwA0G7d7SBVzp-le0LVhNbIY8Q6MXdDIZ1WhmTfolx2eWa1LDC-qI4dj4_RgAL0q5c6hcSyDFrAerCVvqn3KxtRz-CT4fy695P_Ho8mcu_-4UPyqcvh3RjJejvFO99HMizAR44lAWjhWGgRPLHHR77TUabk1RRqc_nTSDtereI20bOG5nv8ykwfoe041P5x1MUVMF5MbvtqoszgG3COjkKQ-qIGV1yZBKHG_afyWlTGrBEMEqgRarIdt0pwrHtQiBFIHQGqvHzFapq-MDhSlGCI0NFR0BP_Ejf0xMSEOVESywJ3KS1GuYs6N3jvfjAX92cYOyBjypzhP18HuE09DIwkrQXp9iJJMaGkzHuNZauB3CCGxCNT7ZH5MXM0l51kC65xvCz87cyNjlAxkdz9B7jcqdDYuVnPizwr058Z0e8L4g2TSuLQoQMHJqnIE0a5ySz7WV9ZWNuDZHAyHlJ7KmA-7MemtNrpqin2wy8C0Ncjc6Vax0eZo2L2qBnymhK0u6H_SU2keSfjkYR44LEusLW0qrITZKuYd4quPljhmIMsAAwUjqLj91sH0rtRUXPV901XSORcj7pCyI8ReU2VQ60AWNPiHDyfgj-HUbyRoVQrZlNM4IRT5ygO1RBla24--4e=w361-h222-no","앱티브","앱개발을 앱티브로");

        sum+=5;

        friends_num.setText("친구 "+sum);


        listview.setAdapter(adapter);//최종구현
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser) {
            MainActivity.image_change(0);
        } else {
            // 안보인다.
        }
        super.setUserVisibleHint(isVisibleToUser);
    }

}

