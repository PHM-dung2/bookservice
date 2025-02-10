const bno = new URL(location.href).searchParams.get('bno');
const bookView = ()=>{

	 
	const option = {
		method : 'GET'
	}
	fetch(`/bookservice/book/view?bno=${ bno }`,option)
		.then(r=>r.json())
		.then(data=>{
	
			document.querySelector('.bnamebox').value =`${data.bname}` ;
			document.querySelector('.bwriterbox').value =`${data.bwriter}`;
			document.querySelector('.bpublisherbox').value = `${data.bpublisher}`;
			
		})
		.catch(e=> {console.log(e)})
	
}
bookView();

const bookupdate = () =>{
	//let bno = new URL(location.href).searchParams.get('bno')
	
	let bname = document.querySelector('.bnamebox').value;
	let bwriter = document.querySelector('.bwriterbox').value;
	let bpublisher = document.querySelector('.bpublisherbox').value;
	
	let obj = {
		bname : bname,
		bwriter : bwriter,
		bpublisher : bpublisher
	}
	const option = {
		method : 'PUT',
		headers : {'Content-Type' : 'application/json'},
		body : JSON.stringify(obj)
	}
	console.log("111111")
	fetch(`/bookservice/book?bno=${bno}`,option)
		.then(r=>r.json())
		.then(data=>{
			console.log(data)
			if(data==true){
				alert('도서 수정이 완료되었습니다.')
				location.href=`/bookservice/jsp/view.jsp?bno=${ bno }`;
			}else{
				alert('도서 수정 실패하였습니다.')
			}
		})
		.catch(error => {console.log(error)})
}

const viewpage = () =>{
	location.href=`/bookservice/jsp/view.jsp?bno=${bno}`
}