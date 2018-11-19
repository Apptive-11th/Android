package com.example.owner.week3_youwan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class chat_adapter extends BaseAdapter {

    Context context;
    LinearLayout mRootLinear;
    static int num;
    ImageView chat_img;
    LinearLayout chat_img_four;


    ArrayList<list_chat_item> chatList = new ArrayList<list_chat_item>();


    public chat_adapter() {
        this.context=context;
        this.chatList=chatList;
    }

    @Override//우리가 만들고싶은 userList의 크기를 반환함
    public int getCount() {
        return chatList.size();
    }

    @Override//객체를 하나씩 반환한다.
    public Object getItem(int i) {
        return chatList.get(i);
    }

    @Override//순서를 반환한다.
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        context = viewGroup.getContext();
        list_chat_item user = chatList.get(i);


        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_chat_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = 200;
            view.setLayoutParams(layoutParams);



            if (user.getNum()==1)
            {

                mRootLinear = (LinearLayout)view.findViewById(R.id.linear_root);
                chat_img =(ImageView)inflater.inflate(R.layout.inflate_img,mRootLinear,false);
                mRootLinear.addView(chat_img);
                //inflater.inflate(R.layout.inflate_img,mRootLinear,true);

                RequestOptions requestOptions = new RequestOptions();
                requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(20)).override(60, 60);

                Glide
                        .with(context)
                        .load(user.getImg())
                        .apply(requestOptions)
                        .into(chat_img);
            }

            if(user.getNum()==4){
                Log.i("TEST","getNUM()==4일때로 들어왔음");
                mRootLinear = (LinearLayout)view.findViewById(R.id.linear_root);
                chat_img_four =(LinearLayout) inflater.inflate(R.layout.inflate_img_four,mRootLinear,false);
                mRootLinear.addView(chat_img_four);
                //inflater.inflate(R.layout.inflate_img,mRootLinear,true);

                ImageView img_1 = (ImageView)view.findViewById(R.id.image_attach1);
                ImageView img_2 = (ImageView)view.findViewById(R.id.image_attach2);
                ImageView img_3 = (ImageView)view.findViewById(R.id.image_attach3);
                ImageView img_4 = (ImageView)view.findViewById(R.id.image_attach4);


                RequestOptions requestOptions = new RequestOptions();
                requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(20)).override(60, 60);

                Glide
                        .with(context)
                        .load(user.getImg1())
                        .apply(requestOptions)
                        .into(img_1);
                Glide
                        .with(context)
                        .load(user.getImg2())
                        .apply(requestOptions)
                        .into(img_2);
                Glide
                        .with(context)
                        .load(user.getImg3())
                        .apply(requestOptions)
                        .into(img_3);
                Glide
                        .with(context)
                        .load(user.getImg4())
                        .apply(requestOptions)
                        .into(img_4);
            }

        }//view를 처음 생성할때 view가 null이므로 listview_item이라는 모델을 여기서 제시해준다.

        TextView name = view.findViewById(R.id.chat_name);
        TextView chat_last = view.findViewById(R.id.chat_last_word);


        //img.setImageResource(user.getImg());
        name.setText(user.getChat_name());
        chat_last.setText(user.getLast_word());



        return view;
    }

    public void add_chat_Item1(String img, String chat_name, String last_word,int num) {
        list_chat_item new_chat = new list_chat_item(img, chat_name, last_word, num);
        chatList.add(new_chat);
    }
    public void add_chat_Item2(String img1, String img2 , String img3, String img4, String chat_name, String last_word,int num) {
        list_chat_item new_chat = new list_chat_item(img1, img2, img3, img4, chat_name, last_word, num);
        chatList.add(new_chat);
    }
}
