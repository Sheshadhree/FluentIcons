package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowsBidirectional24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowsBidirectional24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.002f, 8.999f)
            horizontalLineTo(9.005f)
            verticalLineToRelative(-2.25f)
            curveToRelative(0f, -0.66f, -0.79f, -0.997f, -1.267f, -0.542f)
            lineToRelative(-5.504f, 5.25f)
            curveToRelative(-0.31f, 0.296f, -0.31f, 0.79f, 0f, 1.086f)
            lineToRelative(5.504f, 5.25f)
            lineToRelative(0.082f, 0.068f)
            curveToRelative(0.48f, 0.348f, 1.186f, 0.012f, 1.186f, -0.611f)
            lineTo(9.005f, 15f)
            horizontalLineToRelative(5.997f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.66f, 0.791f, 0.998f, 1.268f, 0.542f)
            lineToRelative(5.497f, -5.25f)
            curveToRelative(0.31f, -0.295f, 0.31f, -0.79f, 0f, -1.085f)
            lineToRelative(-5.497f, -5.25f)
            curveToRelative(-0.477f, -0.456f, -1.268f, -0.117f, -1.268f, 0.543f)
            verticalLineToRelative(2.249f)
            close()
        }
    }.build()
}
