/**
 * 
 */
    $(document).ready(function() {
		var date_input = $('input[id="date"]'); //our date input has the name "date"
		var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
			date_input.datepicker({
				format: 'yyyy/mm/dd',
				container: container,
				todayHighlight: true,
				autoclose: true,
				weekStart: 1
		})
	})
    
    $(".form-check-input").click(function() {
		$('input[name="date_return"]').attr("disabled", true);
		if($("input[name=way]:checked").val() == "return"){
			$('input[name="date_return"]').attr("disabled",false);
		}
	});