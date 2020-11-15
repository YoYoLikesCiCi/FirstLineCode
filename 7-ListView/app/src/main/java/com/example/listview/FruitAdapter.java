package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    //重写了父类的一组构造函数，用于将上下文、ListView子项布局的id和数据都传递进来。
    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    //重写了getView（）方法，在每个子项被滚动到屏幕内的时候会被调用
    //getItem()得到当前项的Fruit实例，然后使用LayoutInflater为这个子项加载传入的布局。
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Fruit fruit = getItem(position) ; //获取当前的Fruit实例

        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);//接收三个参数，第三个指定成false，表示只让父布局中声明的layout属性生效，但不为这个View添加父布局，不然它就不能再添加到ListView中了。
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }
}