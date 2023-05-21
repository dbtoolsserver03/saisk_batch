	$(document).ready(function(){

	// 最基本有三种方式来取得元素
	// 1.根据ID   $("#id_btn_jquery") 
	// 2.根据标签   $("input") 
	// 3.根据CSS   $(".bkc")
	
	 //  document.getElementById("id_btn_jquery")  javascript 
	 //  $("#id_btn_jquery")                       jquery
	 // jquery优点
	 // 择取对象的写法更简单

	  $("#id_btn_jquery").click(function(){
		 	$(this).css("background-color","red");
			// document.getElementById("id_user").value;
	    	var userVal = $("#id_user").val();
	    	
	    	 $(".bkc").each(function(){
			   	$(this).val("");
			  });
	    	debugger;
	    	// javascript 可以通过DEBUG看到属性，直接取值。
	    	var userVal2= document.getElementById("id_user");

	    	var sexVal = $("input[name='sexGrp']:checked").val();
	     	$("#id_div_view").html(userVal + ","+sexVal);
			 $("input[type='text']").each(function(){
			   	$(this).val("");
			  });
	  });
	  
	});