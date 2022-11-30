function AjaxPlant() {
	return $.ajax({
		type: "post",
		url: "/findplant",
		contentType: 'application/json;charset=utf-8',
		async: !1,
	})
}
function AjaxUnit(bean) {
	console.log(bean)
	return $.ajax({
		type: "post",
		url: "/findunit",
		contentType: 'application/json;charset=utf-8',
		async: !1,
		data:bean
	})
}

$(
	function() {
		console.log("hello")
		$('#plant').on('click', () => {
			console.log($('#plant').val())
			plantid = $('#plant').val()
			bean = {"fkplantid" : plantid }
			bean = JSON.stringify(bean)
			var result = AjaxUnit(bean)["responseJSON"]
			console.log(result)
			$("#unit").children().remove();
			for(var i =0;i<result.length;i++){
				$("#unit").append("<option value=" + result[i]["unitid"] + ">" + result[i]["unitid"] + "</option>")
			}
		})



		getPlant = AjaxPlant()["responseJSON"]
		console.log(getPlant)
		if (getPlant != null) {
			$("#plant").children().remove();
			for (var i = 0; i < getPlant.length; i++) {
				$("#plant").append("<option value=" + getPlant[i]["plantid"] + ">" + getPlant[i]["plantname"] + "</option>")
			}
		}
	}
)