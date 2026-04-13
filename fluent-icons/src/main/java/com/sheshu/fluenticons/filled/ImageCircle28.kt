package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveTo(7.373f, 2f, 2f, 7.373f, 2f, 14f)
            curveToRelative(0f, 3.052f, 1.14f, 5.838f, 3.016f, 7.956f)
            lineToRelative(7.588f, -7.4f)
            curveToRelative(0.777f, -0.757f, 2.016f, -0.757f, 2.792f, 0f)
            lineToRelative(7.588f, 7.4f)
            curveTo(24.861f, 19.838f, 26f, 17.052f, 26f, 14f)
            curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
            close()
            moveToRelative(7.921f, 21.014f)
            lineToRelative(-7.572f, -7.383f)
            curveToRelative(-0.194f, -0.19f, -0.504f, -0.19f, -0.698f, 0f)
            lineToRelative(-7.572f, 7.383f)
            curveTo(8.192f, 24.873f, 10.964f, 26f, 14f, 26f)
            curveToRelative(3.035f, 0f, 5.808f, -1.127f, 7.921f, -2.986f)
            close()
            moveTo(20.5f, 9.75f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            reflectiveCurveTo(16f, 10.993f, 16f, 9.75f)
            reflectiveCurveToRelative(1.007f, -2.25f, 2.25f, -2.25f)
            reflectiveCurveToRelative(2.25f, 1.007f, 2.25f, 2.25f)
            close()
        }
    }.build()
}
