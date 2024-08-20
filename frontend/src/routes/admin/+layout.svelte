<script>
	import moneyIcon from '$lib/assets/money.svg?raw';
</script>

<div class="sticky flex h-screen flex-row gap-4 overflow-y-auto rounded-lg sm:overflow-x-hidden">
	<aside class="sidebar-sticky sidebar justify-start">
		<section class="sidebar-title items-center p-4">
			{@html moneyIcon}
			<div class="flex flex-col">
				<span>Sales Management</span>
			</div>
		</section>
		<section class="sidebar-content min-h-[20rem]">
			<nav class="menu rounded-md">
				<section class="menu-section px-4">
					<span class="menu-title">Main menu</span>
					<ul class="menu-items">
						<li class="menu-item menu-active">
							<span>Summary</span>
						</li>

						<li class="menu-item">
							<span>Users</span>
						</li>
						<li>
							<input type="checkbox" id="menu-2" class="menu-toggle" />
							<label class="menu-item justify-between" for="menu-2">
								<div class="flex gap-2">
									<span>Reports</span>
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
									<label class="menu-item ml-6">Daily</label>
									<label class="menu-item ml-6">Monthly</label>
									<label class="menu-item ml-6">Yearly</label>
									<label class="menu-item ml-6">All</label>
								</div>
							</div>
						</li>
					</ul>
				</section>
			</nav>
		</section>
		<section class="sidebar-footer bg-gray-2 pt-2">
			<div class="divider my-0"></div>
			<div class="dropdown z-50 flex h-fit w-full cursor-pointer hover:bg-gray-4">
				<!-- svelte-ignore a11y-no-noninteractive-tabindex -->
				<!-- svelte-ignore a11y-label-has-associated-control -->
				<label
					class="whites mx-2 flex h-fit w-full cursor-pointer p-0 hover:bg-gray-4"
					tabindex="0"
				>
					<div class="flex flex-row gap-4 p-4">
						<div class="avatar avatar-md">
							<img
								src="https://static.vecteezy.com/system/resources/previews/030/750/807/non_2x/user-icon-in-trendy-outline-style-isolated-on-white-background-user-silhouette-symbol-for-your-website-design-logo-app-ui-illustration-eps10-free-vector.jpg"
								alt="avatar"
							/>
						</div>

						<div class="flex flex-col">
							<span>Admin</span>
							<span class="text-xs font-normal text-content2">Admin</span>
						</div>
					</div>
				</label>
				<div class="dropdown-menu-right-top dropdown-menu ml-2">
					<a class="dropdown-item text-sm menu-item-disabled">Profile</a>
					<a tabindex="-1" class="dropdown-item text-sm menu-item-disabled">Account settings</a>
					<a tabindex="-1" class="dropdown-item text-sm menu-item-disabled">Change email</a>
					<a tabindex="-1" class="dropdown-item text-sm menu-item-disabled">Subscriptions</a>
					<a tabindex="-1" class="dropdown-item text-sm menu-item-disabled">Change password</a>
					<a tabindex="-1" class="dropdown-item text-sm menu-item-disabled">Settings</a>
					<a tabindex="-1" class="dropdown-item text-sm">Logout</a>
				</div>
			</div>
		</section>
	</aside>
	<div class="flex w-full flex-row flex-wrap gap-4 p-6">
		<slot />
	</div>
</div>
