package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ColumnSingleCompare16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColumnSingleCompare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 1f)
            curveTo(3.784f, 1f, 3f, 1.784f, 3f, 2.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.846f, 0.6f, 1.551f, 1.397f, 1.714f)
            curveTo(4.511f, 14.988f, 4.63f, 15f, 4.75f, 15f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(2.75f)
            curveTo(13f, 1.784f, 12.216f, 1f, 11.25f, 1f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(4f, 5f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(1f)
            horizontalLineTo(4f)
            verticalLineTo(5f)
            close()
            moveToRelative(0f, 4f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(2f)
            horizontalLineTo(4f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}
