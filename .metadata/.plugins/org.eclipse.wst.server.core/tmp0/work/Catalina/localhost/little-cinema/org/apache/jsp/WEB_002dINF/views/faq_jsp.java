/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-06 12:26:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/little-cinema/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1641107453292L));
    _jspx_dependants.put("jar:file:/C:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/little-cinema/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <title>Little Cinema</title>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"./bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Animate.css -->\r\n");
      out.write("        <link href=\"./animate.css/animate.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Font Awesome iconic font -->\r\n");
      out.write("        <link href=\"./fontawesome/css/fontawesome-all.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\r\n");
      out.write("        <!-- <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script> -->\r\n");
      out.write("        <!-- Magnific Popup -->\r\n");
      out.write("        <link href=\"./magnific-popup/magnific-popup.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Slick carousel -->\r\n");
      out.write("        <link href=\"./slick/slick.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Fonts -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&family=Open+Sans:wght@300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Oswald:300,400,500,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!-- Theme styles -->\r\n");
      out.write("        <link href=\"./css/dot-icons.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"./css/theme.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("		<style>\r\n");
      out.write("		  .answer {\r\n");
      out.write("		    display: none;\r\n");
      out.write("		    padding: 0 20px 30px 20px;\r\n");
      out.write("		  }\r\n");
      out.write("		  \r\n");
      out.write("		  p {\r\n");
      out.write("		  	line-height:2;\r\n");
      out.write("		  }\r\n");
      out.write("		  \r\n");
      out.write("		  .question {\r\n");
      out.write("		    cursor: pointer;\r\n");
      out.write("		    border: none;\r\n");
      out.write("		    outline: none;\r\n");
      out.write("		    background: none;\r\n");
      out.write("		    width: 100%;\r\n");
      out.write("		    text-align: left;\r\n");
      out.write("		  }\r\n");
      out.write("		  \r\n");
      out.write("		  .lead:hover {\r\n");
      out.write("		    color: #ff8a00;\r\n");
      out.write("		  }\r\n");
      out.write("		  \r\n");
      out.write("		  button:focus {outline:none;}\r\n");
      out.write("		  \r\n");
      out.write("		  [id$=\"-toggle\"] {\r\n");
      out.write("		    margin-right: 15px;\r\n");
      out.write("		  }\r\n");
      out.write("		  \r\n");
      out.write("		  [id$=\"-ans\"] {\r\n");
      out.write("		    margin-right: 30px;\r\n");
      out.write("		  }\r\n");
      out.write("	</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"body\">\r\n");
      out.write("        <header class=\"header header-horizontal header-view-pannel\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- navibar start -->\r\n");
      out.write("				");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\r\n");
      out.write("                <!-- navibar end -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <section class=\"after-head d-flex section-text-white position-relative\">\r\n");
      out.write("            <div class=\"d-background\" data-image-src=\"https://filmchatting.files.wordpress.com/2017/05/cinema-22.jpg\" data-parallax=\"scroll\"></div>\r\n");
      out.write("            <div class=\"d-background bg-black-80\"></div>\r\n");
      out.write("            <div class=\"top-block top-inner container\">\r\n");
      out.write("                <div class=\"top-block-content\">\r\n");
      out.write("                    <h1 class=\"section-title\">FAQ</h1>\r\n");
      out.write("                    <div class=\"page-breadcrumbs\">\r\n");
      out.write("                        <a class=\"content-link\" href=\"#\">Home</a>\r\n");
      out.write("                        <span class=\"text-theme mx-2\"><i class=\"fas fa-chevron-right\"></i></span>\r\n");
      out.write("                        <a class=\"content-link\" href=\"movies-blocks.html\">CS</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <section class=\"section-long\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("				<div class=\"section-line\">\r\n");
      out.write("					<div class=\"section-head\">\r\n");
      out.write("						<h2 class=\"section-title text-uppercase\">FAQ</h2>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"comment-entity\">\r\n");
      out.write("				        <div class=\"entity-inner\">	\r\n");
      out.write("							<div class=\"faq-content entity-content\">\r\n");
      out.write("							  <button class=\"question\" id=\"que-1\"><span id=\"que-1-toggle\"></span>\r\n");
      out.write("							  	<p class=\"lead\"><span class=\"text-theme info-icon\"><i class=\"fas fa-quote-left\"></i></span>&nbsp;[관람 등급] 청소년 관람 불가 등급의 영화를 보호자 동반하여 관람할 수 있나요?&nbsp;<span class=\"text-theme info-icon\"><i class=\"fas fa-quote-right\"></i></span>\r\n");
      out.write("							  	</p>\r\n");
      out.write("							  </button>\r\n");
      out.write("							</div> \r\n");
      out.write("							<div class=\"entity-extra\">\r\n");
      out.write("								<div class=\"grid-md row answer\" id=\"ans-1\">\r\n");
      out.write("			  						<br>\r\n");
      out.write("				  					<p><span class=\"text-theme info-icon\"><i class=\"fas fa-angle-double-right\"></i></span>&nbsp;청소년 관람 불가 등급의 영화는 보호자를 동반하여도 입장이 불가능합니다.</p>\r\n");
      out.write("									<p>단, 전체관람가, 12세 이상 관람가, 15세 이상 관람가 등급의 영화는 보호자와 함께 영화를 보는 경우에는 관람이 가능합니다.</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p>[영화 및 비디오물의 진흥에 관한 법률 제 29조 5항]</p>\r\n");
      out.write("									<p>누구든지 청소년 관람 불가 또는 제한 상영가에 해당하는 영화의 경우에 청소년을 입장시키면 안됩니다.</p>\r\n");
      out.write("						  		</div>\r\n");
      out.write("						  	</div>			\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>	\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"comment-entity\">\r\n");
      out.write("				        <div class=\"entity-inner\">	\r\n");
      out.write("							<div class=\"faq-content entity-content\">\r\n");
      out.write("							  <button class=\"question\" id=\"que-2\"><span id=\"que-2-toggle\"></span>\r\n");
      out.write("								  <p class=\"lead\"><span class=\"text-theme info-icon\"><i class=\"fas fa-quote-left\"></i></span>&nbsp;[관람 요금] 영화 관람 요금에 대해 알려주세요.&nbsp;<span class=\"text-theme info-icon\"><i class=\"fas fa-quote-right\"></i></span>\r\n");
      out.write("								  </p>\r\n");
      out.write("							  </button>\r\n");
      out.write("							</div> \r\n");
      out.write("							<div class=\"entity-extra\">\r\n");
      out.write("								<div class=\"grid-md row answer\" id=\"ans-2\">\r\n");
      out.write("									<br>\r\n");
      out.write("			  						<p><span class=\"text-theme info-icon\"><i class=\"fas fa-angle-double-right\"></i></span>&nbsp;Little Cinema의 현재 관람 요금은 스탠다드석 12,000원, 프라임석 14,000원입니다.</p>\r\n");
      out.write("									<p>관람 요금은 관람 요금 정책에 따라 정해지므로 예매 시 관람 요금을 꼭 확인하여 주시기 바랍니다.</p>\r\n");
      out.write("						  		</div>\r\n");
      out.write("						  	</div>			\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>	\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"comment-entity\">\r\n");
      out.write("				        <div class=\"entity-inner\">	\r\n");
      out.write("							<div class=\"faq-content entity-content\">\r\n");
      out.write("							  <button class=\"question\" id=\"que-3\"><span id=\"que-3-toggle\"></span>\r\n");
      out.write("								  <p class=\"lead\"><span class=\"text-theme info-icon\"><i class=\"fas fa-quote-left\"></i></span>&nbsp;[관람 등급] 영화 관람 등급에 대해 알려주세요.&nbsp;<span class=\"text-theme info-icon\"><i class=\"fas fa-quote-right\"></i></span>\r\n");
      out.write("								  </p>\r\n");
      out.write("							  </button>\r\n");
      out.write("							</div> \r\n");
      out.write("							<div class=\"entity-extra\">\r\n");
      out.write("								<div class=\"grid-md row answer\" id=\"ans-3\">\r\n");
      out.write("									<br>\r\n");
      out.write("			  						<p><span class=\"text-theme info-icon\"><i class=\"fas fa-angle-double-right\"></i></span>&nbsp;영화 관람은 영화에 따라 아래와 같이 등급이 있습니다.</p>\r\n");
      out.write("			  						<br>\r\n");
      out.write("									<p>전체관람가 : 모든 연령의 관람객이 관람할 수 있는 영화</p>\r\n");
      out.write("									<p>만 12세 이상 관람가 : 만 12세 미만의 관람객은 관람할 수 없는 영화. 보호자 동반 시 12세 미만 관람 가능</p>\r\n");
      out.write("									<p>만 15세 이상 관람가 : 만 15세 미만의 관람객은 관람할 수 없는 영화. 보호자 동반 시 15세 미만 관람 가능</p>\r\n");
      out.write("									<p>청소년 관람 불가 : 만 18세 미만의 관람객은 관람할 수 없는 영화. 보호자를 동반하여도 18세 미만(영, 유아 포함)은 관람 불가</p>\r\n");
      out.write("									<p>(영화 및 비디오물 진흥에 관한 법률 제 29조와 초,중등 교육법 제 2조 규정에 따라 만 18세 미만 고등학생은 관람할 수 없음)</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p>※ 등급 제한이 있는 영화의 경우 관람 고객의 신분증을 확인해야 관람이 가능합니다.</p>\r\n");
      out.write("						  		</div>\r\n");
      out.write("						  	</div>			\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>	\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"comment-entity\">\r\n");
      out.write("				        <div class=\"entity-inner\">	\r\n");
      out.write("							<div class=\"faq-content entity-content\">\r\n");
      out.write("							  <button class=\"question\" id=\"que-4\"><span id=\"que-4-toggle\"></span>\r\n");
      out.write("								  <p class=\"lead\"><span class=\"text-theme info-icon\"><i class=\"fas fa-quote-left\"></i></span>&nbsp;[예매 후 변경] 영화관 홈페이지에서 인터넷 예매 후 시간 변경이나 영화 변경이 가능한가요?&nbsp;<span class=\"text-theme info-icon\"><i class=\"fas fa-quote-right\"></i></span>\r\n");
      out.write("								  </p>\r\n");
      out.write("							  </button>\r\n");
      out.write("							</div> \r\n");
      out.write("							<div class=\"entity-extra\">\r\n");
      out.write("								<div class=\"grid-md row answer\" id=\"ans-4\">\r\n");
      out.write("									<br>\r\n");
      out.write("			  						<p><span class=\"text-theme info-icon\"><i class=\"fas fa-angle-double-right\"></i></span>&nbsp;인터넷 예매의 부분 취소 및 교환은 불가능합니다.</p>\r\n");
      out.write("									<p>예매 내역 전체를 취소하고 다시 예매를 진행하셔야 합니다.</p>\r\n");
      out.write("									<p>영화관 홈페이지에서 예매하신 경우에는 30분 전까지 예매를 취소하신 후 다른 영화로 다시 예매하시면 됩니다.</p>\r\n");
      out.write("						  		</div>\r\n");
      out.write("						  	</div>			\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>	\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"comment-entity\">\r\n");
      out.write("				        <div class=\"entity-inner\">	\r\n");
      out.write("							<div class=\"faq-content entity-content\">\r\n");
      out.write("							  <button class=\"question\" id=\"que-5\"><span id=\"que-5-toggle\"></span>\r\n");
      out.write("								  <p class=\"lead\"><span class=\"text-theme info-icon\"><i class=\"fas fa-quote-left\"></i></span>&nbsp;[관람료 환급] 현장 매표소나 영화관 홈페이지에서 결제한 예매 티켓의 환불 정책을 알려주세요.&nbsp;<span class=\"text-theme info-icon\"><i class=\"fas fa-quote-right\"></i></span>\r\n");
      out.write("								  </p>\r\n");
      out.write("							  </button>\r\n");
      out.write("							</div> \r\n");
      out.write("							<div class=\"entity-extra\">\r\n");
      out.write("								<div class=\"grid-md row answer\" id=\"ans-5\">\r\n");
      out.write("									<br>\r\n");
      out.write("			  						<p><span class=\"text-theme info-icon\"><i class=\"fas fa-angle-double-right\"></i></span>&nbsp;Little Cinema는 공정거래위원회의 영화 관람 표준 약관에 따라 관람객의 요청에 아래와 같이 환급하여 드립니다.</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p>===== 영화 관람 표준 약관(공정거래위원회 표준 약관) =====</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p><b>제 1조(입 장)</b> 관객은 입장권으로 지정일, 지정회에 한하여 입장할 수 있습니다. </p>\r\n");
      out.write("									<p>&nbsp;&nbsp;다만, 영화 시작 당시 좌석에 여유가 있는 경우 영화 상영업자는 좌석의 한도 내에서 지정일, 지정회가 아니더라도 관객의 요청 순서에 따라 입장을 허용할 수 있습니다.</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p><b>제 2조(변 경)</b> 지정일, 지정회의 변경을 희망하는 관객은 영화 상영 시작 20분 전까지 직접 방문하거나 전화로 변경 절차를 밟아야 합니다.</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;단, 미리 수령한 예매권을 소지한 경우 입장권과 교환하여야 유효합니다.</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p><b>제 3조(현금 환급)</b></p>\r\n");
      out.write("									<p>&nbsp;&nbsp;1. 입장권의 환급은 입장권에 기재된 시간을 기준으로 관객의 요청에 따라 다음과 같이 합니다.</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;&nbsp;&nbsp;① 당 해 영화 상영 시작 전 20분까지 요청한 경우에는 입장권 요금의 전액</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;&nbsp;&nbsp;② 당 해 영화 상영 시작 전 20분에서부터 시작 시까지 요청한 경우에는 입장권 요금의 50%</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;&nbsp;&nbsp;③ 당 해 영화 상영 시작 후에는 환급 요청을 할 수 없습니다.</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;2. 제 1항에 있어서 해당일 전 환급은 관객이 예매한 곳에서 가능하고 이 경우 환급 요청을 받은 날부터 48시간 이내에 환급하며 단, 공휴일인 경우는 익일 처리합니다. </p>\r\n");
      out.write("									<p>&nbsp;&nbsp;그리고 해당일인 경우에는 매표소에서 즉시 환급합니다.</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;3. 제 1항 또는 제 2항의 규정을 적용함에 있어서 입장권에 영화 상영 시간이 기재되지 아니한 경우에는 신문에 기재된 시간과 영화 상영관 매표소에 기재된 시간 중 늦은 시간을 기준으로 합니다.</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p><b>제 4조(영화 상영 지체, 중단 시의 입장권 환급)</b> 영화 상영업자는 다음의 사유가 발생하는 경우 관객의 요청에 따라 각각 정한 금액으로 입장권을 환급합니다. </p>\r\n");
      out.write("									<p>&nbsp;&nbsp;다만, 고객이 환급을 요청하지 아니하고 관람을 계속하는 경우에는 그렇게 하지 않습니다.</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;1. 영화 상영 시작이 영화 상영업자의 고의 또는 과실로 입장권에 기재된 예정 시간보다 30분 이상 늦어지는 경우에는 입장권 요금, 1시간 이상 늦어지는 경우에는 입장권 요금의 2배</p>\r\n");
      out.write("									<p>&nbsp;&nbsp;2. 영화 상영 중 10분 이상 또는 2회 이상 중단된 경우에는 입장권 요금, 30분 이상 또는 3회 이상 중단된 경우에는 입장권 요금의 2배</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p><b>제 5조(전화, 인터넷 등에 의한 예약의 효력)</b> 전화나 인터넷 등을 통하여 영화 관람을 예약한 경우에는 당 해 영화 상영 시작 20분 전까지 입장권을 구입하여야 합니다. </p>\r\n");
      out.write("									<p>&nbsp;&nbsp;그러하지 않을 경우 그 예약을 무효로 합니다.</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p>===================== 끝. ====================</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p>위의 규정에 따라 현장에서 구입하신 관람 티켓은 상영 시작 전 20분까지 요청 시에는 전액 환불, 20분 부터 시작 시까지 요청 시에는 요금의 50% 환불이 가능합니다. </p>\r\n");
      out.write("									<p>상영 시간이 지나면 환불이 불가능하니 유의하여 주시기 바랍니다.</p>\r\n");
      out.write("									<p>위의 규정에 따라 인터넷으로 예매한 예매권은 상영 시작 20분 전까지 현장 매표소에서 티켓으로 교환하셔야 합니다.</p>\r\n");
      out.write("									<p>영화관 홈페이지에서 인터넷으로 하신 예매를 취소하신 경우, 홈페이지에서는 상영 시작 시간 30분 전까지 취소 가능하며, 영화관 매표소에서는 상영 시작 시간 20분 전까지 취소 가능합니다. </p>\r\n");
      out.write("									<p>단, 인터넷으로 취소하실 경우 경우에 따라 취소 수수료가 부과될 수 있사오니 필히 인터넷 예매 취소 정책에 대해 확인하여 주시기 바랍니다.</p>\r\n");
      out.write("						  		</div>\r\n");
      out.write("						  	</div>			\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"comment-entity\">\r\n");
      out.write("				        <div class=\"entity-inner\">	\r\n");
      out.write("							<div class=\"faq-content entity-content\">\r\n");
      out.write("							  <button class=\"question\" id=\"que-6\"><span id=\"que-6-toggle\"></span>\r\n");
      out.write("								  <p class=\"lead\"><span class=\"text-theme info-icon\"><i class=\"fas fa-quote-left\"></i></span>&nbsp;[현장 예매] 현장 매표소에서 보고싶은 영화 티켓을 사전에 구매할 수 있나요?&nbsp;<span class=\"text-theme info-icon\"><i class=\"fas fa-quote-right\"></i></span>\r\n");
      out.write("								  </p>\r\n");
      out.write("							  </button>\r\n");
      out.write("							</div> \r\n");
      out.write("							<div class=\"entity-extra\">\r\n");
      out.write("								<div class=\"grid-md row answer\" id=\"ans-6\">\r\n");
      out.write("									<br>\r\n");
      out.write("			  						<p><span class=\"text-theme info-icon\"><i class=\"fas fa-angle-double-right\"></i></span>&nbsp;해당 상영일 이전에 사전 예매하여 구매가 가능합니다.</p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p>현장 매표소에서는 수수료가 부과되지 않습니다.</p>\r\n");
      out.write("									<p>다만 미리 티켓을 발급하여 드리는 것으로 예매를 취소하시려면 티켓을 소지하시고 영화 상영 시작 20분 전까지 매표소에 방문하셔서 취소하셔야 합니다. </p>\r\n");
      out.write("									<br>\r\n");
      out.write("									<p>현장 예매하신 티켓은 취소 수수료가 부과되지 않습니다.</p>\r\n");
      out.write("									<p>전화나 이메일 등으로는 취소하실 수 없습니다.</p>\r\n");
      out.write("									<p>영화 상영이 시작된 티켓은 환불이 되지 않음을 유의하여 주시기 바랍니다.</p>\r\n");
      out.write("						  		</div>\r\n");
      out.write("						  	</div>			\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"comment-entity\">\r\n");
      out.write("				        <div class=\"entity-inner\">	\r\n");
      out.write("							<div class=\"faq-content entity-content\">\r\n");
      out.write("							  <button class=\"question\" id=\"que-7\"><span id=\"que-7-toggle\"></span>\r\n");
      out.write("								  <p class=\"lead\"><span class=\"text-theme info-icon\"><i class=\"fas fa-quote-left\"></i></span>&nbsp;[상영 정보] 영화 상영스케줄은 어디에서 확인할 수 있나요?&nbsp;<span class=\"text-theme info-icon\"><i class=\"fas fa-quote-right\"></i></span>\r\n");
      out.write("								  </p>\r\n");
      out.write("							  </button>\r\n");
      out.write("							</div> \r\n");
      out.write("							<div class=\"entity-extra\">\r\n");
      out.write("								<div class=\"grid-md row answer\" id=\"ans-7\">\r\n");
      out.write("									<br>\r\n");
      out.write("			  						<p><span class=\"text-theme info-icon\"><i class=\"fas fa-angle-double-right\"></i></span>&nbsp;홈페이지 상단 상영시간표 메뉴에서 현재 예매 가능한 영화의 상영스케줄을 확인하실 수 있습니다.</p>\r\n");
      out.write("						  		</div>\r\n");
      out.write("						  	</div>			\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("               </div> \r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("     \r\n");
      out.write("        <a class=\"scroll-top disabled\" href=\"#\"><i class=\"fas fa-angle-up\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("        \r\n");
      out.write("        <!--footer start-->\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        <!--footer end-->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- jQuery library -->\r\n");
      out.write("        <script src=\"./js/jquery-3.3.1.js\"></script>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"./bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("        <!-- Paralax.js -->\r\n");
      out.write("        <script src=\"./parallax.js/parallax.js\"></script>\r\n");
      out.write("        <!-- Waypoints -->\r\n");
      out.write("        <script src=\"./waypoints/jquery.waypoints.min.js\"></script>\r\n");
      out.write("        <!-- Slick carousel -->\r\n");
      out.write("        <script src=\"./slick/slick.min.js\"></script>\r\n");
      out.write("        <!-- Magnific Popup -->\r\n");
      out.write("        <script src=\"./magnific-popup/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <!-- Inits product scripts -->\r\n");
      out.write("        <script src=\"./js/script.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("        const items = document.querySelectorAll('.question');\r\n");
      out.write("\r\n");
      out.write("        function openCloseAnswer() {\r\n");
      out.write("          const answerId = this.id.replace('que', 'ans');\r\n");
      out.write("\r\n");
      out.write("          if(document.getElementById(answerId).style.display === 'block') {\r\n");
      out.write("            document.getElementById(answerId).style.display = 'none';\r\n");
      out.write("          } else {\r\n");
      out.write("            document.getElementById(answerId).style.display = 'block';\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        items.forEach(item => item.addEventListener('click', openCloseAnswer));\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
