$(function(){
	
	$(document).on('click', '#cadastro-sic', function(e){
		e.preventDefault();
	
	$(".modal-content").html('');
		$(".modal-content").addClass('loader');
		$("#dialog-example").modal('show');
		$.post('cadastroSic.html',
		function(html){
			$(".modal-content").removeClass('loader');
			$(".modal-content").html(html);
		}
		);
	});


});
