package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ColumnSingle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColumnSingle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.75f)
            curveTo(4f, 2.784f, 4.784f, 2f, 5.75f, 2f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.477f, 0f, 0.91f, 0.19f, 1.225f, 0.5f)
            horizontalLineTo(10.5f)
            verticalLineToRelative(0.025f)
            curveTo(10.81f, 2.841f, 11f, 3.273f, 11f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(11f, 13.216f, 10.216f, 14f, 9.25f, 14f)
            horizontalLineToRelative(-3.5f)
            curveTo(4.784f, 14f, 4f, 13.216f, 4f, 12.25f)
            verticalLineToRelative(-8.5f)
            close()
            moveToRelative(1f, 8.5f)
            curveTo(5f, 12.664f, 5.336f, 13f, 5.75f, 13f)
            horizontalLineToRelative(3.5f)
            curveTo(9.664f, 13f, 10f, 12.664f, 10f, 12.25f)
            verticalLineTo(6f)
            horizontalLineTo(5f)
            verticalLineToRelative(6.25f)
            close()
        }
    }.build()
}
