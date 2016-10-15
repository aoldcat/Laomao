package com.laomao.beans.bussiness.joke;

import java.util.List;

/**
 * Created by laomao on 16/10/11.
 */

public class JokeBean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"一屌丝开车和朋友出去玩，右边跟上一BMW，　　摇下窗指着他们。同事V5，直接伸出头去对BMW男，　　嗷嗷一顿臭骂，行使四五百米时，一起等红灯，　　BMW男又摇下窗：\u201c你后胎没气了！\u201d","hashId":"dd99d351a6b21346da17715f88d75843","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"学生甲：\u201c教室后门开了越来越觉得危险。\u201d　　同学乙：\u201c怎么了？\u201d　　甲：\u201c上次上英语课自拍，拍完看照片发现班主任在里面\u2026\u201d","hashId":"333a417960bdbbe79c07b4229aba80a4","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"一男生和女友吵架，闹的很凶，最后竟然说出了分手。　　男生看着女友哭着收拾东西要走人，顿时急了。　　立马蹦出一句：\u201c好歹也要等我赚个千儿八百万，　　然后和你结婚了再走啊。到时候你还能分一半家产呢！\u201d　　这话果然见效。女友丢了东西就抱着他，笑了。","hashId":"196aafb51281cf7ea598b986fc78c80d","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"和朋友吃饭，点菜的时候朋友点了个加长鲫鱼。　　二货媳妇突然惊呼。鲫鱼还有加长的？　　好吧，菜单上写的家常鲫鱼。　　这谁媳妇啊！！！！！我不认识。。","hashId":"db2215194bdcc34ffade956632a217fe","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"过年回乡下，听闻，老家邻居有头猪，　　进栏5年未被宰，开始以为是养出感情了，　　主人不打算吃之。细闻原因，顿时凌乱，　　每年的从10月开始，疯狂节食，运动，　　总在是出栏时期，永远都是最瘦的。　　这货已经不是猪了，怕是要成精了。","hashId":"39c88b58318a1c12afa2b14f75f89ce8","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"老婆：\u201c你送我100元的衣服，简直是对我的侮辱。　　道歉太不诚恳，我不接受。\u201d 　　老公：\u201c那么我应该怎么做才能令你接受呢？\u201d　　老婆：\u201c起码买件200元的。\u201d　　老公：\u201c我怎么敢一下侮辱你两次呢？\u201d","hashId":"1433c48d18fd35fb70f33abf82bf3031","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"下午，总经理走近四个女同事旁，　　\u201c美丽小姐儿们，要不要猜谜啊？ 　　　　猜人身上的东西：\u201c上面有毛,下面也有毛,晚上就来个毛对毛。\u201d?　　　　\u201c唉呀呀，总经理好色，人家不来了啦！\u201d　　　　\u201c喂喂，别想歪了，答案是\u2018眼睛\u2019\u201d","hashId":"a6fc4575d35c6d77a3c7f3635984532f","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"新郎结婚，新郎和亲戚们喝得大醉！ 　　新娘的大姨拉着新郎说：\u201c我们家小芳跟了你五六年了，　　娃都打掉俩了，现在你能娶了她，我们都很高兴！希望你们白头偕老！\u201d　　新郎顿时醉意全无！惊呼：\u201c我们认识才半年啊！\u201d","hashId":"5766acd141ea1300b2d1e02fb702fe71","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"昨晚奇葩老婆忽然对我说：\u201c皇上，臣妾有一事相求！\u201d 　　\u201c但说无妨。\u201d 　　\u201c恳请将臣妾打入冷宫，臣妾受不了了，这天太热了！\u201d 　　我\u2026","hashId":"868be036cb80addaae9a72d2266600ea","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"},{"content":"某男在女友脖子上吻了个草莓，被七岁的小侄女看到，　　侄女说：\u201c阿姨，你脖子怎么回事啊？\u201d　　不好意思的回答：\u201c被狗咬的。\u201d　　侄女惊讶的说：\u201c啊？那你打针没有，会得狂犬病的。\u201d　　某女淡定的答：\u201c打了，昨晚刚打了！\u201d　　秒懂的有木有？","hashId":"78080dba8359e0325f411c68aa279f43","unixtime":1476146030,"updatetime":"2016-10-11 08:33:50"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * content : 一屌丝开车和朋友出去玩，右边跟上一BMW，　　摇下窗指着他们。同事V5，直接伸出头去对BMW男，　　嗷嗷一顿臭骂，行使四五百米时，一起等红灯，　　BMW男又摇下窗：“你后胎没气了！”
         * hashId : dd99d351a6b21346da17715f88d75843
         * unixtime : 1476146030
         * updatetime : 2016-10-11 08:33:50
         */

        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
