/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Graph wrapper is resizable
 * @type type
 */
interact('#wrapGraph')
  .resizable({
    preserveAspectRatio: true,
    edges: { left: false, right: true, bottom: false, top: false }
  })
  .on('resizemove', function (event) {
    var target = event.target;
    // update the element's style
    target.style.width  = event.rect.width + 'px';
    
    var appWidth = document.getElementById('wrapPanel').offsetWidth;
    console.log(appWidth);
    
    changeRightPanelSize(appWidth - event.rect.width - 30);
  });

/**
 * Change right panel size
 * @param {type} width
 * @returns {undefined}
 */
function changeRightPanelSize(width) {
    document.getElementById('wrapRightPanel').style.width = width + "px";
}

/**
 * Change test driver wrapper size
 * @param {type} height
 * @returns {undefined}
 */
function changeDetailsSize(height){
    document.getElementById('wrapTestDriver').style.height = height + "px";
}

/**
 * details wrapper is resizable
 */
interact('#wrapDetails').resizable({
    preserveAspectRatio: true,
    edges: { bottom: true }
}).on('resizemove', function(event){
    var target = event.target;
    target.style.height = event.rect.height + 'px';
    var rightPanelHeight = document.getElementById('wrapRightPanel').offsetHeight;
    
    changeDetailsSize(rightPanelHeight - event.rect.height);
});

