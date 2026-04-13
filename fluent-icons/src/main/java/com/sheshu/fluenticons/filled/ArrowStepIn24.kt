package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepIn24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepIn24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(9.256f)
            lineToRelative(3.484f, -3.3f)
            curveToRelative(0.3f, -0.285f, 0.776f, -0.272f, 1.06f, 0.028f)
            curveToRelative(0.285f, 0.3f, 0.273f, 0.776f, -0.028f, 1.06f)
            lineToRelative(-4.75f, 4.5f)
            curveToRelative(-0.29f, 0.274f, -0.742f, 0.274f, -1.032f, 0f)
            lineToRelative(-4.75f, -4.5f)
            curveToRelative(-0.3f, -0.284f, -0.313f, -0.76f, -0.029f, -1.06f)
            curveToRelative(0.285f, -0.3f, 0.76f, -0.313f, 1.06f, -0.028f)
            lineToRelative(3.485f, 3.3f)
            verticalLineTo(2.75f)
            curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
            close()
            moveToRelative(3f, 17f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}
