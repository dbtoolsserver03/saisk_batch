/**
 * 
 */
 
 
		function fun1(eventTag) {

			console.log(eventTag.value);

			// 同一个HTML文件里，id是唯一
			// 从当前HTML文件里，寻找指定id的标签
			var tagUser = document.getElementById("id_user");
			tagUser.style.backgroundColor = 'red';

			var tagView = document.getElementById("id_view");

			var tagSexs = document.getElementsByName("nsex");

			var sexVal = "";
			for (var i = 0; i < tagSexs.length; i++) {
				if (tagSexs[i].checked) {
					sexVal = tagSexs[i].value;
					break;
				}
			}
			// 在开发者模式下，当执行到debugger;时，程序会自动停下。
			//debugger;
			tagView.innerText = "userName:" + tagUser.value + "\n" + "userSex:" + sexVal;

			console.log("----ok----------");
		}
