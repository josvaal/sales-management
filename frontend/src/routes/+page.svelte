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
		<table class="table table-compact">
			<thead>
				<tr>
					<td colspan="6" class="text-center text-xl p-2">Today's sale</td>
				</tr>
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Amount</th>
					<th>Seller</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>
						<input class="input min-w-32 w-32" placeholder="Filter by ID" type="number" />
					</td>
					<td>
						<input class="input min-w-44 w-44" placeholder="Filter by Description" />
					</td>
					<td>
						<input class="input min-w-44 w-44" placeholder="Filter by Amount" type="number" />
					</td>
					<td>
						<input class="input min-w-40 w-40" placeholder="Filter by Seller" />
					</td>
					<td> </td>
				</tr>
				<tr>
					<th>1</th>
					<td>A Fucking Pepsi</td>
					<td>8.00</td>
					<td>
						<!-- svelte-ignore a11y-invalid-attribute -->
						<a href="#">Admin</a>
					</td>
					<td>
						<label class="btn" for="modal-1">Update</label>
						<input class="modal-state" id="modal-1" type="checkbox" />
						<label class="btn" for="modal-2">Delete</label>
						<input class="modal-state" id="modal-2" type="checkbox" />

						<div class="modal">
							<label class="modal-overlay" for="modal-2"></label>
							<div class="modal-content flex flex-col gap-5">
								<label for="modal-2" class="btn btn-sm btn-circle btn-ghost absolute right-2 top-2"
									>✕</label
								>
								<h2 class="text-xl">Delete Sale</h2>
								<span> Are you sure you want to delete this sales record? </span>
								<div class="flex gap-3">
									<button class="btn btn-error btn-block">Delete</button>

									<button class="btn btn-block">Cancel</button>
								</div>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<th>1</th>
					<td>A Fucking Pepsi</td>
					<td>8.00</td>
					<td>
						<!-- svelte-ignore a11y-invalid-attribute -->
						<a href="#">Admin</a>
					</td>
					<td>
						<label class="btn" for="modal-1">Update</label>
						<input class="modal-state" id="modal-1" type="checkbox" />
						<label class="btn" for="modal-2">Delete</label>
						<input class="modal-state" id="modal-2" type="checkbox" />

						<div class="modal">
							<label class="modal-overlay" for="modal-2"></label>
							<div class="modal-content flex flex-col gap-5">
								<label for="modal-2" class="btn btn-sm btn-circle btn-ghost absolute right-2 top-2"
									>✕</label
								>
								<h2 class="text-xl">Delete Sale</h2>
								<span> Are you sure you want to delete this sales record? </span>
								<div class="flex gap-3">
									<button class="btn btn-error btn-block">Delete</button>

									<button class="btn btn-block">Cancel</button>
								</div>
							</div>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
