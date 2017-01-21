$( "select" ).change(function () {
  $( "select option:selected" ).each(function() {});

  if( $( this ).val() == "downtown" ) {    
    $("#description").html('<p>The BCIT Downtown Campus is in the heart of Vancouver, near the Granville Skytrain Station.</p><p>555 Seymour Street<br />Vancouver, British Columbia<br />V6B 3H6 , Canada</p>More Information: <a href="http://www.bcit.ca/about/downtown.shtml">Downtown Campus</a>');
    $("figure").html('<img style="height:100%;width:100%" src="1.jpg" />')    
  }

  if( $( this ).val() == "burnaby" ) {
    $("#description").html('<p>The BCIT Burnaby Campus is located just off the Trans-Canada Highway at the corner of Willingdon Avenue and Canada Way</p><p>3700 Willingdon Avenue <br />Burnaby, BC V5G 3H2</p>More Information: <a href="http://www.bcit.ca/about/burnaby.shtml">Burnaby Campus</center></a>');
    $("figure").html('<img style="height:100%;width:100%" src="2.jpg" />')    
  }

}).change();