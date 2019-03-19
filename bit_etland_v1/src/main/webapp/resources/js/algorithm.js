var algo = algo || {}
algo = (()=>{
	let init =x=>{
		algo.$.init(x);
	};
	let onCreate =()=>{
		setContentView();
	};
	let setContentView =()=>{
		$.getScript($.js()+'/compo.js',()=>{
			$('#nav').children().eq(0).html($$.a({id:'seq', url:'#'}).text('수열'))
			$('#nav').children().eq(1).html($$.a({id:'math', url:'#'}).text('수학'))
			$('#nav').children().eq(2).html($$.a({id:'sort', url:'#'}).text('배열'))
			$('#nav').children().eq(3).html($$.a({id:'coll', url:'#'}).text('자료구조'))
			$('#nav').append($$.li({id:'', value:''}))
			 		  	.children().eq(4).html($$.a({id:'app', url:'#'}).text('응용'));			
			
		})//end getScript
		
	}; //end scv
	
	
	return {init:init,onCreate:onCreate}
})();

algo.$={
		init : (x)=>{
			$.getScript(x+'/resources/js/router.js',()=>{
				$.extend(new Session(x));
				algo.onCreate();
			})
		}
		
};