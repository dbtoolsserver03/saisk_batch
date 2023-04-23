
 
			$(function() {
				alert("加载完毕 jquery");
				
				// document.getElementById("id_btn_view") =  $("#id_btn_view")
				 $("#id_btn_view").click(function(){
					 
					 $("#id_user").removeClass();
					 
					 $("#id_user").removeAttr('style');
					
					//jquery       $("#id_user")
					//javascript   [0].value='aaa';
					
					$("#id_user")[0].value='aaa';
					 
					 var chkVal="";
					 /*
					 $('[name="lan"]:checked').each(function(index, elm) {
				      chkVal  = chkVal + $(elm).val();
				    });
				    */
				    var arr = $('[name="lan"]:checked');
				    
				    for(var i=0; i< arr.length;i++) {
						//chkVal = chkVal + arr[i].value;
						chkVal = chkVal + $(arr[i]).val();
					}
    
				    $("#div_view").html(
						$("#id_user").val()+"<br>"
				    	+$("#id_pwd").val()+"<br>"
				    	+$('input[name="sex"]:checked').val()+"<br>"
				    	+chkVal
				    );
				  });
				
			  //実行処理
			});