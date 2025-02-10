const bno = new URL(location.href).searchParams.get('bno');
const findByBno = ()=>{
	//const bno = new URL(location.href).searchParams.get('bno');
	
	const option = {
		method : 'GET'
	}
	fetch(`/bookservice/book/view?bno=${bno}`,option)
		.then(r=>r.json())
		.then(data=>{
			console.log(data);
			document.querySelector('.bnobox').innerHTML = data.bno;
			document.querySelector('.bnamebox').innerHTML = data.bname;
			document.querySelector('.bwriterbox').innerHTML = data.bwriter;
			document.querySelector('.bpublisherbox').innerHTML = data.bpublisher;
			document.querySelector('.bdatebox').innerHTML = data.bdate;
			document.querySelector('.bupdatebox').innerHTML = data.bupdate;
		})
		.catch(e=> {console.log(e)})
	
}
findByBno();

const updatepage = () =>{
	location.href=`/bookservice/jsp/update.jsp?bno=${bno}`
}

const bookdelete = () =>{
	let result = confirm('정말 탈퇴 하실건가요?');
	if(result ==false)return;
	const option = {method:'DELETE'}
	fetch(`/bookservice/book?bno=${bno},`,option)
	.then(r=>r.json())
	.then(data=>{
		if(data==true){
			alert('도서 삭제 성공했습니다.');
			location.href = "index.jsp";
		}else{
			alert('도서 삭제 실패했습니다.');
		}
	})
	.catch(e =>{console.log(e)})
	
}