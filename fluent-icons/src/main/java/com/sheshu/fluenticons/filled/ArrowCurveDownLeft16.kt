package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCurveDownLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCurveDownLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.151f, 1.378f)
            curveToRelative(0.206f, 0.36f, 0.08f, 0.818f, -0.279f, 1.023f)
            curveToRelative(-2.414f, 1.38f, -2.622f, 3.628f, -2.622f, 5.6f)
            verticalLineToRelative(4.438f)
            lineToRelative(2.22f, -2.22f)
            curveToRelative(0.293f, -0.292f, 0.767f, -0.292f, 1.06f, 0f)
            curveToRelative(0.293f, 0.294f, 0.293f, 0.769f, 0f, 1.061f)
            lineToRelative(-3.5f, 3.5f)
            curveTo(7.89f, 14.921f, 7.7f, 15f, 7.5f, 15f)
            reflectiveCurveToRelative(-0.39f, -0.079f, -0.53f, -0.22f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(2.22f, 2.22f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.029f, 0.192f, -5.08f, 3.378f, -6.901f)
            curveToRelative(0.36f, -0.206f, 0.818f, -0.08f, 1.023f, 0.279f)
            close()
        }
    }.build()
}
