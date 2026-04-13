package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepOut24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepOut24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.75f, 13.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.494f)
            lineToRelative(-3.484f, 3.3f)
            curveToRelative(-0.3f, 0.285f, -0.776f, 0.272f, -1.06f, -0.028f)
            curveToRelative(-0.285f, -0.3f, -0.272f, -0.776f, 0.028f, -1.06f)
            lineToRelative(4.75f, -4.5f)
            curveToRelative(0.29f, -0.274f, 0.742f, -0.274f, 1.032f, 0f)
            lineToRelative(4.75f, 4.5f)
            curveToRelative(0.3f, 0.284f, 0.313f, 0.76f, 0.029f, 1.06f)
            curveToRelative(-0.285f, 0.3f, -0.76f, 0.313f, -1.06f, 0.029f)
            lineTo(12.75f, 4.494f)
            verticalLineToRelative(9.256f)
            close()
            moveTo(15f, 19f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(-4.5f, 0f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            close()
        }
    }.build()
}
