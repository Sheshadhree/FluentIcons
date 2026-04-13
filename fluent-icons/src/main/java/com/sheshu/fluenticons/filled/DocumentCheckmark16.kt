package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(9f, 5.328f, 9.672f, 6f, 10.5f, 6f)
            horizontalLineTo(14f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(8.663f)
            curveTo(10.077f, 14.005f, 11f, 12.36f, 11f, 10.5f)
            curveTo(11f, 7.462f, 8.538f, 5f, 5.5f, 5f)
            curveTo(4.98f, 5f, 4.477f, 5.072f, 4f, 5.207f)
            verticalLineTo(2.5f)
            curveTo(4f, 1.672f, 4.672f, 1f, 5.5f, 1f)
            horizontalLineTo(9f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(4.5f)
            curveTo(10f, 4.776f, 10.224f, 5f, 10.5f, 5f)
            horizontalLineToRelative(3.25f)
            lineTo(10f, 1.25f)
            close()
            moveToRelative(0f, 9.25f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(1f, 12.985f, 1f, 10.5f)
            reflectiveCurveTo(3.015f, 6f, 5.5f, 6f)
            reflectiveCurveTo(10f, 8.015f, 10f, 10.5f)
            close()
            moveTo(7.854f, 8.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(4.5f, 11.293f)
            lineToRelative(-0.647f, -0.647f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
