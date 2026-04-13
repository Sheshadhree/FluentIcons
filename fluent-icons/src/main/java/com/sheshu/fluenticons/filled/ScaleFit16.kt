package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ScaleFit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScaleFit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.998f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            close()
            moveToRelative(7.65f, 4.86f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(0.65f, -0.65f)
            horizontalLineTo(8.752f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            curveToRelative(0f, -0.277f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.542f)
            lineTo(9.65f, 6.857f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            close()
            moveTo(6.352f, 6.151f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            lineTo(5.71f, 7.5f)
            lineToRelative(1.54f, 0.001f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.225f, 0.5f, -0.5f, 0.5f)
            lineTo(5.7f, 8.498f)
            lineTo(6.352f, 9.15f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.512f, 0f, -0.707f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            close()
        }
    }.build()
}
