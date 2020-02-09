
<?php

if ($_SERVER['REQUEST_METHOD']=='POST') {

    $username = $_POST['username'];
    $password = $_POST['password'];

    require_once 'conn.php';

    $sql = " SELECT * FROM student WHERE username='$username' ";

    $response = mysqli_query($conn, $sql);

    
    if ($response) {
      	if ( password_verify($password, $row['password']) ) {
          	$result['success'] = "1";
            $result['message'] = "success";
            
     		echo json_encode($result);
			mysqli_close($conn);

        } else {
			$result['success'] = "0";
            $result['message'] = "error";
            
            echo json_encode($result);
			mysqli_close($conn);

        }

    }else{
    	$result['success'] = "0";
        $result['message'] = "error";
    }

}

