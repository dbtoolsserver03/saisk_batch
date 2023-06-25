
		// 下面的写法是错的，因为BODY里面的组件还没有完全加载完毕。
		// document.getElementById("id_user");

		//alert(hello); 字符串两边要加引号
		var  newTitle = "xxx"
		document.title = newTitle;

			function funLogin(obj,num) {
				//alert(obj.value + num);

				var element = document.getElementById("id_user");
				element.style.backgroundColor="green";

				var elementPw = document.getElementById("id_pw");

				var id_view_element = document.getElementById("id_view");

				var sexElements=document.getElementsByName("sex");
				var sexVal="";
				for(var i=0; i<sexElements.length; i++){
					if(sexElements[i].checked) {
						sexVal = sexElements[i].value;
						break;
					}
				}

				var jobElements=document.getElementsByName("job");
				var jobVal="";
				for(var i=0; i<jobElements.length; i++){
					if(jobElements[i].checked) {
						jobVal = jobElements[i].value;
						break;
					}
				}

				var jobValJquery = $('input:radio[name="job"]:checked').val();



				var hobElements=document.getElementsByName("hob");
				var hobVal="";
				for(var i=0; i<hobElements.length; i++){
					if(hobElements[i].checked) {
						hobVal = hobVal + hobElements[i].value+",";
					}
				}
				hobVal = hobVal.substring(0,hobVal.length-1);

				var arrA = [1,2,3];
				console.log(arrA);

				var arrB = [];
				arrB.push(1);
				arrB.push(2);
				arrB.push(3);
				console.log(arrB);



			   var hobValJquery = [];
			    $('input[name=hob]:checked').each(function(){
			      hobValJquery.push($(this).val());
			    });
			    console.log(hobValJquery);

				// id_view_element.innerText=element.value +"\n"+ sexVal;
				id_view_element.innerHTML=element.value +"<br>"+ elementPw.value +"<br>"
										 + sexVal +"<br>"
										 + jobVal +"<br>"
										 + jobValJquery +"<br>"
										 +hobVal+"<br>"
										 +hobValJquery + "<br>";

				var textAreaVal = document.getElementsByTagName('textarea');
				console.log(textAreaVal[0].value);
				console.log( "jquery->" + $("textarea").val());

				console.log( "jquery->" + $("#id_date").val());

				console.log( "jquery->" + $('option:selected').val());

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
				//alert(document.getElementById("id_user").value);

			}