const findAll = () =>{
	const bno = new URL(location.href).searchParams.get('cno');
	option = {method : 'GET'}
	fetch(`/ryu2024_web1/book?bno=${bno}`.option)
		.then(r=>r.json())
		.then(data=>{
			console,log(data);
			
			const booklist = document.querySelector('.booklist>tbody');
			let html=``;
			data.forEach()
		})
}