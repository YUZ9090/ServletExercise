<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script src="https://unpkg.com/react@17/umd/react.development.js" crossorigin></script>
    <script src="https://unpkg.com/react-dom@17/umd/react-dom.development.js" crossorigin></script>
    <script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
   <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  </head>
  <body>

    <div id="mydiv" class="container"></div>

    <script type="text/babel">
//자바스크립트가 아니라 바벨임.
//클래스를 클레스내임이라고써줘야함
      function MyHello() {
         return (<div className="jumbotron">
            <h3>오신것을 환영합니다</h3>
            <ul>
					
               <li className="list-group-item">Hello</li>
               <li className="list-group-item">World</li>
            </ul>
         </div>);
      }

      function Hello() {
        return (<div>
         <h1>Hello World!</h1>
         <MyHello />
         <MyHello />
         <MyHello />
      </div>);
      }

      ReactDOM.render(<Hello></Hello>, document.getElementById('mydiv'))
    </script>

  </body>
</html>