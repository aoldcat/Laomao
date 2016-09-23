package com.laomao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import rx.Observable;
import rx.Subscriber;


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
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("蜗牛 is 2B");
                subscriber.onCompleted();
            }
        });
        observable.subscribe(subscriber);
    }

    Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {
            Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
        }
    };

    public native String stringFromJNI();

    static {
        System.loadLibrary("native-lib");
    }

}
