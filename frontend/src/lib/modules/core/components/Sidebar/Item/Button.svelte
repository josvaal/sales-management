<script>
	export let items;
	const itemsLength = items.length;
</script>

{#if itemsLength > 1}
	<input type="checkbox" id="menu-2" class="menu-toggle" />
	<label class="menu-item justify-between" for="menu-2">
		<div class="flex gap-2">
			<a href={items[0].url} class="w-full">
				<span>
					{items[0].title}
				</span>
			</a>
		</div>
		<span class="menu-icon">
			<svg
				xmlns="http://www.w3.org/2000/svg"
				class="h-5 w-5"
				viewBox="0 0 20 20"
				fill="currentColor"
			>
				<path
					fill-rule="evenodd"
					d="M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z"
					clip-rule="evenodd"
				/>
			</svg>
		</span>
	</label>

	<div class="menu-item-collapse">
		<div class="min-h-0">
			{#each items.slice(1) as item, index}
				<!-- svelte-ignore a11y-label-has-associated-control -->
				<label class="menu-item ml-6">
					<a href={item.url} class="w-full">{item.title}</a>
				</label>
			{/each}
		</div>
	</div>
{:else}
	<a href={items[0].url} class="w-full">
		<span>
			{items[0].title}
		</span>
	</a>
{/if}
