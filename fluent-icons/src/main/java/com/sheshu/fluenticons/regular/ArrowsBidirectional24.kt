package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowsBidirectional24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowsBidirectional24",
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
            moveToRelative(-11.164f, 3f)
            lineToRelative(3.667f, -3.498f)
            verticalLineToRelative(1.248f)
            curveToRelative(0f, 0.415f, 0.337f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(7.497f)
            lineToRelative(0.102f, -0.007f)
            curveToRelative(0.366f, -0.05f, 0.648f, -0.363f, 0.648f, -0.743f)
            verticalLineTo(8.503f)
            lineTo(20.162f, 12f)
            lineToRelative(-3.66f, 3.496f)
            verticalLineTo(14.25f)
            curveToRelative(0f, -0.414f, -0.335f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(8.256f)
            lineToRelative(-0.102f, 0.007f)
            curveToRelative(-0.366f, 0.05f, -0.648f, 0.364f, -0.648f, 0.743f)
            lineToRelative(-0.001f, 1.248f)
            lineTo(3.838f, 12f)
            close()
        }
    }.build()
}
