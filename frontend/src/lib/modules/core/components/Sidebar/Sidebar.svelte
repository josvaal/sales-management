<script>
	import SidebarBody from '$lib/modules/core/components/Sidebar/SidebarBody.svelte';
	import SidebarFooter from '$lib/modules/core/components/Sidebar/SidebarFooter.svelte';
	import SidebarHeader from '$lib/modules/core/components/Sidebar/SidebarHeader.svelte';
</script>

<div class="sticky flex h-screen flex-row gap-4 overflow-y-auto rounded-lg sm:overflow-x-hidden">
	<aside class="sidebar-sticky sidebar justify-start">
		<SidebarHeader />
		<SidebarBody />
		<SidebarFooter />
	</aside>
	<div class="flex w-full flex-row flex-wrap gap-4 p-6">
		<slot />
	</div>
</div>
