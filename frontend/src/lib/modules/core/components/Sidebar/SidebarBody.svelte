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
						<!-- svelte-ignore a11y-label-has-associated-control -->
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
