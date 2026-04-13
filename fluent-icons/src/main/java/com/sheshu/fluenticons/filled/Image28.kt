package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Image28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Image28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.771f, -0.233f, 1.488f, -0.632f, 2.084f)
            lineToRelative(-8.97f, -8.767f)
            curveToRelative(-0.777f, -0.76f, -2.019f, -0.76f, -2.796f, 0f)
            lineToRelative(-8.97f, 8.767f)
            curveTo(3.232f, 22.738f, 3f, 22.02f, 3f, 21.25f)
            verticalLineTo(6.75f)
            close()
            moveToRelative(1.698f, 17.64f)
            curveTo(5.288f, 24.774f, 5.993f, 25f, 6.75f, 25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.757f, 0f, 1.462f, -0.225f, 2.052f, -0.61f)
            lineToRelative(-8.952f, -8.75f)
            curveToRelative(-0.195f, -0.19f, -0.505f, -0.19f, -0.7f, 0f)
            lineToRelative(-8.952f, 8.75f)
            close()
            moveTo(20.75f, 10f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            reflectiveCurveTo(16.25f, 8.757f, 16.25f, 10f)
            reflectiveCurveToRelative(1.007f, 2.25f, 2.25f, 2.25f)
            reflectiveCurveToRelative(2.25f, -1.007f, 2.25f, -2.25f)
            close()
        }
    }.build()
}
