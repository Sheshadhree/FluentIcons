package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Power24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Power24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.204f, 4.82f)
            curveTo(8.58f, 4.646f, 9.026f, 4.809f, 9.201f, 5.184f)
            curveTo(9.376f, 5.56f, 9.213f, 6.005f, 8.838f, 6.18f)
            curveTo(6.214f, 7.403f, 4.5f, 10.042f, 4.5f, 12.991f)
            curveToRelative(0f, 4.148f, 3.358f, 7.51f, 7.499f, 7.51f)
            reflectiveCurveToRelative(7.499f, -3.362f, 7.499f, -7.51f)
            curveToRelative(0f, -2.943f, -1.707f, -5.577f, -4.323f, -6.804f)
            curveToRelative(-0.375f, -0.176f, -0.536f, -0.622f, -0.36f, -0.997f)
            curveToRelative(0.176f, -0.375f, 0.622f, -0.537f, 0.997f, -0.36f)
            curveToRelative(3.138f, 1.47f, 5.186f, 4.63f, 5.186f, 8.161f)
            curveToRelative(0f, 4.976f, -4.029f, 9.01f, -9f, 9.01f)
            curveTo(7.029f, 22f, 3f, 17.966f, 3f, 12.99f)
            curveToRelative(0f, -3.538f, 2.056f, -6.703f, 5.204f, -8.17f)
            close()
            moveTo(12f, 2.497f)
            curveToRelative(0.38f, 0f, 0.693f, 0.282f, 0.743f, 0.648f)
            lineToRelative(0.007f, 0.102f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineToRelative(-0.007f, -0.102f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
