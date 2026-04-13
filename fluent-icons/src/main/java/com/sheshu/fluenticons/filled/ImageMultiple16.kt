package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.51f, 0.152f, 0.983f, 0.414f, 1.378f)
            lineToRelative(3.377f, -3.376f)
            curveToRelative(0.668f, -0.668f, 1.75f, -0.668f, 2.418f, 0f)
            lineToRelative(3.377f, 3.377f)
            curveTo(11.848f, 10.483f, 12f, 10.009f, 12f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(12f, 3.12f, 10.88f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(10f, 5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(8f, 5.552f, 8f, 5f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(0.879f, 6.586f)
            lineTo(7.502f, 8.209f)
            curveToRelative(-0.277f, -0.277f, -0.727f, -0.277f, -1.004f, 0f)
            lineTo(3.12f, 11.586f)
            curveTo(3.516f, 11.847f, 3.991f, 12f, 4.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.51f, 0f, 0.983f, -0.152f, 1.379f, -0.414f)
            close()
            moveTo(4.999f, 13f)
            curveToRelative(0.457f, 0.607f, 1.183f, 1f, 2f, 1f)
            horizontalLineToRelative(2.5f)
            curveToRelative(2.486f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.818f, -0.392f, -1.544f, -1f, -2f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.933f, -1.566f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
