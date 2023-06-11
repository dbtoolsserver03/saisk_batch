
		// 下面的写法是错的，因为BODY里面的组件还没有完全加载完毕。
		// document.getElementById("id_user");

		alert(111);
		var  newTitle = "xxx"
		document.title = newTitle;

			function funLogin(obj,num) {
				alert(obj.value + num);

				var element = document.getElementById("id_user");
				element.style.backgroundColor="green";

				var id_view_element = document.getElementById("id_view");

				var sexElements=document.getElementsByName("sex");
				var sexVal="";
				for(var i=0; i<sexElements.length; i++){
					if(sexElements[i].checked) {
						sexVal = sexElements[i].value;
						break;
					}
				}
				// id_view_element.innerText=element.value +"\n"+ sexVal;
				id_view_element.innerHTML=element.value +"<br>"+ sexVal;

				//element.disabled=true;
			}

			// 1.HTML里，增加一个按钮，在这个按钮上加事件
			// 2.HTML里，实现这个事件对应的方法
			// 3.JS里，
			function funClear() {

				// 从当前HTML文件里取指定ID的标签
				// document 相当于这个HTML
				// getElementById  从这个document里面取Id 是 "id_user" 的标签

				// var 定义变量
				// (JS) var a  = (java) int a
				// var 是无类型

				var element = document.getElementById("id_user");
				element.value="";
			}

			function init() {
				alert(document.getElementById("id_user").value);
			}