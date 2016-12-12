var selectedElement=null;
function sendRequest(source) {
if (selectedElement==null) {
alert("Bitte Eintrag selektieren!");
exit;
}""
source.form.method.value=source.name;
source.form.autoID.value=selectedElement.id.substring(3);
source.form.color.value=source.form.farbeEintragen.value;
source.form.submit();
}
function selectAuto(element){
if (selectedElement!=null) {
selectedElement.className = "";
}
element.className = "tr_selected";
selectedElement = element;
}
function mouseOver(element) {
if (element!=selectedElement) {
element.className = "tr_hover";
}
}
function mouseOut(element) {
if (element!=selectedElement) {
element.className = "";
}
}