package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowStepInLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepInLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.294f, 16.234f)
            curveToRelative(0.285f, 0.3f, 0.272f, 0.776f, -0.028f, 1.06f)
            curveToRelative(-0.3f, 0.285f, -0.776f, 0.273f, -1.06f, -0.028f)
            lineToRelative(-4.5f, -4.75f)
            curveToRelative(-0.274f, -0.29f, -0.274f, -0.742f, 0f, -1.032f)
            lineToRelative(4.5f, -4.75f)
            curveToRelative(0.284f, -0.3f, 0.76f, -0.313f, 1.06f, -0.029f)
            curveToRelative(0.3f, 0.285f, 0.313f, 0.76f, 0.028f, 1.06f)
            lineToRelative(-3.3f, 3.485f)
            horizontalLineToRelative(9.256f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-9.256f)
            lineToRelative(3.3f, 3.484f)
            close()
            moveTo(2f, 12f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
        }
    }.build()
}
