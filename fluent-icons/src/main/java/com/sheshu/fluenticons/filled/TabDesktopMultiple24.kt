package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 6.01f)
            curveToRelative(1.68f, 0.126f, 3.002f, 1.529f, 3.002f, 3.24f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.623f, -2.126f, 4.75f, -4.75f, 4.75f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.71f, 0f, -3.113f, -1.322f, -3.24f, -3f)
            horizontalLineToRelative(8.739f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(6.01f)
            close()
            moveTo(5.25f, 2f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineToRelative(9.5f)
            curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(-7.25f)
            curveTo(9.507f, 7.5f, 8.5f, 6.493f, 8.5f, 5.25f)
            verticalLineTo(2f)
            horizontalLineTo(5.25f)
            close()
            moveToRelative(5.5f, 4f)
            horizontalLineTo(18f)
            verticalLineTo(5.25f)
            curveTo(18f, 3.455f, 16.545f, 2f, 14.75f, 2f)
            horizontalLineTo(10f)
            verticalLineToRelative(3.25f)
            curveTo(10f, 5.664f, 10.336f, 6f, 10.75f, 6f)
            close()
        }
    }.build()
}
