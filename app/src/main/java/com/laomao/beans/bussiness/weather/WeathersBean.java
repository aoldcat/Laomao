package com.laomao.beans.bussiness.weather;

import java.util.List;

/**
 * Created by laomao on 16/10/19.
 */

public class WeathersBean {


    /**
     * reason : successed!
     * result : {"data":{"realtime":{"city_code":"101210701","city_name":"温州","date":"2016-10-19","time":"13:00:00","week":3,"moon":"九月十九","dataUptime":1476855365,"weather":{"temperature":"23","humidity":"88","info":"阵雨","img":"3"},"wind":{"direct":"北风","power":"0级","offset":null,"windspeed":null}},"life":{"date":"2016-10-19","info":{"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2016-10-19","info":{"day":["3","阵雨","25","东北风","微风","06:00"],"night":["3","阵雨","22","东北风","微风","17:24"]},"week":"三","nongli":"九月十九"},{"date":"2016-10-20","info":{"dawn":["3","阵雨","22","东北风","微风","17:24"],"day":["3","阵雨","27","东北风","微风","06:00"],"night":["3","阵雨","23","东北风","微风","17:23"]},"week":"四","nongli":"九月二十"},{"date":"2016-10-21","info":{"dawn":["3","阵雨","23","东北风","微风","17:23"],"day":["3","阵雨","28","东北风","微风","06:01"],"night":["3","阵雨","24","东北风","微风","17:22"]},"week":"五","nongli":"九月廿一"},{"date":"2016-10-22","info":{"dawn":["3","阵雨","24","东北风","微风","17:22"],"day":["3","阵雨","28","东北风","微风","06:02"],"night":["3","阵雨","23","东北风","微风","17:21"]},"week":"六","nongli":"九月廿二"},{"date":"2016-10-23","info":{"dawn":["3","阵雨","23","东北风","微风","17:21"],"day":["3","阵雨","27","东北风","微风","06:02"],"night":["2","阴","22","东北风","微风","17:20"]},"week":"日","nongli":"九月廿三"}],"f3h":{"temperature":[{"jg":"20161019140000","jb":"23"},{"jg":"20161019170000","jb":"24"},{"jg":"20161019200000","jb":"23"},{"jg":"20161019230000","jb":"23"},{"jg":"20161020020000","jb":"22"},{"jg":"20161020050000","jb":"22"},{"jg":"20161020080000","jb":"22"},{"jg":"20161020110000","jb":"25"},{"jg":"20161020140000","jb":"26"}],"precipitation":[{"jg":"20161019140000","jf":"0.3"},{"jg":"20161019170000","jf":"0.2"},{"jg":"20161019200000","jf":"0.5"},{"jg":"20161019230000","jf":"0.7"},{"jg":"20161020020000","jf":"0.8"},{"jg":"20161020050000","jf":"0.6"},{"jg":"20161020080000","jf":"0.6"},{"jg":"20161020110000","jf":"1.2"},{"jg":"20161020140000","jf":"1.2"}]},"pm25":{"key":"Wenzhou","show_desc":0,"pm25":{"curPm":"54","pm25":"33","pm10":"58","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"},"dateTime":"2016年10月19日13时","cityName":"温州"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}}
     * error_code : 0
     */

    private String reason;
    /**
     * data : {"realtime":{"city_code":"101210701","city_name":"温州","date":"2016-10-19","time":"13:00:00","week":3,"moon":"九月十九","dataUptime":1476855365,"weather":{"temperature":"23","humidity":"88","info":"阵雨","img":"3"},"wind":{"direct":"北风","power":"0级","offset":null,"windspeed":null}},"life":{"date":"2016-10-19","info":{"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2016-10-19","info":{"day":["3","阵雨","25","东北风","微风","06:00"],"night":["3","阵雨","22","东北风","微风","17:24"]},"week":"三","nongli":"九月十九"},{"date":"2016-10-20","info":{"dawn":["3","阵雨","22","东北风","微风","17:24"],"day":["3","阵雨","27","东北风","微风","06:00"],"night":["3","阵雨","23","东北风","微风","17:23"]},"week":"四","nongli":"九月二十"},{"date":"2016-10-21","info":{"dawn":["3","阵雨","23","东北风","微风","17:23"],"day":["3","阵雨","28","东北风","微风","06:01"],"night":["3","阵雨","24","东北风","微风","17:22"]},"week":"五","nongli":"九月廿一"},{"date":"2016-10-22","info":{"dawn":["3","阵雨","24","东北风","微风","17:22"],"day":["3","阵雨","28","东北风","微风","06:02"],"night":["3","阵雨","23","东北风","微风","17:21"]},"week":"六","nongli":"九月廿二"},{"date":"2016-10-23","info":{"dawn":["3","阵雨","23","东北风","微风","17:21"],"day":["3","阵雨","27","东北风","微风","06:02"],"night":["2","阴","22","东北风","微风","17:20"]},"week":"日","nongli":"九月廿三"}],"f3h":{"temperature":[{"jg":"20161019140000","jb":"23"},{"jg":"20161019170000","jb":"24"},{"jg":"20161019200000","jb":"23"},{"jg":"20161019230000","jb":"23"},{"jg":"20161020020000","jb":"22"},{"jg":"20161020050000","jb":"22"},{"jg":"20161020080000","jb":"22"},{"jg":"20161020110000","jb":"25"},{"jg":"20161020140000","jb":"26"}],"precipitation":[{"jg":"20161019140000","jf":"0.3"},{"jg":"20161019170000","jf":"0.2"},{"jg":"20161019200000","jf":"0.5"},{"jg":"20161019230000","jf":"0.7"},{"jg":"20161020020000","jf":"0.8"},{"jg":"20161020050000","jf":"0.6"},{"jg":"20161020080000","jf":"0.6"},{"jg":"20161020110000","jf":"1.2"},{"jg":"20161020140000","jf":"1.2"}]},"pm25":{"key":"Wenzhou","show_desc":0,"pm25":{"curPm":"54","pm25":"33","pm10":"58","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"},"dateTime":"2016年10月19日13时","cityName":"温州"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}
     */

    private ResultBean result;
    private int error_code;

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

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * realtime : {"city_code":"101210701","city_name":"温州","date":"2016-10-19","time":"13:00:00","week":3,"moon":"九月十九","dataUptime":1476855365,"weather":{"temperature":"23","humidity":"88","info":"阵雨","img":"3"},"wind":{"direct":"北风","power":"0级","offset":null,"windspeed":null}}
         * life : {"date":"2016-10-19","info":{"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}}
         * weather : [{"date":"2016-10-19","info":{"day":["3","阵雨","25","东北风","微风","06:00"],"night":["3","阵雨","22","东北风","微风","17:24"]},"week":"三","nongli":"九月十九"},{"date":"2016-10-20","info":{"dawn":["3","阵雨","22","东北风","微风","17:24"],"day":["3","阵雨","27","东北风","微风","06:00"],"night":["3","阵雨","23","东北风","微风","17:23"]},"week":"四","nongli":"九月二十"},{"date":"2016-10-21","info":{"dawn":["3","阵雨","23","东北风","微风","17:23"],"day":["3","阵雨","28","东北风","微风","06:01"],"night":["3","阵雨","24","东北风","微风","17:22"]},"week":"五","nongli":"九月廿一"},{"date":"2016-10-22","info":{"dawn":["3","阵雨","24","东北风","微风","17:22"],"day":["3","阵雨","28","东北风","微风","06:02"],"night":["3","阵雨","23","东北风","微风","17:21"]},"week":"六","nongli":"九月廿二"},{"date":"2016-10-23","info":{"dawn":["3","阵雨","23","东北风","微风","17:21"],"day":["3","阵雨","27","东北风","微风","06:02"],"night":["2","阴","22","东北风","微风","17:20"]},"week":"日","nongli":"九月廿三"}]
         * f3h : {"temperature":[{"jg":"20161019140000","jb":"23"},{"jg":"20161019170000","jb":"24"},{"jg":"20161019200000","jb":"23"},{"jg":"20161019230000","jb":"23"},{"jg":"20161020020000","jb":"22"},{"jg":"20161020050000","jb":"22"},{"jg":"20161020080000","jb":"22"},{"jg":"20161020110000","jb":"25"},{"jg":"20161020140000","jb":"26"}],"precipitation":[{"jg":"20161019140000","jf":"0.3"},{"jg":"20161019170000","jf":"0.2"},{"jg":"20161019200000","jf":"0.5"},{"jg":"20161019230000","jf":"0.7"},{"jg":"20161020020000","jf":"0.8"},{"jg":"20161020050000","jf":"0.6"},{"jg":"20161020080000","jf":"0.6"},{"jg":"20161020110000","jf":"1.2"},{"jg":"20161020140000","jf":"1.2"}]}
         * pm25 : {"key":"Wenzhou","show_desc":0,"pm25":{"curPm":"54","pm25":"33","pm10":"58","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"},"dateTime":"2016年10月19日13时","cityName":"温州"}
         * jingqu :
         * jingqutq :
         * date :
         * isForeign : 0
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * city_code : 101210701
             * city_name : 温州
             * date : 2016-10-19
             * time : 13:00:00
             * week : 3
             * moon : 九月十九
             * dataUptime : 1476855365
             * weather : {"temperature":"23","humidity":"88","info":"阵雨","img":"3"}
             * wind : {"direct":"北风","power":"0级","offset":null,"windspeed":null}
             */

            private RealtimeBean realtime;
            /**
             * date : 2016-10-19
             * info : {"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["较易发","天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}
             */

            private LifeBean life;
            private F3hBean f3h;
            /**
             * key : Wenzhou
             * show_desc : 0
             * pm25 : {"curPm":"54","pm25":"33","pm10":"58","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"}
             * dateTime : 2016年10月19日13时
             * cityName : 温州
             */

            private String jingqu;
            private String jingqutq;
            private String date;
            private String isForeign;
            /**
             * date : 2016-10-19
             * info : {"day":["3","阵雨","25","东北风","微风","06:00"],"night":["3","阵雨","22","东北风","微风","17:24"]}
             * week : 三
             * nongli : 九月十九
             */

            private List<WeatherBean> weather;

            public RealtimeBean getRealtime() {
                return realtime;
            }

            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }

            public F3hBean getF3h() {
                return f3h;
            }

            public void setF3h(F3hBean f3h) {
                this.f3h = f3h;
            }


            public String getJingqu() {
                return jingqu;
            }

            public void setJingqu(String jingqu) {
                this.jingqu = jingqu;
            }

            public String getJingqutq() {
                return jingqutq;
            }

            public void setJingqutq(String jingqutq) {
                this.jingqutq = jingqutq;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }

            public List<WeatherBean> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherBean> weather) {
                this.weather = weather;
            }

            public static class RealtimeBean {
                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private int week;
                private String moon;
                private int dataUptime;
                /**
                 * temperature : 23
                 * humidity : 88
                 * info : 阵雨
                 * img : 3
                 */

                private WeatherBean weather;
                /**
                 * direct : 北风
                 * power : 0级
                 * offset : null
                 * windspeed : null
                 */

                private WindBean wind;

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public int getWeek() {
                    return week;
                }

                public void setWeek(int week) {
                    this.week = week;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public WeatherBean getWeather() {
                    return weather;
                }

                public void setWeather(WeatherBean weather) {
                    this.weather = weather;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public static class WeatherBean {
                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }

                public static class WindBean {
                    private String direct;
                    private String power;
                    private Object offset;
                    private Object windspeed;

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public Object getOffset() {
                        return offset;
                    }

                    public void setOffset(Object offset) {
                        this.offset = offset;
                    }

                    public Object getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(Object windspeed) {
                        this.windspeed = windspeed;
                    }
                }
            }

            public static class LifeBean {
                private String date;
                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private List<String> chuanyi;
                    private List<String> ganmao;
                    private List<String> kongtiao;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> ziwaixian;

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }
                }
            }

            public static class F3hBean {
                /**
                 * jg : 20161019140000
                 * jb : 23
                 */

                private List<TemperatureBean> temperature;
                /**
                 * jg : 20161019140000
                 * jf : 0.3
                 */

                private List<PrecipitationBean> precipitation;

                public List<TemperatureBean> getTemperature() {
                    return temperature;
                }

                public void setTemperature(List<TemperatureBean> temperature) {
                    this.temperature = temperature;
                }

                public List<PrecipitationBean> getPrecipitation() {
                    return precipitation;
                }

                public void setPrecipitation(List<PrecipitationBean> precipitation) {
                    this.precipitation = precipitation;
                }

                public static class TemperatureBean {
                    private String jg;
                    private String jb;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJb() {
                        return jb;
                    }

                    public void setJb(String jb) {
                        this.jb = jb;
                    }
                }

                public static class PrecipitationBean {
                    private String jg;
                    private String jf;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJf() {
                        return jf;
                    }

                    public void setJf(String jf) {
                        this.jf = jf;
                    }
                }
            }


            public static class WeatherBean {
                private String date;
                private InfoBean info;
                private String week;
                private String nongli;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public static class InfoBean {
                    private List<String> day;
                    private List<String> night;

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }
    }
}
