alert(222);

//下同的是错误的写法，因为BODY里面的内容还没有加载完毕
//document.getElementById("id_user");

function funView(element) {
	alert(element.value);

	// 通过id属性取标签对象
	var element_user = document.getElementById("id_user");

	element_user.className = "";
	element_user.style.backgroundColor = ""
	var element_div = document.getElementById("div_view");
	var element_pwd = document.getElementById("id_pwd");

	// 通过name属性取标签对象,返回对象数组

	// 从该HTML文档里面找有name属性,并且name值为sex的标签
	// 取出了两个input标签
	var elements_sex = document.getElementsByName("sex");

	var sexVal = "";

	//  elements_sex[0]  带表第1个标签 
	//  elements_sex[1]  带表第2个标签
	for (var i = 0; i < elements_sex.length; i++) {

		// 取数组中的一个标签对象
		var element = elements_sex[i];
		if (element.checked) {
			sexVal = element.value;
			break;
		}
	}

	//element_div.innerText=element_user.value+"\n"+element_pwd.value;
	element_div.innerHTML = element_user.value + "<br>"
		+ element_pwd.value + "<br>"
		+ sexVal;
}

function init(msg) {
	alert(msg);
	// 画面加载完毕，会自动执行onload的init方法
	var element_test = document.getElementById("id_user");
	alert(element_test.value);


	const target = document.getElementById('target');
	let count = 0;

	debugger;
	target.oncontextmenu = function() {
		//alert(333);
		//処理
		return false;
	}
}