package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RowChild16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RowChild16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(8.5f)
            curveTo(13.216f, 2f, 14f, 2.784f, 14f, 3.75f)
            verticalLineToRelative(1.5f)
            curveTo(14f, 6.216f, 13.216f, 7f, 12.25f, 7f)
            horizontalLineTo(5f)
            verticalLineToRelative(2.5f)
            curveTo(5f, 10.328f, 5.672f, 11f, 6.5f, 11f)
            horizontalLineTo(8f)
            verticalLineToRelative(-0.25f)
            curveTo(8f, 9.784f, 8.784f, 9f, 9.75f, 9f)
            horizontalLineToRelative(2.5f)
            curveTo(13.216f, 9f, 14f, 9.784f, 14f, 10.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(8.784f, 14f, 8f, 13.216f, 8f, 12.25f)
            verticalLineTo(12f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 12f, 4f, 10.88f, 4f, 9.5f)
            verticalLineTo(7f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 7f, 2f, 6.216f, 2f, 5.25f)
            verticalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
