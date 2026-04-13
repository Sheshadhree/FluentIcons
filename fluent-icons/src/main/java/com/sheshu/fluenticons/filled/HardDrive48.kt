package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HardDrive48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDrive48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.117f, 9f)
            curveToRelative(-1.62f, 0f, -3.098f, 0.92f, -3.813f, 2.373f)
            lineTo(6.155f, 21.83f)
            curveToRelative(0.66f, -0.214f, 1.365f, -0.33f, 2.095f, -0.33f)
            horizontalLineToRelative(31.5f)
            curveToRelative(0.731f, 0f, 1.435f, 0.116f, 2.095f, 0.331f)
            lineToRelative(-5.149f, -10.458f)
            curveTo(35.981f, 9.92f, 34.502f, 9f, 32.883f, 9f)
            horizontalLineTo(15.117f)
            close()
            moveTo(4f, 28.25f)
            verticalLineToRelative(6.5f)
            curveTo(4f, 37.097f, 5.903f, 39f, 8.25f, 39f)
            horizontalLineToRelative(31.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -2.347f, -1.903f, -4.25f, -4.25f, -4.25f)
            horizontalLineTo(8.25f)
            curveTo(5.903f, 24f, 4f, 25.903f, 4f, 28.25f)
            close()
            moveToRelative(34.5f, 3.25f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}
