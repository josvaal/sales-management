<script>
	import moneyIcon from '$lib/assets/money.svg?raw';
	import { data } from '$lib/index.js';
</script>

<section class="sidebar-title items-center p-4">
	{@html data.icon}
	<div class="flex flex-col">
		<span>{data.title}</span>
	</div>
</section>
