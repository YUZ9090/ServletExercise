<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script src="https://unpkg.com/react@17/umd/react.development.js" crossorigin></script>
    <script src="https://unpkg.com/react-dom@17/umd/react-dom.development.js" crossorigin></script>
    <script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
   <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  </head>
<body>
<div id="root" class="container"></div>
   
   <script type="text/babel">

   function MainContent(props) {
      return(<div>
      <h2>{props.title}</h2>
      <ol>
         <li>JAVA <button>상세보기</button></li>
         <li>Spring boot <button>상세보기</button></li>
         <li>React <button>상세보기</button></li>
         <li>AWS <button>상세보기</button></li>
         <li>Java script <button>상세보기</button></li>
      </ol>
   </div>);
   }
   function MyHeader({title, setTitle, itemArr}) {      
      return (<div className="header">
      <h3>Comstudy IT Academy</h3>
      <h1>{title}</h1>
      <nav>
         <ul>
            <li><a href="#" onClick={ ()=>{setTitle("빠뀐 제목");} }>Home</a></li>
            { itemArr.map((item, index)=>{
               return <li key={index}>{item}</li>;
               }) }
         </ul>
      </nav>
   </div>);
   }

   function Root() {
      const [itemArr, setItemArr] = React.useState(['Profile','Gallery','Lecture','News']);
		const [itemArr, setItemArr] = React.useState(['Profile2','Gallery2']);
      const [title, setTitle] = React.useState("길동이의 홈페이지");
      const title2 = "강좌 목록";
      function changeData(args) {
         setTitle(args);
      }
      return (<>
         <MyHeader title={title} setTitle={changeData} itemArr={itemArr}/>
         <MainContent title={title2} />
      </>);
   }
   ReactDOM.render(<Root />, document.getElementById("root"));
   </script>

</body>
</html>