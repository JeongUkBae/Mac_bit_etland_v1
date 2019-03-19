var $$ = $$ ||{};
$$ ={
		div: x=>{
			return $('<div id='+x.id+'></div>');
		},
		a : x=>{
			return $('<a href="'+x.url+'" id='+x.id+'/>');
		},
		li : x=>{
			return $('<li id='+x.id+'>');
		},
		hs : x=>{
			return $('<h'+x.size+'/>');
		},
		
		p : x=>{
			return $('<p></p>');
		},
		
		form : x=>{
			return $('<form id="'+x.id+'"><form/>')
		},
		label : x =>{
			return $('<label for='+x.name+'/>')
		},
		input : x=>{
			return $('<input type='+x.type+' id='+x.id+'></input>')
		},
		span : x=>{
			return $('<span id='+x.id+'></span> ')
		}
		
}