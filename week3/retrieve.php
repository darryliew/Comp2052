<?php
// Exit if accessed directly
if (!defined('ABSPATH')) { exit; }

/**
 * Template Name: A01019428 RETRIEVE DATA
 */
?>
<?php get_header(); ?>

<div id="content" 
     class="<?php echo esc_attr(implode(' ', responsive_get_content_classes())); ?>">

<h1>Whose who?</h1>

<?php
$male = 0;
$female = 0;
$alien = 0;

$sql = "SELECT * FROM wp_options WHERE option_name LIKE 'A01019428%' ORDER BY option_name";
$options = $wpdb->get_results($sql);
foreach ($options as $option) {
    echo '<p><b>'.$option->option_name.'</b> = '
         .esc_attr($option->option_value).'</p>'.PHP_EOL;
    echo '<p>JSON Decoded:</p>'.PHP_EOL;
    $data = json_decode($option->option_value, TRUE);
    if (is_array($data)) {
        foreach ($data as $key => $value)
        {
            echo $key.' = <b>'.$value.'</b><br>';

            if($value == 'male') {
                $male++;
            } else if ($value == 'female') {
                $female++;
            } else if ($value == 'alien') {
                $alien++;
            }
        }    
        echo '-------------------------------------------------------------------<br>'.PHP_EOL;          
    }           
}

$male_angle = $male/($male+$female+$alien)*360;
$female_angle = $female/($male+$female+$alien)*360;
$alien_angle = $alien/($male+$female+$alien)*360;

// ask Alexander why the pie chart doesn't display?
?>

<script src="piechart.js"></script>
<canvas id="piechart1" width="200" height="200"></canvas>

<script>
   piechart(
      "piechart1", 
      ["blue", "red", "green"], 
      [<?php echo $male_angle; ?>, <?php echo $female_angle; ?>, <?php echo $alien_angle; ?>]
   );
</script><br>

</div>

<?php get_sidebar(); ?>
<?php get_footer(); ?>

