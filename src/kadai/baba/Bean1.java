package WebService.src.kadai.baba;

import java.io.Serializable;
import java.util.ArrayList;
public class Bean1 implements Serializable{

	private String station;
	private ArrayList <String> cafe =new ArrayList<>();


	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public ArrayList<String> getCafe() {
		return cafe;
	}
	public void setCafe(ArrayList<String> cafe) {
		this.cafe = cafe;
	}



	public void judge() {
		if (station.equals("青山一丁目")) {
			cafe.add("Royal Garden Cafe AOYAMA");
			cafe.add("royalgarden.jpg");
			cafe.add("https://royal-gardencafe.com/aoyama/");

			cafe.add("タリーズコーヒー青山一丁目店");
			cafe.add("tarizuaoyama.jpg");
			cafe.add("https://map.tullys.co.jp/tullys/detailMap?account=tullys&accmd=0&bid=862&pgret=2&c21=1");

			cafe.add("スタンダードコーヒー青山");
			cafe.add("standard.jpg");
			cafe.add("https://standard-coffee.jp/");
		}

		else if (station.equals("表参道")) {
			cafe.add("ピアーズカフェ南青山店");
			cafe.add("pier.jpg");
			cafe.add("https://piers-cafe.jp/minami-aoyama/");

			cafe.add("上島珈琲店　青山店");
			cafe.add("uesima.jpg");
			cafe.add("https://www.ueshima-coffee-ten.jp/");

			cafe.add("76CAFE omotesando");
			cafe.add("76.jpg");
			cafe.add("https://76cafe.owst.jp/");

			cafe.add("ロータス");
			cafe.add("rotas.jpg");
			cafe.add("http://www.heads-west.com/shop/lotus.html");

			cafe.add("モントーク");
			cafe.add("montalk.jpg");
			cafe.add("https://www.montoak.com/");
		}

		else if (station.equals("赤坂")) {
			cafe.add("ウニール 赤坂店");
			cafe.add("unir.jpg");
			cafe.add("https://www.unircoffee-h.com/");

			cafe.add("スターバックスコーヒー赤坂Bizタワー店");
			cafe.add("stababiz.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-777/");

			cafe.add("上島珈琲店 相鉄フレッサイン東京赤坂店");
			cafe.add("ueshimaakasaka.jpg");
			cafe.add("https://www.ueshima-coffee-ten.jp/");

			cafe.add("KEY’S CAFÉ ファーストキャビン赤坂店");
			cafe.add("keys.jpg");
			cafe.add("https://www.keycoffee.co.jp/store/keyscafe#pref013");

			cafe.add("タリーズコーヒー 赤坂店");
			cafe.add("tarisakasaka.jpg");
			cafe.add("http://www.tullys.co.jp/");
		}

		else if (station.equals("赤坂見附")) {
			cafe.add("ホノルルコーヒー 赤坂見附店");
			cafe.add("honoruru.jpg");
			cafe.add("http://honolulucoffee.co.jp/location/locations/akasakamitsuke.html");

			cafe.add("スターバックスコーヒー赤坂見附店");
			cafe.add("sutabamituke.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-142/");

			cafe.add("サンマルクカフェ ビックカメラ赤坂見附駅店");
			cafe.add("sanmarumituke.jpg");
			cafe.add("https://www.saint-marc-hd.com/b/saintmarc/info/20375/");

			cafe.add("エクセルシオール カフェ ホテルザ・ビー赤坂見附店");
			cafe.add("ekuserumituke.jpg");
			cafe.add("https://www.doutor.co.jp/exc/");

			cafe.add("喫茶室ルノアール 赤坂見附店");
			cafe.add("runoarmituke.jpg");
			cafe.add("https://www.ginza-renoir.co.jp/shopsearch/shops/view/10");
		}

		else if (station.equals("外苑前")) {
			cafe.add("DEAN & DELUCA カフェ青山");
			cafe.add("deangaien.jpg");
			cafe.add("https://www.deandeluca.co.jp/ddshop/50029");

			cafe.add("プロント 外苑前店");
			cafe.add("prontgaien.jpg");
			cafe.add("https://www.pronto.co.jp/");

			cafe.add("スターバックスコーヒー 南青山２丁目店");
			cafe.add("stabagaien.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-15/");
		}

		else if (station.equals("新橋")) {
			cafe.add("カフェ・ド・クリエ 新橋赤レンガ通り店");
			cafe.add("crie.jpg");
			cafe.add("https://www.pokkacreate.co.jp/");

			cafe.add("喫茶室ルノアール 新橋汐留口駅前店");
			cafe.add("runoarsinbasi.jpg");
			cafe.add("https://www.ginza-renoir.co.jp/shopsearch/shops/view/18");

			cafe.add("PRONTO 新橋駅前店");
			cafe.add("prontsinbasi.jpg");
			cafe.add("https://www.pronto.co.jp/shop/detail?shopid=0X00096755&prefcode=&freewordtext=%90V%8B%B4%89w%91O&pageno=1&service=&shopstyle=");

			cafe.add("スターバックスコーヒー 新橋駅前店");
			cafe.add("sutabasinbasi.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-108/");

			cafe.add("ニュー新橋コワーキング");
			cafe.add("new.jpg");
			cafe.add("https://www.nscow.com/");
		}

		else if (station.equals("虎ノ門")) {
			cafe.add("THE 3RD CAFE by Standard Coffee");
			cafe.add("3rd.jpg");
			cafe.add("http://standard-coffee.jp/");

			cafe.add("スターバックスコーヒー 虎ノ門駅前店");
			cafe.add("stabatora.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-65/");

			cafe.add("エクセルシオール カフェ 虎ノ門店");
			cafe.add("ekuserutora.jpg");
			cafe.add("https://www.doutor.co.jp/excelsiorcaffe/");

			cafe.add("CAFFE VELOCE 虎ノ門店");
			cafe.add("velotora.jpg");
			cafe.add("https://chatnoir-company.com/chatnoir/html/index.html");


		}

		else if (station.equals("麻布十番")) {
			cafe.add("上島珈琲店 麻布十番店");
			cafe.add("ueshimaazabu.jpg");
			cafe.add("https://www.ueshima-coffee-ten.jp/");

			cafe.add("スターバックスコーヒー ");
			cafe.add("stabaazabu.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-27/");

			cafe.add("ホノルルコーヒー 麻布十番店");
			cafe.add("honoazabu.jpg");
			cafe.add("http://honolulucoffee.co.jp/");

			cafe.add("タリーズコーヒー麻布十番駅前店");
			cafe.add("tarisazabu.jpg");
			cafe.add("http://www.tullys.co.jp/");
		}
		else if (station.equals("白金台")) {
			cafe.add("スターバックスコーヒー 白金高輪店");
			cafe.add("stabasiro.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-632/");

			cafe.add("ジョナサン 白金台店");
			cafe.add("jonasiro.jpg");
			cafe.add("https://store-info.skylark.co.jp/jonathan/map/020460");
		}
		else if (station.equals("六本木一丁目")) {
			cafe.add("DEAN & DELUCA カフェ赤坂アークヒルズ");
			cafe.add("dean6.jpg");
			cafe.add("https://www.deandeluca.co.jp/");

			cafe.add("スターバックスコーヒー アークヒルズサウスタワー店");
			cafe.add("staba6.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-1197/");

			cafe.add("タリーズコーヒー 六本木３丁目ナナナリア店");
			cafe.add("taris6.jpg");
			cafe.add("http://www.tullys.co.jp/");

			cafe.add("スターバックスコーヒー アークヒルズ店");
			cafe.add("staba62.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-6/");
		}
		else if (station.equals("乃木坂")) {
			cafe.add("CAFE DE CORE NOGIZAKA");
			cafe.add("core.jpg");
			cafe.add("http://cafe-de-core.com/");

			cafe.add("Mercedes me Tokyo / DOWNSTAIRS COFFEE");
			cafe.add("down.jpg");
			cafe.add("https://www.transit-web.com/content/shops/downstairs-coffee/downstairs/");

			cafe.add("銀座ウエスト 青山ガーデン");
			cafe.add("west.jpg");
			cafe.add("http://ginza-west.co.jp/");

			cafe.add("PARK6 powered by bondolfi boncaffē");
			cafe.add("park6.jpg");
			cafe.add("https://www.park6.jp/");
		}
		else if (station.equals("六本木")) {
			cafe.add("喫茶室ルノアール 六本木ラピロス店");
			cafe.add("runor6.jpg");
			cafe.add("https://www.ginza-renoir.co.jp/shopsearch/shops/view/26");

			cafe.add("星乃珈琲店 六本木店");
			cafe.add("hosino6.jpg");
			cafe.add("http://www.hoshinocoffee.com/");

			cafe.add("ヒルズカフェ / スペース｜六本木");
			cafe.add("hirus.jpg");
			cafe.add("https://www.transit-web.com/content/shops/hills_cafe/");

			cafe.add("スターバックスコーヒー TSUTAYA TOKYO ROPPONGI店");
			cafe.add("tutaya6.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-2002/");

			cafe.add("スターバックスコーヒー 六本木ヒルズ ウエストウォーク ラウンジ店");
			cafe.add("stabarounge.jpg");
			cafe.add("https://www.roppongihills.com/shops_restaurants/restaurants/00141.html");

			cafe.add("STREAMER ESPRESSO Roppongi");
			cafe.add("esp6.jpg");
			cafe.add("http://streamer.coffee/location.html");
		}
		else if (station.equals("神谷町")) {
			cafe.add("プロント イルバール 神谷町店");
			cafe.add("pronti.jpg");
			cafe.add("https://www.pronto.co.jp/shop/detail?shopid=0X00063467");

			cafe.add("上島珈琲店 神谷町駅前店");
			cafe.add("uekami.jpg");
			cafe.add("https://www.ueshima-coffee-ten.jp/");

			cafe.add("タリーズコーヒー 神谷町プライムプレイス店");
			cafe.add("tariskamiya.jpg");
			cafe.add("https://www.tullys.co.jp/");

			cafe.add("エクセルシオール カフェ 神谷町店");
			cafe.add("ekuserukami.jpg");
			cafe.add("https://www.doutor.co.jp/exc/");
		}

		else if (station.equals("広尾")) {
			cafe.add("HATONOMORI GARDEN (旧/cafe early bird)");
			cafe.add("bird.jpg");
			cafe.add("http://hiroo.hatonomori.com/index_pc.html");

			cafe.add("スターバックスコーヒー 広尾店");
			cafe.add("stabahiroo.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-422/");

			cafe.add("上島珈琲店 広尾店");
			cafe.add("uehiro.jpg");
			cafe.add("https://www.ueshima-coffee-ten.jp/");

		}
		else if (station.equals("泉岳寺")) {
			cafe.add("タリーズコーヒー 泉岳寺店");
			cafe.add("tarissen.jpg");
			cafe.add("https://www.tullys.co.jp/");

			cafe.add("バンブルビー カフェ");
			cafe.add("banburu.jpg");
			cafe.add("https://tabelog.com/tokyo/A1314/A131403/13232409/");
		}
		else if (station.equals("大門")) {
			cafe.add("カフェ・ド・クリエ浜松町店");
			cafe.add("criedaimon.jpg");
			cafe.add("https://www.pokkacreate.co.jp/shops/detail/88");

			cafe.add("上島珈琲店 大門店");
			cafe.add("ueshimadaimon.jpg");
			cafe.add("https://www.ueshima-coffee-ten.jp/");

			cafe.add("サンマルクカフェ 浜松町貿易センタービル店");
			cafe.add("sanmadaimon.jpg");
			cafe.add("https://www.saint-marc-hd.com/saintmarccafe/");

			cafe.add("プロント 浜松町店");
			cafe.add("prontdai.jpg");
			cafe.add("https://www.pronto.co.jp/shop/detail?shopid=0334362406");
		}
		else if (station.equals("高輪台")) {
			cafe.add("JACK MACKEREL SANDWICHJACK MACKEREL SANDWICH");
			cafe.add("jack.jpg");
			cafe.add("http://jackmackerel-sandwich.com/");
		}
		else if (station.equals("三田")) {
			cafe.add("知るカフェ慶應義塾大学前店");
			cafe.add("siru.jpg");
			cafe.add("https://shirucafe.com/");

			cafe.add("サンマルクカフェ慶応三田店");
			cafe.add("sanmita.jpg");
			cafe.add("https://www.saint-marc-hd.com/b/saintmarc/info/20244/?brand_type=CFE");

			cafe.add("喫茶室ルノアール 田町三田口駅前店");
			cafe.add("runomita.jpg");
			cafe.add("https://www.ginza-renoir.co.jp/shopsearch/shops/view/44");

			cafe.add("HELLO, VISITS 慶應義塾大学（ハロービジッツ慶應義塾大学）");
			cafe.add("keio.jpg");
			cafe.add("https://vis-its.com/");

			cafe.add("タリーズコーヒー 慶大東門前店");
			cafe.add("tariskeio.jpg");
			cafe.add("https://www.tullys.co.jp/");
		}
		else if (station.equals("赤羽橋")) {
			cafe.add("zabutton-hostel Coffee shop");
			cafe.add("zabu.jpg");
			cafe.add("http://zabutton.jp/");

			cafe.add("koikoi cafe");
			cafe.add("koi.jpg");
			cafe.add("http://koikoicafe.com/");

			cafe.add("タリーズコーヒー 済生会中央病院店");
			cafe.add("tarisaka.jpg");
			cafe.add("http://www.tullys.co.jp/");
		}

		else if (station.equals("汐留")) {
			cafe.add("プロント カレッタ汐留店");
			cafe.add("prosio.jpg");
			cafe.add("https://www.pronto.co.jp/shop/detail?shopid=0355372344Z");

			cafe.add("タリーズコーヒー 汐留住友ビル店");
			cafe.add("tarissio.jpg");
			cafe.add("https://map.tullys.co.jp/tullys/detailMap?account=tullys&accmd=0&bid=715");

			cafe.add("エクセルシオール カフェ 東京汐留ビルディング店");
			cafe.add("ekusio.jpg");
			cafe.add("https://www.doutor.co.jp/excelsiorcaffe/");

			cafe.add("スターバックスコーヒー 汐留シティセンター店");
			cafe.add("stasio.jpg");
			cafe.add("https://store.starbucks.co.jp/detail-439/");

			cafe.add("タリーズコーヒー 汐留シティセンター店");
			cafe.add("tarisio.jpg");
			cafe.add("http://www.tullys.co.jp/");
		}

			else if (station.equals("御成門")) {
				cafe.add("エクセルシオール カフェ 御成門駅前店");
				cafe.add("ekuona.jpg");
				cafe.add("https://www.doutor.co.jp/exc/");
			}
			else if (station.equals("芝公園")) {
				cafe.add("タリーズコーヒー 芝公園店");
				cafe.add("tarisiba.jpg");
				cafe.add("http://www.tullys.co.jp/");

				cafe.add("スターバックスコーヒー 芝大門店");
				cafe.add("stasiba.jpg");
				cafe.add("https://store.starbucks.co.jp/detail-780/");

				cafe.add("タリーズコーヒー 芝二丁目店");
				cafe.add("tarisiba2.jpg");
				cafe.add("http://www.tullys.co.jp/");
			}
			else if (station.equals("品川")) {
				cafe.add("エクセルシオール カフェ 品川イーストワンタワー店");
				cafe.add("ekusina.jpg");
				cafe.add("https://www.doutor.co.jp/exc/");

				cafe.add("喫茶室ルノアール 品川高輪口店");
				cafe.add("runosina.jpg");
				cafe.add("https://www.ginza-renoir.co.jp/shopsearch/shops/view/62");

				cafe.add("サンマルクカフェ 品川インターシティ店");
				cafe.add("sansina.jpg");
				cafe.add("https://www.saint-marc-hd.com/b/saintmarc/info/20323/?brand_type=CFE");

				cafe.add("スターバックスコーヒー JR東海 品川駅店");
				cafe.add("stasina.jpg");
				cafe.add("https://store.starbucks.co.jp/detail-2118/");

				cafe.add("WIRED CAFE Dining Lounge Wing高輪店");
				cafe.add("wired.jpg");
				cafe.add("http://www.cafecompany.co.jp/brands/wiredcafe_dininglounge/takanawa/");

				cafe.add("喫茶室ルノアール 品川港南口店");
				cafe.add("runosina.jpg");
				cafe.add("https://www.ginza-renoir.co.jp/shopsearch/shops/view/52");
			}
			else if (station.equals("田町")) {
				cafe.add("喫茶室ルノアール 田町三田口駅前店");
				cafe.add("runotama.jpg");
				cafe.add("https://www.ginza-renoir.co.jp/shopsearch/shops/view/44");

				cafe.add("タリーズコーヒー 田町森永プラザビル店");
				cafe.add("taritama.jpg");
				cafe.add("http://www.tullys.co.jp/");

				cafe.add("エクセルシオール カフェ 田町東口店");
				cafe.add("ekutama.jpg");
				cafe.add("https://www.doutor.co.jp/exc/");

				cafe.add("タリーズコーヒー 田町グランパーク店");
				cafe.add("tarigura.jpg");
				cafe.add("http://www.tullys.co.jp/");

				cafe.add("スターバックスコーヒー ムスブ田町2階店");
				cafe.add("stamusu.jpg");
				cafe.add("https://store.starbucks.co.jp/detail-1653/");

				cafe.add("カフェ・ド・クリエ 田町駅東口なぎさテラス店");
				cafe.add("crietama.jpg");
				cafe.add("https://www.pokkacreate.co.jp/shops/detail/260");
			}
			else if (station.equals("浜松町")) {
				cafe.add("カフェ・ド・クリエ浜松町店");
				cafe.add("hamacrie.jpg");
				cafe.add("https://www.pokkacreate.co.jp/shops/detail/88");

				cafe.add("タリーズコーヒー 浜松町駅北口店");
				cafe.add("tarihama.jpg");
				cafe.add("https://map.tullys.co.jp/tullys/detailMap?account=tullys&accmd=0&bid=229");

				cafe.add("プロント 浜松町２丁目店");
				cafe.add("prohama.jpg");
				cafe.add("https://www.pronto.co.jp/");

				cafe.add("サンマルクカフェ 浜松町貿易センタービル店");
				cafe.add("sanhama.jpg");
				cafe.add("https://www.saint-marc-hd.com/saintmarccafe/");

				cafe.add("プロント 浜松町店");
				cafe.add("prohama2.jpg");
				cafe.add("https://www.pronto.co.jp/shop/detail?shopid=0334362406");

				cafe.add("スターバックスコーヒー 浜松町東芝ビル店");
				cafe.add("stahama.jpg");
				cafe.add("https://store.starbucks.co.jp/detail-82/");
			}
			else if (station.equals("お台場海浜公園")) {
				cafe.add("タリーズコーヒー お台場デックス店");
				cafe.add("tariskai.jpg");
				cafe.add("http://www.tullys.co.jp/");

				cafe.add("ジョナサン 台場デックス東京ビーチ店");
				cafe.add("jonakai.jpg");
				cafe.add("https://store-info.skylark.co.jp/jonathan/map/020496");
			}
			else if (station.equals("台場")) {
				cafe.add("スターバックスコーヒー アクアシティお台場店");
				cafe.add("stadai.jpg");
				cafe.add("https://store.starbucks.co.jp/detail-961/");

				cafe.add("タリーズコーヒー お台場デックス店");
				cafe.add("tariskai.jpg");
				cafe.add("http://www.tullys.co.jp/");

				cafe.add("セガフレード・ザネッティ・エスプレッソ お台場店");
				cafe.add("odaiba.jpg");
				cafe.add("https://www.segafredo.jp/");

				cafe.add("スターバックスコーヒー ダイバーシティ東京 プラザ店");
				cafe.add("stadai2.jpg");
				cafe.add("https://store.starbucks.co.jp/detail-1070/");

				cafe.add("タリーズコーヒー フジテレビ店");
				cafe.add("tarisfuji.jpg");
				cafe.add("http://www.tullys.co.jp/");
			}
			else if (station.equals("芝浦ふ頭")) {
				cafe.add("エクセルシオール カフェ 田町東口店");
				cafe.add("ekutama.jpg");
				cafe.add("https://www.doutor.co.jp/exc/");

				cafe.add("タリーズコーヒー 芝浦海岸通り店");
				cafe.add("tarisiba.jpg");
				cafe.add("http://www.tullys.co.jp/");
			}
			else if (station.equals("竹芝")) {
				cafe.add("モリバコーヒー 浜松町店");
				cafe.add("moritake.jpg");
				cafe.add("https://maps.morivacoffee.com/jp/detail/4669.html");

				cafe.add("タリーズコーヒー 海岸竹芝通り店");
				cafe.add("taritake.jpg");
				cafe.add("https://www.tullys.co.jp/");

				cafe.add("エクセルシオール カフェ 浜松町ハマサイト店");
				cafe.add("ekutake.jpg");
				cafe.add("https://www.doutor.co.jp/excelsiorcaffe/");

				cafe.add("カフェ・ド・クリエプラス汐留芝離宮店");
				cafe.add("critake.jpg");
				cafe.add("https://www.pokkacreate.co.jp/shops/detail/82");
			}
			else if (station.equals("日の出")) {
				cafe.add("スターバックスコーヒー 浜松町東芝ビル店");
				cafe.add("stahi.jpg");
				cafe.add("https://store.starbucks.co.jp/detail-82/");
			}
	}



}
