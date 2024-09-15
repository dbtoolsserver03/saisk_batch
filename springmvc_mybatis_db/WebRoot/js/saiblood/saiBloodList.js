	function editBloodsAll() {
		//提交form
		document.BloodForm.action = "editSaiBloodsAll.action";
		document.BloodForm.submit();
	}
	function editBloodsMap() {
		//提交form
		document.BloodForm.action = "editSaiBloodsMap.action";
		document.BloodForm.submit();
	}

	function queryBloods() {
		//提交form
		document.BloodForm.action = "querySaiBloods.action";
		document.BloodForm.submit();
	}

	function addBlood() {
		//提交form
		debugger;
		document.BloodForm.action = "saiBloodInitInsert.action";
		document.BloodForm.submit();
	}

	function deleteBloods() {
		//提交form
		document.BloodForm.action = "SaiDeleteBloods.action";
		document.BloodForm.submit();
	}

