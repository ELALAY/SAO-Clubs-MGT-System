<!DOCTYPE html>
<!-- get_product_to_update.php -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>My Name: Delete Product</title>
</head>
<body>
<?php include_once 'includes/get_and_delete_Product.inc.php';?>

  <!-- Add product form to be output if the POST variables are not
  set or if the registration script caused an error. -->
  <h2>Enter a product</h2>
  <?php echo $error_msg;?>
  <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post" name="Delete_product_form">
    Product code: <input type="text" name="pcode" value="<?php echo $pcode;?>" />
    <input type="submit" value="Submit" onclick="return checkform2(this.form, this.form.pcode);" />
    <input type="reset" />
  </form>
  <p>Go back to <a href="index.html">main page</a>.</p>
</body>
</html>
