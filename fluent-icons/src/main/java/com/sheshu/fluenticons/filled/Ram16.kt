package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ram16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ram16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 8f)
            horizontalLineToRelative(2f)
            verticalLineTo(6f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            close()
            moveTo(7f, 8f)
            horizontalLineToRelative(2f)
            verticalLineTo(6f)
            horizontalLineTo(7f)
            verticalLineToRelative(2f)
            close()
            moveTo(4f, 8f)
            horizontalLineToRelative(2f)
            verticalLineTo(6f)
            horizontalLineTo(4f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(9f, -5f)
            horizontalLineTo(3f)
            curveTo(1.897f, 3f, 1f, 3.897f, 1f, 5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.739f, 0.403f, 1.385f, 1f, 1.731f)
            verticalLineToRelative(1.019f)
            curveTo(2f, 12.439f, 2.561f, 13f, 3.25f, 13f)
            horizontalLineTo(6.5f)
            curveToRelative(0.133f, 0f, 0.26f, -0.053f, 0.354f, -0.146f)
            lineTo(8f, 11.708f)
            lineToRelative(1.146f, 1.146f)
            curveTo(9.24f, 12.948f, 9.367f, 13f, 9.5f, 13f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.689f, 0f, 1.25f, -0.561f, 1.25f, -1.25f)
            verticalLineToRelative(-1.019f)
            curveToRelative(0.597f, -0.346f, 1f, -0.992f, 1f, -1.731f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.103f, -0.897f, -2f, -2f, -2f)
            close()
            moveToRelative(0f, 5.5f)
            curveTo(13f, 8.776f, 12.776f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 5.224f, 3.224f, 5f, 3.5f, 5f)
            horizontalLineToRelative(9f)
            curveTo(12.776f, 5f, 13f, 5.224f, 13f, 5.5f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
