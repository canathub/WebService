package kadai.baba;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet4_1
 */
@WebServlet("/kadai.baba/Webser1")
public class Webser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Webser1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("doGet実行");
		request.setCharacterEncoding("UTF-8");
		ArrayList <String> str =new ArrayList<>();

		String radio = request.getParameter("radio1");
if (radio.equals("東京メトロ")) {
		String metoro = request.getParameter("conbo");
		request.setAttribute("metoro",metoro);

		if(metoro.equals("半蔵門線")) {
			str.add("青山一丁目");
			str.add("表参道");
			request.setAttribute("hanzomon",str);
		}
		else if(metoro.equals("銀座線")) {
			str.add("青山一丁目");
			str.add("赤坂見附");
			str.add("表参道");
			str.add("外苑前");
			str.add("新橋");
			str.add("虎ノ門");
			request.setAttribute("ginza",str);
		}
		else if(metoro.equals("丸の内線")) {
			str.add("赤坂見附");
			request.setAttribute("marunouti",str);
		}
		else if(metoro.equals("南北線")) {
			str.add("麻布十番");
			str.add("白金台");
			str.add("六本木一丁目");
			request.setAttribute("nanboku",str);
		}
		else if(metoro.equals("千代田線")) {
			str.add("赤坂");
			str.add("表参道");
			str.add("乃木坂");
			request.setAttribute("tiyoda",str);
		}
		else if(metoro.equals("日比谷線")) {
			str.add("神谷町");
			str.add("広尾");
			str.add("六本木");
			request.setAttribute("hibiya",str);
		}
}


if (radio.equals("都営")) {
		String toei = request.getParameter("conbo1");
		request.setAttribute("toei",toei);

		if(toei.equals("浅草線")) {
			str.add("新橋");
			str.add("泉岳寺");
			str.add("大門");
			str.add("高輪台");
			str.add("三田");
			request.setAttribute("asakusa",str);
		}
		else if(toei.equals("大江戸線")) {
			str.add("青山一丁目");
			str.add("赤羽橋");
			str.add("汐留");
			str.add("大門");
			str.add("六本木");
			request.setAttribute("oedo",str);
		}
		else if(toei.equals("三田線")) {
			str.add("御成門");
			str.add("芝公園");
			str.add("白金台");
			str.add("三田");
			request.setAttribute("mita",str);
		}
}

if (radio.equals("JR")) {
	String jr = request.getParameter("conbo2");
	request.setAttribute("jr",jr);

		if(jr.equals("京浜東北線")) {
			str.add("品川");
			str.add("新橋");
			str.add("田町");
			str.add("浜松町");
			request.setAttribute("kehintohoku",str);
		}
		else if(jr.equals("横須賀線")) {
			str.add("品川");
			str.add("新橋");
			request.setAttribute("yokosuka",str);
		}
		else if(jr.equals("山手線")) {
			str.add("品川");
			str.add("新橋");
			str.add("田町");
			str.add("浜松町");
			request.setAttribute("yamanote",str);
		}
		else if(jr.equals("東海道本線")) {
			str.add("品川");
			str.add("新橋");
			request.setAttribute("tokaido",str);
		}
}
else if (radio.equals("ゆりかもめ線")) {
	String yurikamome1 = request.getParameter("radio1");
	request.setAttribute("yurikamome1",yurikamome1);

		str.add("お台場海浜公園");
		str.add("汐留");
		str.add("芝浦ふ頭");
		str.add("新橋");
		str.add("台場");
		str.add("竹芝");
		str.add("日の出");

		request.setAttribute("yurikamome",str);
}
else if (radio.equals("京浜急行本線")) {
	String keikyu1 = request.getParameter("radio1");
	request.setAttribute("keikyu1",keikyu1);

		str.add("品川");
		str.add("泉岳寺");
		request.setAttribute("keikyu",str);
}
else if (radio.equals("東海道新幹線")) {
	String sinkansen1 = request.getParameter("radio1");
	request.setAttribute("sinkansen1",sinkansen1);

		str.add("品川");
		request.setAttribute("sinkansen",str);
}




		RequestDispatcher disp = request.getRequestDispatcher("/kadai/baba/webser2.jsp");
		disp.forward(request, response);

		//String param;
		//param = request.getParameter("score");//このようにしてサーバー側で受け取る
		//System.out.println(param);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost実行");
		doGet(request, response);
	}

}
