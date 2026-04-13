package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(1.757f)
            curveTo(5.472f, 13.05f, 5f, 11.83f, 5f, 10.5f)
            curveTo(5f, 7.462f, 7.462f, 5f, 10.5f, 5f)
            curveToRelative(1.33f, 0f, 2.55f, 0.472f, 3.5f, 1.257f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(6f, 13f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(12.985f, 6f, 10.5f, 6f)
            reflectiveCurveTo(6f, 8.015f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 15f, 10.5f, 15f)
            close()
            moveToRelative(0f, -7f)
            curveTo(10.776f, 8f, 11f, 8.224f, 11f, 8.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 11f, 12.5f, 11f)
            horizontalLineTo(11f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 12.776f, 10f, 12.5f)
            verticalLineTo(11f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 11f, 8f, 10.776f, 8f, 10.5f)
            reflectiveCurveTo(8.224f, 10f, 8.5f, 10f)
            horizontalLineTo(10f)
            verticalLineTo(8.5f)
            curveTo(10f, 8.224f, 10.224f, 8f, 10.5f, 8f)
            close()
        }
    }.build()
}
