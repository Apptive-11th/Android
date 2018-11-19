package com.example.owner.week3_youwan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Chat extends Fragment {

    public static Chat newInstance() {
        return new Chat();
    }

    ListView listview;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_chat,null);
        listview = (ListView) view.findViewById(R.id.list_view_chat);


        chat_adapter adapter = new chat_adapter();//adapter 생성

        String context1="https://lh3.googleusercontent.com/uxvduNa7dpqMmyIlx4ZVGyy_cfoLJTC9x6wZuefj5V2z6_MjGuCdflNALtsSR-xfv3S1f4BGMrzo6lHODKO72g06Sw-_ZFT5DGDh79XHXeR6dHcgXJxLIeyKRBE0ZP-tC2SBhumPOnuHWsXjFS3fV7d_QaO139Cj0y1At9FtGoFWvVRkEobq4tazmauC5w1V7TdD0VHevgI0mG_Il4Wm6mGQEi2BHGqh9a72R-fbq7QprwYBGgFCrpMMiffR90WK6WlgLXfroqBXvirxsMNRaaU9gkKhxnrFzT60hq4aIVkZHGwTh22RO1phKFDAfCdNq_yBrGiMQj8CKa8Vv4C3_RiAHwvt3SFHjMlgMkUakoUmYiJfN97UCIdmKNiPtUSTGYLpqOGAw3Vgsq2phk25xzyqVfHEnFTbjxUAv_DokBbFX1jDKCJwDx9SFhC89XJofn5ycFg_r5menJPyWfoM5AlR9QOO8CDW-hrFLzwqo8GJH-mAKeLGQBgFQTXNHWMFgHuA-q68SK27TED89gafZcdvxAyHI5wOSBqjxdMGcVruzBrqcK4VTPMqNBOg1f5u7etLJMq3Wft-yrC2NBrDtJCi-SVLRxWJGS9aCn-fg79pbcDNkPHsUEL2oKVlhLjhLb3PW5ggoffDgMdVRXeDkMnW=w164-h218-no";
        String context2="https://lh3.googleusercontent.com/3eTyBBiiNCfXmJiIW3f4EYHl4UF2NRnv--cVzwx_zf-OOFmwvrxoTqsZgn3mKqhA-O1WO5tEmH4yGlrFqRUTYTnOmVRYj9_uuo6bB9QtdWCTKYJa9kXGXdB_n5LhT_HjNs_SaSUSBer9d2OQZPkbsj8EMmiT2Y0LCDPf0A_F4g0UCX8PEMo6bq8uSMtzNf5dFyWcBqhuWtPb4UgeIW0zN7xNjuEl2jY0PCx7PfJGEfkc3Gl3_2z-pS6FU24inDJ9i62rqamPzEL5ZMvcU6FfnFg6uUFA03T1DeVpCJB4YSmWS5GPS6lkrEvjEthKt_MlM_VxYIv0JR53CqD54ut2Wpe-koXTZ5xKkGhJJumI4Yuuz8VkrfSKr3UDkyWtql5SwIuflw0i-ndDQlhAjbPYdqXvJdyolPpSAwvfqCyUztSs0aUFg3rw0xkKTP5gjO7QOQ7r8lHZ0_sIrYL51cofuHBIMx6_9SYJUbrHH3EhHOIPW5P8TtQ8-ibYBtToXfVlJfVGON_2hQX2ShlDgcgzABRIdmd9kUf40dnUlyGsbwI1dcZc9NPgs-zhoNmmTmbc95klvQxG0YpFAA881C6Bj_cKu5zT8U416SCxuDLcBI5Sz4l-Xt844OCNYUCCJbuLc2ZKgsKPeqAhoVK5_a8zOAgG=w156-h208-no";
        String context3="https://lh3.googleusercontent.com/_VXJ3y_t1zls_jTVl4LdO4JwfBAxucVhXU3s0tkmHJ7ATl0JnDRaG0g4-ZsKCzm_ORf6mdJ0pHYtcbYxyDrfC_eNuJLOTXcBd9ceK7xhrOqr7aE1bMYSlFsYKGB-280iO-wS5B38sO0A8iZI188rArQNiNfNMi3kiiw3JW_GVyev83gLHTMyVyxisiDzp7sG5kpA-DdVWRdi-QgIWFfmfdf9607G88omzzb53n9Q5M8vmDsFIeaf0KA3KUPh_a6a_Rj9OYyU4MV9a_JMaXi5iMc1wY9g2m9eb_WBMR5PmAs1HMMbLGM2KtJseP-xAx74vfAL3YmoDTg_kL01y5tXHjOjDh9R4-OcP8r0W2bLqpqiUvQ89ic29urQ7g3YqxpKUXRxOwkE9C3w8ub9OD9_YyNpuh6apPgR0AuqGxXTAo5o5LF7peNRvxv1AkJMDwEBZZ_t8pyx7wTjOwtyoQWmrkS8G4mNnFD2mUqZjjxa77ZLNu2HzTx3-LKbrmgrc142ufDc33Xqfx2xC-o4P8IYfK22AZWh7k8j7OXrnWonciQpcu9JIYoOxiuR00vgNpkZDErFVfOk1nrFDIlnhJWDp8UaHIi-qjBhZ1iY_55z288h6i565Xeg-Px6sAZ-_ueMrZof_N3L9bXRaqGKqN9w70oX=w375-h667-no";
        String context4="https://lh3.googleusercontent.com/-knSDBws8uItqyxF1r-FQiDXWhsrc9Q6813WweYFNMtenm9KtHlvAAe_T4EGwNNIlkVSAzqIGOnnq8EphCj0hAbvbNNyVWr_cmGVTWo_eADq33RNQtnHMCpwo81JdJQ8uO9FgbDrWUIUbJdcqn-EGSazFw2iCWgvtwAy2ttdS2yxjcchYTLYO9xoEGgsnf7NmksFQCXGD7KAioqzj3wmR-6PVlqtu8tm9nQ4qjgXUN_BnYI3G0e0e7AirBezW-1ILj-Y0ELXX1OyhwOjIMOLYGxud-3-KDrnZNuGYnO-8HEgD7NnbKEI9rBPAhwnKZtFsfqXZD9N-Rnfo0-TawxyflyJb7CJ3Umjfm9Vy8gjOtNMms_q7Wa7DpTCCWI8QujcoWOzmx08MYaq2weFXABeTtD2w-QFCyqaWlbtyowAh26ivhC0GQC_y7AhlIkzt_D2xGPY7JbU_tDnjRkNnZqHNenFxvA-ZrcWnWUrB-o7R6PVYcSSWcsGDMGGgI6PzJhl3xDeQx1XmgstICXXxStPE586ZwAmaDH7y494QQ9Sis3xKpPONnIHlAV4zdQzCNlAxeaI8zO8Jn-_NkBvhNAsmcT7nNFTgInfM-mRXxlVndLUVq4h2ZU0pPHPNrxEQYgUBWfDJdGGM2D4iwPoL3nJhxoR=w670-h893-no";
        String context5="https://lh3.googleusercontent.com/IRfYyp9q14aoQ3Cm2OPNVqps0wWre1q5W7gGGcSrf9ctmsCijJZ4BeYVZWurlGBMlYa79lF91LADbvpwB2VmqP5kOGB7kZeYKSIjhuXJgaXRT9e4f014UM971Yvhvw8VEjTddHXsnOQRz1CN-LcDFdaxLMu2jHYhickE4Ew68BZHeY59AvP-41iTcE4JDqkr9CHMn7GFiuKOtgQvCZNpPzh8UI4AblZx7MSR_ejd0JPFp7V2RSN1MQ2dsJZlE6WHfhKpAPtLzVNr5IyUPaX_6FcurFjCKiwqEZibzadyw1vGAxm-ui8TO61EnXkw6-4OU0J7FF0zov5wuYBqBtFXmVAzpbNBZD80lNK-3VZn93LVwSKv9QYUl0apGIiKwarPi8W_09uZHEy3FjL-NrNlvJsBlCt5WdBkV8edYuLrvyRcJUxPgc4llVjejBuYdSOH-Yh_dH0Z1SvCh8DVbqqMPINwGgUmjDgTGzZiAuhQDm2fDcB3iXgiCSNfNSGCLJwofXauYHghOK5FJSbRYaI3FLM8QZJlfR-0y5UgkHldA4uRQh2r7cF-e__3CUGL7FxpoZCdFhKtMPW1tMURh7Z-BdoF6cTd8N-9BwrYBzDVR5JHmypedicvrRBIQfVXzaqIK8R65UR9XPDeDH7WX1NLubnS=w124-h220-no";
        String context6="https://lh3.googleusercontent.com/404Lcsd7VDtKUMT_W-sYOlVrV-1oguiWQMJeDcYX1BAZckSNT4A2bL4ZglUeyL4qEqd9raMeGlcli2fw59EiBsuR7YdcAL1UZjjWh4ObikpOJ80Tnl3RIqBxsTsJzo8egRWZLsTKf7keQVkm6FalStNrDCY48_49qME9CGAuxOUFn4opI3_WPrru-6qYbo7Yur04PlgA7-hpdrq1Fz1h5Rj-BOwmv2EoJXDl2SRiFVBjouq6-_tTzDwvzAx3zNUMa9DPreV8oWS_gUIHpw0s2aoNdhKpEb42uVeDmXpGKqc8f4a9kbyzz5j6_70eOMiRM7nMDA155squOHuofYqoLnrz3A91XMJZisDprEhfn4-T0hAhvK4EaB90l6RM2jeCVnjAzNjO0G7JYqBSYM9lFxaYey458uBcrrsj1P-WieQVtAQUdaxnQDaEGJK-gA5gsMkwIoRdwBj9q_b2bi7oFUyCmzzLHQzG_p43DRKzuvIByE6bh99iOASEYDfkSaGTy8McdFDril3yodZ85F9GmVRrPVSr8PkK0Y1a8J9Nh0wyMOOJD7E63cBzoqd_aivXAzehMa6FPGGJ9W5-fIvA9Mss4CI6FqhQNri5vonC29eA3hsY1ftHaT3IUXc65NmY7tcoYbdQOzIb0Lb1-6ABo77v=s893-no";
        String context7="https://lh3.googleusercontent.com/wEoaB2EIQQJhfhkTxyuwgzll-vuSZdXUDPaDRFCqe0YbnPVGCrM7aJFeGrwxclPfO2F9dmoWbFWMkQCLSLgACXaHnv58OpNXeYF9DTX4bRiejfoMCbzKkGcXKtyv-qQGJFXEe0DOZjr1F6l_ZhIDB3hcVHnxdihqZhrmIAW4F1LvGuAwuHtjKA90CzefDJgq4KNB8ho8_zPOXh8x_gJ48MA2Ln3Lb0gjmnmLjylu4wI2Tk68c7QbKM1czrEqhdeK7wlJpVpWg_Mwmk6W9HkZHFrYkm3__UsHLcPR0pFIcpvUg6sMMWi4cLxUvjTK7RZ4nTwl06A2LNrsCCvD_sb2akM53MDnvbz_XT-F7i3dslZzG-2sBY4P5hILjmB_p3hlJga89ZIUVyt0dQhTQfCq086VWAoTFqWhc6Mi81i431KfZLSn-QgzC74CblFnMcyXVq1m95q3QZW5WfNMtZWljWj3hUSvn1jzVT3KbrH46QCqTE1gp_xYBZISyhm3oW-k4FFAi_N5IIGsOTSrFL2l1zGIfpxwJevQ46oH5SITNrJagFFkxNNyrtzSLJ8Pnz6MOX7Hb8Ul-PTXlmn3O3zD7rpvmBh_q10wZcUN2DEgLqqwpaFushPwRwTISKfgrIihM_F5I2BiA1Imuf5sD-D8pCEO=w960-h540-no";
        String context8="https://lh3.googleusercontent.com/XNLJqkcFHOu8raIH6dT44RFB9okC1oYeatwfO5gYDgbBZ09YPdd4aSguarMPhLLRm5PYqImCmmXHL5mxD2luvO87LTxOIWm5rRNppkAn34D1-8yvzf_fUskCGCIcgsRhA-IlkTuPa-DMZiJ9ykmO0GSxfEBRFoLcmQDOAScZvzMKTemDBadvGcRCRXttMcH0-Pla1tdPvjU9x0-VOWy231Wxc2vfShYgwcm-EG-34OBWBUg-OprGdSISCDj-pugCA6bkWDDuL0JHbRw3JRMquzdVBdCbS8dewKBMOHMfeBDN3uQ2621zqC3vzarQTTrA7oi-PHavU5Uv1VNy8iUsmyBcPWBXQlFdo_QFkJ2ps5v544ULP3rmCmPLLuLIENwKtnCmd91vImyKLXvaAbygKyc2mtmc1D8OM1OLU5Grb-_l04spZsJwSJERaKryTW0Oez4qMAjtWxNllJA3fXPbEnBArnI-NOJZPesR9kIPkN11irqSgeX-wuDTcqB_fow2WgnMZNO60VnmCTEnUz9wQFUCoFOFmmLAKdr-xt69oYDjUvaL01A-Lgxga2b8DuyGTtbuAHOQ0R-pHiKJ563l7WAZxC2A6majGCWfs81C5Hd5D0aATG5iWP-vbWmG5DGO4gn_834OPCp7RBDxJu5EsCFU=w137-h184-no";





        adapter.add_chat_Item1("https://cdn-images-1.medium.com/fit/c/36/36/0*HgJ2Psmia7PjQsp9.jpg","최유완","앱티브",1);
        adapter.add_chat_Item2(context1,"https://cdn-images-1.medium.com/fit/c/36/36/0*HgJ2Psmia7PjQsp9.jpg",context2,"https://lh3.googleusercontent.com/_VXJ3y_t1zls_jTVl4LdO4JwfBAxucVhXU3s0tkmHJ7ATl0JnDRaG0g4-ZsKCzm_ORf6mdJ0pHYtcbYxyDrfC_eNuJLOTXcBd9ceK7xhrOqr7aE1bMYSlFsYKGB-280iO-wS5B38sO0A8iZI188rArQNiNfNMi3kiiw3JW_GVyev83gLHTMyVyxisiDzp7sG5kpA-DdVWRdi-QgIWFfmfdf9607G88omzzb53n9Q5M8vmDsFIeaf0KA3KUPh_a6a_Rj9OYyU4MV9a_JMaXi5iMc1wY9g2m9eb_WBMR5PmAs1HMMbLGM2KtJseP-xAx74vfAL3YmoDTg_kL01y5tXHjOjDh9R4-OcP8r0W2bLqpqiUvQ89ic29urQ7g3YqxpKUXRxOwkE9C3w8ub9OD9_YyNpuh6apPgR0AuqGxXTAo5o5LF7peNRvxv1AkJMDwEBZZ_t8pyx7wTjOwtyoQWmrkS8G4mNnFD2mUqZjjxa77ZLNu2HzTx3-LKbrmgrc142ufDc33Xqfx2xC-o4P8IYfK22AZWh7k8j7OXrnWonciQpcu9JIYoOxiuR00vgNpkZDErFVfOk1nrFDIlnhJWDp8UaHIi-qjBhZ1iY_55z288h6i565Xeg-Px6sAZ-_ueMrZof_N3L9bXRaqGKqN9w70oX=w375-h667-no","왕왕유왕왕","개발개발개발",4);
        adapter.add_chat_Item2(context4,context6,"https://cdn-images-1.medium.com/fit/c/36/36/0*HgJ2Psmia7PjQsp9.jpg",context7,"구구구구구국","해보자해보자",4);
        adapter.add_chat_Item2(context2,context5,context8,context4,"안드안드안드","헤헤",4);
        adapter.add_chat_Item1(context1,"choiyouwan","왕왕",1);
        adapter.add_chat_Item2(context5,"https://cdn-images-1.medium.com/fit/c/36/36/0*HgJ2Psmia7PjQsp9.jpg",context7,context1,"롤해야징","후아랃허하",4);
        for(int i=0;i<10;++i)
            adapter.add_chat_Item1("https://lh3.googleusercontent.com/_VXJ3y_t1zls_jTVl4LdO4JwfBAxucVhXU3s0tkmHJ7ATl0JnDRaG0g4-ZsKCzm_ORf6mdJ0pHYtcbYxyDrfC_eNuJLOTXcBd9ceK7xhrOqr7aE1bMYSlFsYKGB-280iO-wS5B38sO0A8iZI188rArQNiNfNMi3kiiw3JW_GVyev83gLHTMyVyxisiDzp7sG5kpA-DdVWRdi-QgIWFfmfdf9607G88omzzb53n9Q5M8vmDsFIeaf0KA3KUPh_a6a_Rj9OYyU4MV9a_JMaXi5iMc1wY9g2m9eb_WBMR5PmAs1HMMbLGM2KtJseP-xAx74vfAL3YmoDTg_kL01y5tXHjOjDh9R4-OcP8r0W2bLqpqiUvQ89ic29urQ7g3YqxpKUXRxOwkE9C3w8ub9OD9_YyNpuh6apPgR0AuqGxXTAo5o5LF7peNRvxv1AkJMDwEBZZ_t8pyx7wTjOwtyoQWmrkS8G4mNnFD2mUqZjjxa77ZLNu2HzTx3-LKbrmgrc142ufDc33Xqfx2xC-o4P8IYfK22AZWh7k8j7OXrnWonciQpcu9JIYoOxiuR00vgNpkZDErFVfOk1nrFDIlnhJWDp8UaHIi-qjBhZ1iY_55z288h6i565Xeg-Px6sAZ-_ueMrZof_N3L9bXRaqGKqN9w70oX=w375-h667-no","개발완료","채팅채팅채팅",1);


        listview.setAdapter(adapter);//최종구현

        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser) {
            MainActivity.image_change(1);
        } else {
            // 안보인다.
        }
        super.setUserVisibleHint(isVisibleToUser);
    }

}

