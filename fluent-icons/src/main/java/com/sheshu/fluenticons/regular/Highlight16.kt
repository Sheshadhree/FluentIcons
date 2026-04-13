package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Highlight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Highlight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 1f)
            curveTo(2.776f, 1f, 3f, 1.224f, 3f, 1.5f)
            verticalLineToRelative(3f)
            curveTo(3f, 4.776f, 3.224f, 5f, 3.5f, 5f)
            horizontalLineToRelative(9.002f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.654f, -0.418f, 1.21f, -1.001f, 1.415f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.105f, -0.896f, 2f, -2f, 2f)
            horizontalLineTo(11f)
            lineToRelative(0.003f, 1.74f)
            curveToRelative(0f, 0.511f, -0.26f, 0.988f, -0.69f, 1.265f)
            lineToRelative(-4.54f, 2.916f)
            curveToRelative(-0.154f, 0.099f, -0.35f, 0.106f, -0.51f, 0.018f)
            curveToRelative(-0.16f, -0.088f, -0.26f, -0.256f, -0.26f, -0.439f)
            verticalLineTo(9f)
            horizontalLineTo(5f)
            curveTo(3.895f, 9f, 3f, 8.105f, 3f, 7f)
            verticalLineTo(5.915f)
            curveTo(2.418f, 5.709f, 2f, 5.154f, 2f, 4.5f)
            verticalLineToRelative(-3f)
            curveTo(2f, 1.224f, 2.224f, 1f, 2.5f, 1f)
            close()
            moveToRelative(3.503f, 8f)
            verticalLineToRelative(4.585f)
            lineToRelative(3.77f, -2.422f)
            curveToRelative(0.144f, -0.092f, 0.23f, -0.25f, 0.23f, -0.421f)
            lineTo(10f, 9f)
            horizontalLineTo(6.003f)
            close()
            moveTo(4f, 7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            horizontalLineTo(4f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
