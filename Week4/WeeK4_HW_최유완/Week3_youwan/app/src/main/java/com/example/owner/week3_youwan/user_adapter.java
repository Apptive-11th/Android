package com.example.owner.week3_youwan;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import java.util.ArrayList;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;


public class user_adapter extends BaseAdapter {

    Context context;


    ArrayList<list_item> userList = new ArrayList<list_item>();
    RecyclerView.ViewHolder viewHolder;

    public user_adapter() {
        this.context=context;
        this.userList=userList;
    }

    @Override//우리가 만들고싶은 userList의 크기를 반환함
    public int getCount() {
        return userList.size();
    }

    @Override//객체를 하나씩 반환한다.
    public Object getItem(int i) {
        return userList.get(i);
    }

    @Override//순서를 반환한다.
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        context = viewGroup.getContext();


        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = 150;
            view.setLayoutParams(layoutParams);
        }//view를 처음 생성할때 view가 null이므로 listview_item이라는 모델을 여기서 제시해준다.

        ImageView img = (ImageView)view.findViewById(R.id.user_image);
        TextView name = view.findViewById(R.id.user_text);
        TextView balloon = view.findViewById(R.id.user_ballon);


        list_item user = userList.get(i);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(18)).override(45,45);

        Glide
                .with(context)
                .load(user.getImg())
                .apply(requestOptions)
                .into(img);
        //img.setImageResource(user.getImg());
        name.setText(user.getName());
        balloon.setText(user.getBalloon());

        return view;
    }
    public void addItem(String img, String name, String balloon) {
        list_item new_user = new list_item(img, name, balloon);
        userList.add(new_user);
    }
}
