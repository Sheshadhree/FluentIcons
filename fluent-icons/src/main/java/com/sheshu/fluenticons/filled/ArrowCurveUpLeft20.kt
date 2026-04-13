package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCurveUpLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCurveUpLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.03f, 7.03f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(4f, -4f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(4f, 4f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.72f, -2.72f)
            verticalLineToRelative(5.44f)
            curveToRelative(0f, 1.947f, 0.245f, 3.321f, 0.74f, 4.366f)
            curveToRelative(0.486f, 1.026f, 1.243f, 1.8f, 2.396f, 2.49f)
            curveToRelative(0.355f, 0.214f, 0.47f, 0.675f, 0.257f, 1.03f)
            curveToRelative(-0.213f, 0.355f, -0.674f, 0.47f, -1.029f, 0.257f)
            curveToRelative(-1.347f, -0.808f, -2.34f, -1.785f, -2.98f, -3.134f)
            curveToRelative(-0.63f, -1.33f, -0.884f, -2.956f, -0.884f, -5.009f)
            verticalLineTo(4.31f)
            lineTo(6.03f, 7.03f)
            close()
        }
    }.build()
}
