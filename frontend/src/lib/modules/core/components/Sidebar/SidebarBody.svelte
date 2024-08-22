<script>
	import Button from './Item/Button.svelte';
</script>

<section class="sidebar-content min-h-[20rem]">
	<nav class="menu rounded-md">
		<section class="menu-section px-4">
			<span class="menu-title">Main menu</span>
			<ul class="menu-items">
				<li class="menu-item">
					<Button items={[{ title: 'Summary', url: '#' }]} />
				</li>

				<li class="menu-item">
					<Button items={[{ title: 'Users', url: '#' }]} />
				</li>
				<li>
					<Button
						items={[
							{ title: 'Reports', url: '#' },
							{ title: 'Daily', url: '#' },
							{ title: 'Monthly', url: '#' },
							{ title: 'Yearly', url: '#' },
							{ title: 'Alll', url: '#' }
						]}
					/>
				</li>
			</ul>
		</section>
	</nav>
</section>
