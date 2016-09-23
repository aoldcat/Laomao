package com.laomao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.laomao.beans.Laomao;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
        laomaoTest();
    }

    private void laomaoTest() {
        Laomao laomao = new Laomao();
        laomao.setId("0");
        laomao.setName("老猫");
        laomao.setAge("18");

        Observable.just(laomao).map(s -> {
            s.setAge("80");
            return s;
        }).subscribe(s -> {
            Toast.makeText(MainActivity.this, laomao.toString(), Toast.LENGTH_SHORT).show();
        });




//        Observable<Laomao> observable = Observable.just(laomao);
//        observable.subscribe(action1);

//        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                subscriber.onNext("蜗牛 is 2B");
//                subscriber.onCompleted();
//            }
//        });
//        observable.subscribe(subscriber);
    }

    Action1<Laomao> action1 = new Action1<Laomao>() {
        @Override
        public void call(Laomao laomao) {
            Toast.makeText(MainActivity.this, laomao.toString(), Toast.LENGTH_SHORT).show();
        }
    };

    Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
        }
    };

    public native String stringFromJNI();

    static {
        System.loadLibrary("native-lib");
    }

}
