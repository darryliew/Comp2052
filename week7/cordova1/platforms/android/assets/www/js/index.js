/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
var app = {
    // Application Constructor
    initialize: function() {
        document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);
    },

    // deviceready Event Handler
    //
    // Bind any cordova events here. Common events are:
    // 'pause', 'resume', etc.
    onDeviceReady: function() {
        this.receivedEvent('deviceready');
    },

    // Update DOM on a Received Event
    receivedEvent: function(id) {
        var parentElement = document.getElementById(id);
        var listeningElement = parentElement.querySelector('.listening');
        var receivedElement = parentElement.querySelector('.received');

        listeningElement.setAttribute('style', 'display:none;');
        receivedElement.setAttribute('style', 'display:block;');

        console.log('Received Event: ' + id);
    }
	
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
};

app.initialize();