package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentArrowLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentArrowLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            verticalLineToRelative(4.5f)
            curveTo(10f, 7.328f, 10.672f, 8f, 11.5f, 8f)
            horizontalLineTo(16f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(9.743f)
            curveTo(10.528f, 17.05f, 11f, 15.83f, 11f, 14.5f)
            curveTo(11f, 11.462f, 8.538f, 9f, 5.5f, 9f)
            curveTo(4.98f, 9f, 4.477f, 9.072f, 4f, 9.207f)
            verticalLineTo(3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(6.5f)
            curveTo(11f, 6.776f, 11.224f, 7f, 11.5f, 7f)
            horizontalLineToRelative(4.25f)
            lineTo(11f, 2.25f)
            close()
            moveTo(10f, 14.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(1f, 16.985f, 1f, 14.5f)
            reflectiveCurveTo(3.015f, 10f, 5.5f, 10f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-6.853f, -0.354f)
            lineToRelative(-0.003f, 0.003f)
            curveToRelative(-0.047f, 0.047f, -0.082f, 0.102f, -0.106f, 0.16f)
            curveTo(3.014f, 14.367f, 3f, 14.43f, 3f, 14.497f)
            verticalLineToRelative(0.006f)
            curveToRelative(0f, 0.067f, 0.014f, 0.13f, 0.038f, 0.188f)
            curveToRelative(0.024f, 0.06f, 0.06f, 0.115f, 0.109f, 0.163f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(4.707f, 15f)
            horizontalLineTo(7.5f)
            curveTo(7.776f, 15f, 8f, 14.776f, 8f, 14.5f)
            reflectiveCurveTo(7.776f, 14f, 7.5f, 14f)
            horizontalLineTo(4.707f)
            lineToRelative(1.147f, -1.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2f, 2f)
            close()
        }
    }.build()
}
