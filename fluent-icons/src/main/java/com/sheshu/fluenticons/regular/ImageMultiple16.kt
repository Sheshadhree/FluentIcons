package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(8f, 5.552f, 8f, 5f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 10.88f, 3.12f, 12f, 4.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(12f, 3.12f, 10.88f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(5f)
            curveTo(10.328f, 3f, 11f, 3.672f, 11f, 4.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.232f, -0.053f, 0.45f, -0.146f, 0.647f)
            lineTo(8.209f, 7.502f)
            curveToRelative(-0.668f, -0.668f, -1.75f, -0.668f, -2.418f, 0f)
            lineToRelative(-2.645f, 2.645f)
            curveTo(3.053f, 9.95f, 3f, 9.732f, 3f, 9.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(0.853f, 6.354f)
            lineToRelative(2.645f, -2.645f)
            curveToRelative(0.277f, -0.277f, 0.727f, -0.277f, 1.004f, 0f)
            lineToRelative(2.645f, 2.645f)
            curveTo(9.95f, 10.948f, 9.732f, 11f, 9.5f, 11f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.232f, 0f, -0.45f, -0.053f, -0.647f, -0.146f)
            close()
            moveTo(7f, 14f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(4f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
