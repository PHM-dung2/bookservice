const bwrite = () =>{
	const bname = document.querySelector('.bnameinput').value;
	const bwriter = document.querySelector('.bwriterinput').value;
	const bpublisher = document.querySelector('.bpublisherinput').value;
	
	let obj = {bname : bname,bwriter : bwriter,bpublisher : bpublisher}
	console.log('11111')
	const option ={
		method : 'POST',
		headers : {'Content-Type':'application/json'},
		body  : JSON.stringify(obj)
	}
	fetch('/bookservice/book',option)
	.then(r=>r.json())
	.then(data=>{
		console.log(data);
		if(data==true){
			alert('도서 등록 성공');
			location.href ='index.jsp';
		}else{
			alert('도서 등록 실패');
		}
	})
	.catch(e=>{
			console.log(e)
		})
}