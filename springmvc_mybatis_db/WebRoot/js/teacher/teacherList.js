	function editTeachersAll() {
		//提交form
		document.teacherForm.action = "editTeachersAll.action";
		document.teacherForm.submit();
	}
	function editTeachersMap() {
		//提交form
		document.teacherForm.action = "editTeachersMap.action";
		document.teacherForm.submit();
	}

	function queryTeachers() {
		//提交form
		document.teacherForm.action = "queryTeachers.action";
		document.teacherForm.submit();
	}

	function addTeacher() {
		//提交form
		debugger;
		document.teacherForm.action = "teacherInitInsert.action";
		document.teacherForm.submit();
	}

	function deleteTeachers() {
		//提交form
		document.teacherForm.action = "deleteTeachers.action";
		document.teacherForm.submit();
	}

