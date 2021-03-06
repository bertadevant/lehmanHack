<?php 
    
    session_start();

    require_once("dbcon.php");

    if (checkVar($_SESSION['userid'])): 
 
        $getRooms = "SELECT *
               FROM chat_rooms";
        $roomResults = mysql_query($getRooms);      

?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Main Page</title>
		<meta name="generator" content="" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="filesforMain/css/bootstrap.min.css" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link href="filesforMain/css/styles.css" rel="stylesheet">
    <link href="assets/css/chat.css" rel="stylesheet">
        
	</head>
	<body>
<div class="page-container">
  
	<!-- top navbar -->
    <nav class="navbar navbar-inverse nav-tabs navbar-fixed-top" role="navigation">
    	<div class="navbar-header">
           <button type="button" class="navbar-toggle" data-toggle="offcanvas" data-target=".sidebar-nav">
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
           </button>
           <a class="navbar-brand" href="#">To Be Anounced</a>
    	</div>
    </nav>
    <div class = "bkg-image">  
    <div class="container-fluid ">
      <div class="row row-offcanvas row-offcanvas-left">
        
        <!--sidebar-->
        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
          <div data-spy="affix" data-offset-top="45" data-offset-bottom="90">
              <div class="panel panel-default">
              <div class="panel-heading" id="panel-default"><h4>Hello <br>Welcome  USER </h4></div>
           
              <ul class="nav nav-pills nav-stacked" id="sidebar-nav">                                             
              <li><a href="#">Home</a></li>
              <li><a href="#section1">Your Posts</a></li>
              <li><a href="#section2">Contact Help</a></li>
                               
            </ul>
                  </div>
           </div>
        </div><!--/sidebar-->
  	
        <!--/main-->
          <br>
        <div class="col-xs-12 col-sm-9" data-spy="scroll" data-target="#sidebar-nav">
          <div class="row">
           	 <div class="col-sm-6">
                <div class="panel panel-default">
                  <div class="panel-heading"><a  class="pull-right">View all</a> <h4>Types of Help</h4></div>
                    <div class="panel-body">
                      <div class="list-group">
                        <a href="http://www.adaa.org/" class="list-group-item active" target="_blank">Anxiety and Depression</a>
                        <a href="http://www.nimh.nih.gov/health/topics/bipolar-disorder/index.shtml" class="list-group-item" target="_blank">National Institute of Mental Health </a>
                        <a href="http://www.dbsalliance.org/site/PageServer?pagename=home" class="list-group-item" target="_blank">Depresion and Bypolar Depression</a>
                        <a href="http://www.centreforemotionalhealth.com.au/pages/aboutus-background.aspx" class="list-group-item" target="_blank">Centre for Emotional Health</a>
                        <a href="http://au.reachout.com/" class="list-group-item" target="_blank">Kids Rich Out</a>
                        <a href="https://www.suicidecallbackservice.org.au/" class="list-group-item" target="_blank">Suicide Call Back Service </a>
                        <a href="http://www.dadsindistress.asn.au/" class="list-group-item"target="_blank">Dads in Distress </a>
                        <a href="http://www.mothersafe.org.au/" class="list-group-item" target="_blank">MotherSafe</a>
                        <a href="http://www.copmi.net.au/" class="list-group-item" target="_blank">Children of Parents with a Mental Illness</a>
                      </div>
                    </div><!--/panel-body-->
                </div><!--/panel-->
             
                <div class="well"> 
                     <form class="form-horizontal" role="form">
                      <h4>Tell Us How You Feel</h4>
                       <div class="form-group" style="padding:14px;">
                        <textarea class="form-control" placeholder="Update your status"></textarea>
                      </div>
                      <button class="btn btn-success pull-right" type="button">Post</button><ul class="list-inline"><li><a href="#"><i class="glyphicon glyphicon-align-left"></i></a></li><li><a href="#"><i class="glyphicon glyphicon-align-center"></i></a></li><li><a href="#"><i class="glyphicon glyphicon-align-right"></i></a></li></ul>
                    </form>
                </div><!--/well-->
             
                <div class="panel panel-default">
                   <div class="panel-heading"><a href="#" class="pull-right">View all</a> <h4>Responsive Design</h4></div>
                    <div class="panel-body">
                      <p><a class="img-circle pull-right"> <a href="#">Bootstrap Playground</a></p>
                      <div class="clearfix"></div>
                      <hr>
                      Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate. 
                      Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
                      dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
                      Aliquam in felis sit amet augue.
                      <hr>
                      <div class="btn-group pull-right btn-toggle"> 
                        <button class="btn btn-default">ON</button>
                        <button class="btn btn-primary active">OFF</button>
                      </div>
                    </div><!--/panel-body-->
                 </div><!--/panel-->
            </div><!--/col-->
            
            <div class="col-sm-6">
                 <div class="panel panel-default">
                   <div class="panel-heading"><h4>Therapists on your area</h4></div>
                    <div class="panel-body">
                      <p><img src="//placehold.it/100" class="img-circle pull-right"> <a href="#"></a></p>
                      <p><img src="//placehold.it/100" class="img-circle pull-right"> <a href="#"></a></p>
                      <p><img src="//placehold.it/100" class="img-circle pull-right"> <a href="#"></a></p>
                      <p><img src="//placehold.it/100" class="img-circle pull-right"> <a href="#"></a></p>
                      <p><img src="//placehold.it/100" class="img-circle pull-right"> <a href="#"></a></p>
                      <div class="btn-group pull-right btn-toggle"> 
                        <hr>Find more</hr>
                      </div>
                    </div><!--/panel-body-->
                 </div><!--/panel-->
              
                 <div class="panel panel-default">
                   <div class="panel-heading"><a href="#" class="pull-right"><?php echo $_SESSION['userid']?></a> <h4>Talk to Someone!</h4></div>
                    <div class="panel-body rooms">
                        <ul>
                        <?php 
                          while($rooms = mysql_fetch_array($roomResults)):
                            $room = $rooms['name'];
                            $query = mysql_query("SELECT * FROM `chat_users_rooms` WHERE `room` = '$room' ") or die("Cannot find data". mysql_error());
                            $numOfUsers = mysql_num_rows($query);
                        ?>
                        <li>
                        <a href="room/?name=<?php echo $rooms['name']?>"><?php echo $rooms['name'] . "<span>Users chatting: <strong>" . $numOfUsers . "</strong></span>" ?></a>
                        </li>
                          <?php endwhile; ?>
                        </ul>
                    </div><!--/panel-body-->
                 </div><!--/panel-->
              </div><!--/col-->
          </div><!--/row-->
          
          <h1 id="section1">Questionare</h1>
  
          <div class="panel panel-default">
          	<div class="panel-heading"><a href="#" class="pull-right">View all</a> <h4>Newest Items</h4></div>
   			<div class="panel-body">
              <div class="list-group">
                <a href="#" class="list-group-item active">Active item</a>
                <a href="#" class="list-group-item">Second item</a>
                <a href="#" class="list-group-item">Third item</a>
              </div>
            </div>
          </div><!--/panel-->
          
          <p>Vestibulum porttitor massa eget pellentesque eleifend. Suspendisse tempor, nisi eu placerat auctor, 
            est erat tempus neque, pellentesque venenatis eros lorem vel quam. Nulla luctus malesuada porttitor. 
            Fusce risus mi, luctus scelerisque hendrerit feugiat, volutpat gravida nisi. Quisque facilisis risus 
            in lacus sagittis malesuada. Suspendisse non purus diam. Nunc commodo felis sit amet tortor 
            adipiscing varius. Fusce commodo nulla quis fermentum hendrerit. Donec vulputate, tellus sed 
            venenatis sodales, purus nibh ullamcorper quam, sit amet tristique justo velit molestie lorem.</p>
    
          <h1 id="section2">Section 2</h1>
          <p>Fusce sollicitudin lacus lacinia mi tincidunt ullamcorper. Aenean velit ipsum, vestibulum nec 
            tincidunt eu, lobortis vitae erat. Nullam ultricies fringilla ultricies. Sed euismod nibh quis 
            tincidunt dapibus. Nulla quam velit, porta sit amet felis eu, auctor fringilla elit. Donec 
            convallis tincidunt nibh, quis pellentesque sapien condimentum a. Phasellus purus dui, rhoncus 
            id suscipit id, ornare et sem. Duis aliquet posuere arcu a ornare. Pellentesque consequat libero 
            id massa accumsan volutpat. Fusce a hendrerit lacus. Nam elementum ac eros eu porttitor. 
            Phasellus enim mi, auctor sit amet luctus a, commodo fermentum arcu. In volutpat scelerisque 
            quam, nec lacinia libero.
          </p>
          <hr>
          <button class="btn btn-primary">View</button> <button class="btn btn-primary">Download</button>
          
          <h1 id="section3">Section 3</h1>
          <p>Aliquam a lacinia orci, iaculis porttitor neque. Nullam cursus dolor tempus mauris posuere, eu 
            scelerisque sem tincidunt. Praesent blandit sapien at sem pulvinar, vel egestas orci varius. 
            Praesent vitae purus at ante aliquet luctus vel quis nibh. Mauris id nulla vitae est lacinia 
            rhoncus a vel justo. Donec iaculis quis sapien vel molestie. Aliquam sed elementum orci. 
            Vestibulum tristique tempor risus et malesuada. Sed eget ligula sed quam placerat dapibus. 
            Integer accumsan ac massa at tempus.</p>
         
          <hr>
  
          <h1 id="section3">Elements</h1>
          <div class="row">
              <div class="col-md-12">
                <div class="alert alert-info alert-dismissable">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                    <strong>Heads up!</strong> This alert needs your attention, but it's not super important.
                </div>
              </div>
              <div class="col-sm-6">
                <div class="panel panel-default">
                   <div class="panel-heading"><a href="#" class="pull-right">View all</a> <h4>Buttons &amp; Labels</h4></div>
                    <div class="panel-body">
                      <div class="row">
                        <div class="col-xs-4"><a class="btn btn-default center-block" href="#">Button</a></div>
                        <div class="col-xs-4"><a class="btn btn-primary center-block" href="#">Primary</a></div>
                        <div class="col-xs-4"><a class="btn btn-danger center-block" href="#">Danger</a></div>
                      </div>
                      <br>
                      <div class="row">
                        <div class="col-xs-4"><a class="btn btn-warning center-block" href="#">Warning</a></div>
                        <div class="col-xs-4"><a class="btn btn-info center-block" href="#">Info</a></div>
                        <div class="col-xs-4"><a class="btn btn-success center-block" href="#">Success</a></div>
                      </div>
                      <hr>
                      <div class="btn-group btn-group-sm"><button class="btn btn-default">1</button><button class="btn btn-default">2</button><button class="btn btn-default">3</button></div>              
                      <hr>
                      <div class="row">
                        <div class="col-md-4">
                          <span class="label label-default">Label</span>
                          <span class="label label-success">Success</span>
                        </div>
                        <div class="col-md-4">
                          <span class="label label-warning">Warning</span>  
                          <span class="label label-info">Info</span>
                        </div>
                        <div class="col-md-4">
                          <span class="label label-danger">Danger</span>
                          <span class="label label-primary">Primary</span>
                        </div>
                      </div><!--/row-->
                    </div><!--/panel-body-->
               </div><!--/panel-->
           </div><!--/col-6-->
            
           <div class="col-sm-6">
              <div class="panel panel-default">
                 <div class="panel-heading"><a href="#" class="pull-right">View all</a> <h4>Progress Bars</h4></div>
                  <div class="panel-body">
                    
                    <div class="progress">
                      <div class="progress-bar progress-bar-info" style="width: 20%"></div>
                    </div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-success" style="width: 40%"></div>
                    </div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-warning" style="width: 80%"></div>
                    </div>
                    <div class="progress">
                      <div class="progress-bar progress-bar-danger" style="width: 50%"></div>
                    </div>
                    
                  </div><!--/panel-body-->
              </div><!--/panel-->
          </div><!--/col-6-->
            
          <div class="col-sm-6">
              <div class="panel panel-default">
                 <div class="panel-heading"><a href="#" class="pull-right">View all</a> <h4>Tabs</h4></div>
                  <div class="panel-body">
      
                      <ul class="nav nav-tabs">
                        <li class="active"><a href="#A" data-toggle="tab">Section 1</a></li>
                        <li><a href="#B" data-toggle="tab">Section 2</a></li>
                        <li><a href="#C" data-toggle="tab">Section 3</a></li>
                      </ul>
                      <div class="tabbable">
                        <div class="tab-content">
                          <div class="tab-pane active" id="A">
                            <div class="well well-sm">I'm in Section A.</div>
                          </div>
                          <div class="tab-pane" id="B">
                            <div class="well well-sm">Howdy, I'm in Section B.</div>
                          </div>
                          <div class="tab-pane" id="C">
                            <div class="well well-sm">I've decided that I like wells.</div>
                          </div>
                        </div>
                      </div> <!-- /tabbable -->
                    
                      <div class="col-sm-12 text-center">
                        <ul class="pagination center-block" style="display:inline-block;">
                          <li><a href="#">«</a></li>
                          <li><a href="#">1</a></li>
                          <li><a href="#">2</a></li>
                          <li><a href="#">3</a></li>
                          <li><a href="#">4</a></li>
                          <li><a href="#">5</a></li>
                          <li><a href="#">»</a></li>
                        </ul>
                      </div>
                    
                  </div><!--/panel-body-->
               </div> <!--/panel-->
            </div><!--/col-6-->
          
          	<div class="clearfix"></div>
          
        </div><!--/.col-xs-12-->
      </div><!--/.row-->
    </div>
            </div>
  </div><!--/.container-->
</div><!--/.page-container-->
  
<footer><!--footer-->
  <div class="container">
      	<div class="row">
          <ul class="list-unstyled text-right">
            <li class="col-sm-4 col-xs-6">
              <a href="#">Home</a>
            </li>
            <li class="col-sm-4 col-xs-6">
              <a href="#">Services</a>
            </li>
            <li class="col-sm-4 col-xs-6">
              <a href="#">Your Posts</a>
            </li>
            <li class="col-sm-4 col-xs-6">
              <a href="#">Contact Help</a>
            </li>
            <li class="col-sm-4 col-xs-6">
              <a href="#">Logout</a>
            </li>
           <li class="col-sm-4 col-xs-6">
              <a href="#">Donate</a>
            </li>
          </ul>
		</div><!--/row-->
    </div><!--/container-->
</footer>
        
	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/scripts.js"></script>
	</body>
</html>

<?php 
    else:
        require_once("chatrooms.php");
    endif; 
?>