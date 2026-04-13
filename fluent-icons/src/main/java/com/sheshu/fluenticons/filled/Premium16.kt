package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Premium16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Premium16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2f)
            curveTo(3.473f, 2f, 3.219f, 2.153f, 3.088f, 2.397f)
            lineToRelative(-2f, 3.75f)
            curveTo(0.948f, 6.41f, 0.976f, 6.728f, 1.16f, 6.962f)
            lineToRelative(6.25f, 8f)
            curveTo(7.551f, 15.144f, 7.769f, 15.25f, 8f, 15.25f)
            curveToRelative(0.23f, 0f, 0.449f, -0.106f, 0.591f, -0.288f)
            lineToRelative(6.25f, -8f)
            curveToRelative(0.183f, -0.234f, 0.21f, -0.553f, 0.07f, -0.815f)
            lineToRelative(-2f, -3.75f)
            curveTo(12.782f, 2.153f, 12.528f, 2f, 12.25f, 2f)
            horizontalLineToRelative(-8.5f)
            close()
            moveTo(2.867f, 6f)
            lineTo(4.2f, 3.5f)
            horizontalLineToRelative(1.277f)
            lineTo(4.852f, 6f)
            horizontalLineTo(2.867f)
            close()
            moveToRelative(0.616f, 1.5f)
            horizontalLineToRelative(1.544f)
            lineToRelative(1.029f, 3.293f)
            lineTo(3.483f, 7.5f)
            close()
            moveToRelative(3.115f, 0f)
            horizontalLineToRelative(2.804f)
            lineTo(8f, 11.986f)
            lineTo(6.598f, 7.5f)
            close()
            moveToRelative(4.375f, 0f)
            horizontalLineToRelative(1.544f)
            lineToRelative(-2.573f, 3.293f)
            lineToRelative(1.03f, -3.293f)
            close()
            moveToRelative(2.16f, -1.5f)
            horizontalLineToRelative(-1.985f)
            lineToRelative(-0.625f, -2.5f)
            horizontalLineTo(11.8f)
            lineTo(13.133f, 6f)
            close()
            moveTo(9.602f, 6f)
            horizontalLineTo(6.398f)
            lineToRelative(0.625f, -2.5f)
            horizontalLineToRelative(1.954f)
            lineTo(9.602f, 6f)
            close()
        }
    }.build()
}
