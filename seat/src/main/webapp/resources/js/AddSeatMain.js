var Conserthall=new Array;
SelectConsert();
function SelectConsert(){
	$.ajax({
		 type:"post",
		 url:"AdminConsertList",
		 contentType:"Application/json;charset=UTF-8",
			 success: function(data){
				 if(data.isExist){
					 console.log("사용불가");
				 }else{
				 Conserthall=data;
				 console.log("사용가능");
				 console.log(data);
				  }},
				  error: function(jqXHR, textStatus, errorThrown) {
				        if(textStatus=="timeout") {
				        	alert("시간이 초과되어 데이터를 수신하지 못하였습니다.");
				     } else {
				        	alert("데이터 전송에 실패했습니다. 다시 시도해 주세요");
				        } 
				    }
		});
	document.getElementById("ConsertList").innerHTML+="<select id='Consertinfo' name='option'>";
	for(var i=0;i<Conserthall.length;i++){
	document.getElementById("ConsertList").innerHTML+="<option value="+Conserthall[i].Consertnum+">"+Conserthall[i].name+"</option>";
	}
	document.getElementById("ConsertList").innerHTML+="</select>";
}

function CreateNewConsert(){
	
}

function New(){
	prompt
}

function Load(){
	  if (document.getElementById("Consertinfo").value == "") {
	            alert("내용을 입력해주세요");
	            return false;
	  }else{
	   document.Load.submit();}
}