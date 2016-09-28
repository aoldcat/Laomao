package com.laomao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.laomao.beans.Laomao;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.sample_text)
    TextView tvSmaple;
    @BindView(R.id.tv_laomao)
    TextView tvLaomao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvLaomao.setText("laomao");
//        tvSmaple.setText(stringFromJNI());
        laomaoTest();
        query("hello").flatMap(urls -> Observable.from(urls))
                .flatMap(url -> getTitle(url))
                .filter(title->title.startsWith("s1"))
                .subscribe(action1);
    }

    Observable<List<String>> query(String text) {
        return Observable.just(Arrays.asList(new String[]{"s1" + text, "s2" + text}));
    }

    Observable<String> getTitle(String URL) {
        if ("404".equals(URL)) {
            return null;
        } else {
            return Observable.just( URL+"title");
        }
    }

    private void laomaoTest() {
        //基本用法
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

    Action1<String> action1 = new Action1<String>() {
        @Override
        public void call(String str) {
            Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
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
