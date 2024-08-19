<div class="p-4">
	<h1 class="text-2xl font-bold text-center mb-5">List of Sales</h1>

	<label class="btn btn-primary mb-5" for="modal-1">Add new sale</label>
	<input class="modal-state" id="modal-1" type="checkbox" />

	<div class="modal">
		<label class="modal-overlay" for="modal-1"></label>
		<div class="modal-content flex flex-col gap-5">
			<label for="modal-1" class="btn btn-sm btn-circle btn-ghost absolute right-2 top-2">✕</label>
			<h2 class="text-xl">Add new sale</h2>
			<form action="" method="post" class="form-group">
				<div class="form-field">
					<!-- svelte-ignore a11y-label-has-associated-control -->
					<label class="form-label">Amount</label>
					<input placeholder="Type here" type="number" class="input max-w-full" />
					<!-- svelte-ignore a11y-label-has-associated-control -->
					<label class="form-label">
						<span class="form-label-alt">Please enter the amount of the sale.</span>
					</label>
				</div>
				<div class="form-field">
					<!-- svelte-ignore a11y-label-has-associated-control -->
					<label class="form-label">Description</label>
					<input placeholder="Type here" type="text" class="input max-w-full" />
					<!-- svelte-ignore a11y-label-has-associated-control -->
					<label class="form-label">
						<span class="form-label-alt">Please enter a description of the sale.</span>
					</label>
				</div>
			</form>
			<div class="flex gap-3">
				<button class="btn btn-primary btn-block" type="submit">Add</button>
				<button class="btn btn-block">Cancel</button>
			</div>
		</div>
	</div>

	<div class="flex w-full overflow-x-auto">
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Date and Time</th>
					<th>Description</th>
					<th>Amount</th>
					<th>Seller</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>1</th>
					<td>2024-08-19 00:34</td>
					<td>A Fucking Pepsi</td>
					<td>8.00</td>
					<td>
						<!-- svelte-ignore a11y-invalid-attribute -->
						<a href="#">Admin</a>
					</td>
					<td>
						<div class="btn-group btn-group-scrollable">
							<button class="btn">Update</button>
							<button class="btn">Delete</button>
							<button class="btn">Print</button>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
