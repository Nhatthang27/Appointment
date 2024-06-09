<%-- 
    Document   : add
    Created on : Jun 1, 2024, 10:38:45 AM
    Author     : Nhatthang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="row">
            <div class="col-md-12">
                <h1>Create new account</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <img src="img/login.png" alt="" width="100%"/>
            </div>
            <div class="col-md-8">
                <form action="add" accept-charset="UTF-8">
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="text" class="form-control" id="username" name="username">
                    </div>
                    <div class="form-group">
                        <label for="pwd">Password:</label>
                        <input type="password" class="form-control" id="pwd" name="pwd">
                    </div>
                    <div class="form-group">
                        <label for="fullname">Fullname: </label>
                        <input type="text" class="form-control" id="fullname" name="fullname">
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox" value="1" name="gender"> Male </label>
                        <label><input type="checkbox" value="2" name="gender"> Female </label>
                    </div>
                    <div class="form-group">
                        <label for="dob">Date of birth</label>
                        <input type="date" class="form-control" id="dob" name="dob">
                    </div>
                    <div class="form-group">
                        <label for="phone">Phone:</label>
                        <input type="tel" class="form-control" id="phone" name="phone">
                    </div>
                    <div class="form-group">
                        <label for="address">Address:</label>
                        <input type="text" class="form-control" id="address" name="address">
                    </div>
                    <div class="form-group">
                        <label for="note">Note</label>
                        <textarea class="form-control" id="note" name="note"></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Save</button>
                </form>
            </div>
        </div>
    </body>
</html>
