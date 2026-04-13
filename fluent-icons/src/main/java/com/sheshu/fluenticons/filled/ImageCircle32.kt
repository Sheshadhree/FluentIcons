package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.228f, 26.529f)
            curveTo(22.764f, 28.689f, 19.535f, 30f, 16f, 30f)
            reflectiveCurveToRelative(-6.764f, -1.31f, -9.228f, -3.471f)
            lineToRelative(8.874f, -8.882f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineToRelative(8.874f, 8.882f)
            close()
            moveToRelative(1.406f, -1.423f)
            lineToRelative(-8.865f, -8.873f)
            curveToRelative(-0.977f, -0.977f, -2.561f, -0.977f, -3.538f, 0f)
            lineToRelative(-8.865f, 8.873f)
            curveTo(3.268f, 22.658f, 2f, 19.477f, 2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            curveToRelative(0f, 3.477f, -1.268f, 6.658f, -3.366f, 9.106f)
            close()
            moveTo(24f, 11.25f)
            curveTo(24f, 9.455f, 22.545f, 8f, 20.75f, 8f)
            reflectiveCurveToRelative(-3.25f, 1.455f, -3.25f, 3.25f)
            reflectiveCurveToRelative(1.455f, 3.25f, 3.25f, 3.25f)
            reflectiveCurveTo(24f, 13.045f, 24f, 11.25f)
            close()
        }
    }.build()
}
