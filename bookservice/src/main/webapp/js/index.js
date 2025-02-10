const findAll = () =>{
	const bno = new URL(location.href).searchParams.get('cno');
	
	option = {method : 'GET'}
	
	fetch(`/bookservice/book?bno=${bno}`.option)
		.then(r=>r.json())
		.then(data=>{
			console,log(data);
			
			const booklist = document.querySelector('.booklist>tbody');
			let html=``;
			data.forEach((book)=>{
				html+=`<tr>
				<td>${book.bno}</td>
				<td>${book.bname}</td>
				<td>${book.bwriter}</td>
				<td>${book.bpublisher}</td>
				<button>삭제하기</button>`
			
		})
		booklist.innerHTML = html;
		})
		.catch(e=>{console.log(e)})
}
findAll();