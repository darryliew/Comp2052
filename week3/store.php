<?php
// Exit if accessed directly
if (!defined('ABSPATH')) { exit; }

/**
 * Template Name: A01019428 STORE DATA
 */
?>
<?php get_header(); ?>

<div id="content" 
     class="<?php echo esc_attr(implode(' ', responsive_get_content_classes())); ?>">

<h1>Questionnaire</h1>

<?php echo 'comp 2052 php code output'; ?>

<form method="POST" id="dataform"><pre>
Name:          <input type="text" class="field" name="A01019428_fullname"/>
<input type="radio" name="gender" value="male"> Male<br></input>
<input type="radio" name="gender" value="female"> Female<br></input>
<input type="radio" name="gender" value="alien"> Alien<br></input>
<input type="submit" class="submit" value="Submit"/>
</form>

</div>

<?php get_sidebar(); ?>
<?php get_footer(); ?>

<?php if(isset($_POST['A01019428_fullname']) && !empty($_POST['A01019428_fullname'])): ?>
   <?php add_option('A01019428_'.date("ymd-His"), json_encode($_POST)); ?>
   <script>
      alert("Thanks for submitting your data!");
      location.href='http://127.0.0.1:4001/wordpress/output/';
   </script>
<?php
   endif;
?>
